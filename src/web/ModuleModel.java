package web;

import Entities.Module;

import java.util.ArrayList;
import java.util.List;

public class ModuleModel {
    private String motCle ;
    private List<Module> modules = new ArrayList<Module>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
