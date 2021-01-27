package web;

import Données.IEnseignatDAO;
import Données.IEnseignatDAOImpl;
import Données.IModuleDAO;
import Données.IModuleDAOImpl;
import Entities.Enseignant;
import Entities.Module;
import com.sun.org.apache.xpath.internal.operations.Mod;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "cs",urlPatterns = {"*.do"})
public class ControleurServlet extends HttpServlet {
    private IEnseignatDAO metier ;
    private IModuleDAO metier2 ;

    @Override
    public void init() throws ServletException {
        metier = new IEnseignatDAOImpl();
        metier2 = new IModuleDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        if (path.equals("/index.do")){
            req.getRequestDispatcher("enseignants.jsp").forward(req,resp);
        } else if (path.equals("/chercher.do")){
            String motCle = req.getParameter("motCle");
            EnseignantModel model = new EnseignantModel();
            ModuleModel model2 = new ModuleModel();
            model.setMotCle(motCle);
            model2.setMotCle(motCle);
            List<Enseignant> enseignants = metier.enseignantParMc("%"+motCle+"%");
            List<Module> modules = metier2.moduleParMc("%"+motCle+"%");
            model.setEnseignants(enseignants);
            model2.setModules(modules);
            req.setAttribute("model",model);
            req.setAttribute("model2",model2);
            req.getRequestDispatcher("enseignants.jsp").forward(req,resp);
        } else if (path.equals("/Saisie.do")) {
            req.getRequestDispatcher("SaisieEnseignant.jsp").forward(req, resp);
        } else  if (path.equals("/Saisie2.do")) {
            req.getRequestDispatcher("SaisieModule.jsp").forward(req, resp);
        } else if (path.equals("/SaveEnseignant.do") && req.getMethod().equals("POST")) {
            int cni = Integer.parseInt(req.getParameter("cni"));
            String nom = req.getParameter("nom");
            String prenom = req.getParameter("prenom");
            int age = Integer.parseInt(req.getParameter("age"));
            String adresse = req.getParameter("adresse");
            String ville = req.getParameter("ville");
            String sexe = req.getParameter("sexe");
            String photo = req.getParameter("photo");
            Enseignant e = metier.save(new Enseignant(cni,nom,prenom,age,adresse,ville,sexe,photo));
            req.setAttribute("enseignant",e);
            req.getRequestDispatcher("Confirmation.jsp").forward(req,resp);
        } else if (path.equals("/SaveModule.do") && req.getMethod().equals("POST")) {
            int id = Integer.parseInt(req.getParameter("id"));
            String nom = req.getParameter("nom");
            int nbCours = Integer.parseInt(req.getParameter("nbrCours"));
            int nbHeures = Integer.parseInt(req.getParameter("nbrHeures"));
            int profId = Integer.parseInt(req.getParameter("profId"));
            Module m = metier2.save(new Module(id,nom,nbCours,nbHeures,profId));
            req.setAttribute("module",m);
            req.getRequestDispatcher("Confirmation2.jsp").forward(req,resp);
        } else if (path.equals("/Supprimer.do")) {
            int cni = Integer.parseInt(req.getParameter("cni"));
            metier.delete(cni);
            resp.sendRedirect("chercher.do?motcle=");
        } else if (path.equals("/Supprimer2.do")) {
            int id = Integer.parseInt(req.getParameter("id"));
            metier2.delete(id);
            resp.sendRedirect("chercher.do?motcle=");
        }
        else if (path.equals("/Modifier.do")) {
            int cni = Integer.parseInt(req.getParameter("cni"));
            Enseignant e= metier.getEnseignant(cni);
            req.setAttribute("enseignant",e);
            req.getRequestDispatcher("EditEnseignant.jsp").forward(req,resp);
        } else if (path.equals("/Modifier2.do")) {
            int id = Integer.parseInt(req.getParameter("id"));
            Module m = metier2.getModule(id);
            req.setAttribute("module",m);
            req.getRequestDispatcher("EditModule.jsp").forward(req,resp);
        } else if (path.equals("/UpdateModule.do") && req.getMethod().equals("POST")) {
            int id =Integer.parseInt(req.getParameter("id"));
            String nom = req.getParameter("nom");
            int nbCours = Integer.parseInt(req.getParameter("nbCours"));
            int nbHeures = Integer.parseInt(req.getParameter("nbHeures"));
            int profId = Integer.parseInt(req.getParameter("profId"));
            Module m = new Module(id,nom,nbCours,nbHeures,profId);
            m.setId(id);
            metier2.update(m);
            req.setAttribute("module", m);
            req.getRequestDispatcher("Confirmation2.jsp").forward(req, resp);
        } else if (path.equals("/UpdateEnseignant.do") && req.getMethod().equals("POST")) {
            int cni=Integer.parseInt(req.getParameter("cni"));
            String nom = req.getParameter("nom");
            String prenom = req.getParameter("prenom");
            int age = Integer.parseInt(req.getParameter("age"));
            String adresse = req.getParameter("adresse");
            String ville = req.getParameter("ville");
            String sexe = req.getParameter("sexe");
            String photo = req.getParameter("photo");

            Enseignant e = new Enseignant(cni, nom, prenom, age, adresse, ville, sexe,photo);
            e.setCni(cni);
            metier.update(e);
            req.setAttribute("enseignant", e);
            req.getRequestDispatcher("Confirmation.jsp").forward(req, resp);
        } else {
            resp.sendError(404);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
