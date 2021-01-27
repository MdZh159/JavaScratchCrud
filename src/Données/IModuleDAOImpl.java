package Données;

import Entities.Enseignant;
import Entities.Module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IModuleDAOImpl implements IModuleDAO {
    @Override
    public Module save(Module m) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("INSERT INTO modules (ID,Nom,NbCours,NbHeures,profID) VALUES (?,?,?,?,?)");
            ps.setInt(1,m.getId());
            ps.setString(2,m.getNom());
            ps.setInt(3,m.getNbCours());
            ps.setInt(4,m.getNbHeures());
            ps.setInt(5,m.getProfId());
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m ;
    }

    @Override
    public List<Module> moduleParMc(String mc) {

        List<Module>  modules = new ArrayList<Module>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM modules WHERE Nom LIKE ?");
            ps.setString(1,mc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Module m = new Module();
                m.setId(rs.getInt("ID"));
                m.setNom(rs.getString("Nom"));
                m.setNbCours(rs.getInt("NbCours"));
                m.setNbHeures(rs.getInt("NbHeures"));
                m.setProfId(rs.getInt("profID"));
                modules.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  modules ;
    }

    @Override
    public Module getModule(int id) {
        Module e = null ;
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("SELECT * FROM modules WHERE ID=?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e = new Module();
                e.setId(rs.getInt("ID"));
                e.setNom(rs.getString("Nom"));
                e.setNbCours(rs.getInt("NbCours"));
                e.setNbHeures(rs.getInt("NbHeures"));
                e.setProfId(rs.getInt("profID"));


            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  e ;
    }

    @Override
    public Module update(Module m) {

        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("UPDATE modules SET ID=?,Nom=?,NbCours=?,NbHeures=?,profID=? WHERE ID=?");
            ps.setInt(1,m.getId());
            ps.setString(2,m.getNom());
            ps.setInt(3,m.getNbCours());
            ps.setInt(4,m.getNbHeures());
            ps.setInt(5,m.getProfId());
            ps.setInt(6,m.getId());
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m ;
    }

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement
                    ("DELETE FROM modules WHERE ID=?");
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
