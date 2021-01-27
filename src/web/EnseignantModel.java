package web;

import Entities.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class EnseignantModel {
    private String motCle ;
    private List<Enseignant> enseignants = new ArrayList<Enseignant>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(List<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
}
