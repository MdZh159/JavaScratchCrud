package Service;

import Données.IEnseignatDAO;
import Données.IEnseignatDAOImpl;
import Entities.Enseignant;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class EnseignantService {
    private IEnseignatDAO enseignatDAO = new IEnseignatDAOImpl();

    @WebMethod
    public Enseignant getEnseignantByCni(int cni) {
        return enseignatDAO.getEnseignant(cni);
    }

    @WebMethod
    public Enseignant createEnseignant(Enseignant enseignant){
        Enseignant e = new Enseignant();
        e.setCni(enseignant.getCni());
        e.setNom(enseignant.getNom());
        e.setPrenom(enseignant.getPrenom());
        e.setAge(enseignant.getAge());
        e.setAdresse(enseignant.getAdresse());
        e.setVille(enseignant.getVille());
        e.setSexe(enseignant.getSexe());
        e.setPhoto(enseignant.getPhoto());

        enseignatDAO.save(e);
        return e ;
    }

    @WebMethod
    public Enseignant updateEnseignant(Enseignant enseignant){
        Enseignant e = new Enseignant();
        e.setCni(enseignant.getCni());
        e.setNom(enseignant.getNom());
        e.setPrenom(enseignant.getPrenom());
        e.setAge(enseignant.getAge());
        e.setAdresse(enseignant.getAdresse());
        e.setVille(enseignant.getVille());
        e.setSexe(enseignant.getSexe());
        e.setPhoto(enseignant.getPhoto());

        enseignatDAO.update(e);
        return e ;
    }

    @WebMethod
    public void deleteEnseignant(int cni){
        enseignatDAO.delete(cni);
    }
}
