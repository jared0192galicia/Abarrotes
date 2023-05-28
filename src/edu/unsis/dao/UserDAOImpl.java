package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;
import edu.unsis.service.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class UserDAOImpl implements IUserDAO {

    @Override
    public boolean acces(Credentials credentials, User user) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = (PreparedStatement) cn.prepareStatement(
                    "SELECT email, sex, pass, nameU, statusU, age, levelU,"
                    + " CONVERT(AES_DECRYPT(pass, \"root\") USING UTF8)"
                    + " FROM users WHERE userName = '" + credentials.getUser() + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                user.setEdad(rs.getInt("age"));
                user.setLevel(rs.getInt("levelU"));
                user.setName(rs.getString("nameU"));
                user.setPassword(rs.getString("pass"));
                user.setSexo(rs.getString("sex").charAt(0));
                user.setUserName(credentials.getUser());
                user.setEmail(rs.getString("email"));
                user.setStatus(rs.getBoolean("statusU"));
            }

        } catch (SQLException e) {

            System.err.println("Error in \n" + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<User> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(User obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;
        System.out.println("in method");

        String aux = "0";
        if (obj.isStatus()) {
            aux = "1";
        }

        try {
            pst = cn.prepareStatement(
                    "INSERT INTO users VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?)");

            // Set data to query
            pst.setString(1, obj.getUserName());
            pst.setString(2, obj.getPassword());
            pst.setString(3, obj.getEmail());
            pst.setString(4, obj.getName());
            pst.setString(5, aux);
            pst.setString(6, String.valueOf(obj.getEdad()));
            pst.setString(7, String.valueOf(obj.getSexo()));
            pst.setString(8, String.valueOf(obj.getLevel()));

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("Error in register user" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(User obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement(
                    "DELETE FROM products WHERE codes='"
                    + obj.getUserName() + "'");

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {

            System.err.println("Error to delete\n" + e.getMessage());

            return false;
        }
    }

    @Override
    public boolean update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
