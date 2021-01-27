package Données;

import Entities.Enseignant;
import Entities.Module;

import java.util.List;

public interface IModuleDAO {
    public Module save(Module m);
    public List<Module> moduleParMc(String mc);
    public Module getModule(int id);
    public Module update(Module m);
    public void delete(int id);
}
