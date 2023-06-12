/**
 * Autor: GaliciaCordova Elietzer Jared
 * Creado el: 25 / May / 2023
 * modificado: 11 / Jun / 2023
 * Descipciòn: Clase que implementa a la interfaz IUserDAO
 */
package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;
import edu.unsis.utilities.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserDAOImpl implements IUserDAO {

    /**
     * Search match in data base of users with the data in credentials
     *
     * @param credentials data of the acces
     * @param user Obj for load data of the user found
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean acces(Credentials credentials, User user) {
        Connection cn = Conexion.getConnction();
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
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Mysql", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * List all users in Array List and returned
     *
     * @return ArrayList with all users
     */
    @Override
    public ArrayList<User> listAll() {

        ArrayList<User> users = new ArrayList<>();

        Connection cn = Conexion.getConnction();

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
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Mysql", JOptionPane.ERROR_MESSAGE);
        }

        return users;
    }

    /**
     * Create a new row in database with object obj en table Users
     *
     * @param obj User for the register in data base
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean create(User obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

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
            return false;
        }
    }

    /**
     * Delete user from data base
     *
     * @param obj User for the delete in data base
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean delete(User obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement(
                    "DELETE FROM users WHERE userName='"
                    + obj.getUserName() + "'");

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {

            return false;
        }
    }

    /**
     * Update user obj in data base. Search for userName or Email, needed update
     * a one field for call this funtion for to locate row.
     * @param obj User for the update in data base
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean update(User obj) {
        PreparedStatement pst;
        Connection cn = Conexion.getConnction();

        try {

            pst = cn.prepareStatement(
                    "UPDATE users SET userName = ?, pass = AES_ENCRYPT(?, \"root\"),"
                    + "	email = ?, nameU = ?, statusU = ?, age = ?, sex = ?,"
                    + "levelU = ? WHERE userName = '" + obj.getUserName()
                    + "' OR email = '" + obj.getEmail() + "'");

            pst.setString(1, obj.getUserName());
            pst.setString(2, obj.getPassword());
            pst.setString(3, obj.getEmail());
            pst.setString(4, obj.getName());
            pst.setBoolean(5, obj.isStatus());
            pst.setInt(6, obj.getEdad());
            pst.setString(7, String.valueOf(obj.getSexo()));
            pst.setInt(8, obj.getLevel());

            pst.executeUpdate();

        } catch (SQLException e) {
            return false;
        }

        return true;
    }

}
