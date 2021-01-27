package Données;

import Entities.Enseignant;
import Entities.Module;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        //IEnseignatDAO dao = new IEnseignatDAOImpl();
        IModuleDAO dao2 = new IModuleDAOImpl();
        //Enseignant p1 = dao.save(new Enseignant(1,"Rachid","Berkane",36,"Fes-MA","FES","male","url-photo-rachid"));
        //Module m1 = dao2.save(new Module(1,"Informatique",6,35,1));
        //System.out.println(p1.toString());
        //System.out.println("Chercher des produit");
        //List<Etudiant> etudiants = dao.etudiantsParMc("Rachid");
        //for (Etudiant e :etudiants){
          //  System.out.println(e.toString());
        //}
    }
}
