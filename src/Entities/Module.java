package Entities;

public class Module {
    private int id ;
    private String nom ;
    private int nbCours ;
    private int nbHeures ;
    private int profId ;

    public Module() {
    }

    public Module(int id, String nom, int nbCours, int nbHeures, int profId) {
        this.id = id;
        this.nom = nom;
        this.nbCours = nbCours;
        this.nbHeures = nbHeures;
        this.profId = profId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbCours() {
        return nbCours;
    }

    public void setNbCours(int nbCours) {
        this.nbCours = nbCours;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbCours=" + nbCours +
                ", nbHeures=" + nbHeures +
                ", profId=" + profId +
                '}';
    }
}
