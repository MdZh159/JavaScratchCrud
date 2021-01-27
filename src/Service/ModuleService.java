package Service;

import Données.IEnseignatDAO;
import Données.IEnseignatDAOImpl;
import Données.IModuleDAO;
import Données.IModuleDAOImpl;
import Entities.Enseignant;
import Entities.Module;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class ModuleService {
    private IModuleDAO moduleDAO = new IModuleDAOImpl();

    @WebMethod
    public Module getModuleById(int id) {
        return moduleDAO.getModule(id);
    }

    @WebMethod
    public Module createModule(Module module){
        Module e = new Module();
        e.setId(module.getId());
        e.setNom(module.getNom());
        e.setNbCours(module.getNbCours());
        e.setNbHeures(module.getNbHeures());
        e.setProfId(module.getProfId());
        moduleDAO.save(e);
        return e ;
    }

    @WebMethod
    public Module updateModule(Module module){
        Module e = new Module();
        e.setId(module.getId());
        e.setNom(module.getNom());
        e.setNbCours(module.getNbCours());
        e.setNbHeures(module.getNbHeures());
        e.setProfId(module.getProfId());
        moduleDAO.update(e);
        return e ;
    }

    @WebMethod
    public void deleteModule(int id){
        moduleDAO.delete(id);
    }
}
