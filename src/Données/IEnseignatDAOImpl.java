package Données;

import Entities.Enseignant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IEnseignatDAOImpl implements IEnseignatDAO {
    @Override
    public Enseignant save(Enseignant e) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("INSERT INTO enseignants (CNI,Nom,Prénom,Age,Adresse,Ville,Sexe,Photo) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1,e.getCni());
            ps.setString(2,e.getNom());
            ps.setString(3,e.getPrenom());
            ps.setInt(4,e.getAge());
            ps.setString(5,e.getAdresse());
            ps.setString(6,e.getVille());
            ps.setString(7,e.getSexe());
            ps.setString(8,e.getPhoto());
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e ;
    }

    @Override
    public List<Enseignant> enseignantParMc(String mc) {

        List<Enseignant>  enseignants = new ArrayList<Enseignant>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM enseignants WHERE Nom LIKE ?");
            ps.setString(1,mc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Enseignant e = new Enseignant();
                e.setCni(rs.getInt("CNI"));
                e.setNom(rs.getString("Nom"));
                e.setPrenom(rs.getString("Prénom"));
                e.setAge(rs.getInt("Age"));
                e.setAdresse(rs.getString("Adresse"));
                e.setVille(rs.getString("Ville"));
                e.setSexe(rs.getString("Sexe"));
                e.setPhoto(rs.getString("Photo"));
                enseignants.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  enseignants ;
    }

    @Override
    public Enseignant getEnseignant(int cni) {

        Enseignant e = null ;
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM enseignants WHERE CNI=?");
            ps.setInt(1,cni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e = new Enseignant();
                e.setCni(rs.getInt("CNI"));
                e.setNom(rs.getString("Nom"));
                e.setPrenom(rs.getString("Prénom"));
                e.setAge(rs.getInt("Age"));
                e.setAdresse(rs.getString("Adresse"));
                e.setVille(rs.getString("Ville"));
                e.setSexe(rs.getString("Sexe"));
                e.setPhoto(rs.getString("Photo"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  e ;
    }

    @Override
    public Enseignant update(Enseignant e) {

        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("UPDATE enseignants SET CNI=?,Nom=?,Prénom=?,Age=?,Adresse=?,Ville=?,Sexe=?,Photo=? WHERE CNI=?");
            ps.setInt(1,e.getCni());
            ps.setString(2,e.getNom());
            ps.setString(3,e.getPrenom());
            ps.setInt(4,e.getAge());
            ps.setString(5,e.getAdresse());
            ps.setString(6,e.getVille());
            ps.setString(7,e.getSexe());
            ps.setString(8,e.getPhoto());
            ps.setInt(9,e.getCni());
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e ;
    }

    @Override
    public void delete(int cni) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("DELETE FROM enseignants WHERE CNI=?");
            ps.setInt(1,cni);
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
