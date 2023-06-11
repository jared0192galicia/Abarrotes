/**
 * Autor: GaliciaCordova Elietzer Jared
 * Creado el: 27 / May / 2023
 * modificado: 2 / Jun / 2023
 * Descipciòn: Clase que implementa a la interfaz IUserDAO
 */
package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;
import edu.unsis.utilities.ConexionImpl;
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
        Connection cn = ConexionImpl.getConnction();
        PreparedStatement pst;

        try {
            pst = (PreparedStatement) cn.prepareStatement(
                    "SELECT email, sex, CONVERT(AES_DECRYPT(pass, \"root\") "
                    + "USING UTF8) as pass, nameU, statusU, age, levelU"
                    + " FROM users WHERE userName = '" + credentials.getUser()
                    + "'");

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

        ArrayList<User> users = new ArrayList<>();

        Connection cn = ConexionImpl.getConnction();

        try {
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT userName, email, sex, "
                    + "CONVERT(AES_DECRYPT(pass, \"root\") USING UTF8) AS pass,"
                    + "  nameU, statusU, age, levelU FROM users");

            ResultSet rs = pst.executeQuery();

            User user;

            // Save data from object ResultSet
            while (rs.next()) {

                user = new User();
                user.setEdad(rs.getInt("age"));
                user.setEmail(rs.getString("email"));
                user.setLevel(rs.getInt("levelU"));
                user.setName(rs.getString("nameU"));
                user.setPassword(rs.getString("pass"));
                user.setSexo(rs.getString("sex").charAt(0));
                user.setStatus(rs.getBoolean("statusU"));
                user.setUserName(rs.getString("userName"));

                users.add(user);
            }
        } catch (NumberFormatException | SQLException e) {
            System.err.println("Error on query\n" + e.getMessage());
        }

        return users;
    }

    @Override
    public boolean create(User obj) {
        Connection cn = ConexionImpl.getConnction();
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
        Connection cn = ConexionImpl.getConnction();
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
        PreparedStatement pst;
        Connection cn = ConexionImpl.getConnction();

        try {

            pst = cn.prepareStatement(
                    "UPDATE users SET pass = aes_encrypt(\"root\", \"1234\"),"
                    + "	email = ?, nameU = ?, statusU = ?, age = ?, sex = ?,"
                    + "levelU = ? where userName = 'root' or email = ");

            pst.setString(1, p.getName());
            pst.setString(2, p.getModelo());
            pst.setString(3, p.getMarca());
            pst.setDouble(4, p.getPrice());
            pst.setInt(5, p.getExistencia());
            pst.setString(6, p.getDescription());
            pst.setString(7, p.getExpired());

            pst.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error en update \n" + e.getMessage());
        }

        return true;
    }

}
