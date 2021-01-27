package Données;

import Entities.Enseignant;

import java.util.List;

public interface IEnseignatDAO {
    public Enseignant save(Enseignant e);
    public List<Enseignant> enseignantParMc(String mc);
    public Enseignant getEnseignant(int cni);
    public Enseignant update(Enseignant e);
    public void delete(int cni);
}
