package edu.unsis.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection cn = null;

    public static Connection getConnction() {

        if (cn == null) {

            String user = "root";
            String pass = "DMR003QP10·a";
            String root = "127.0.0.1";

            try {
                cn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/abarrotes_db", user, pass);

            } catch (SQLException e) {
                System.err.println("Error in get connection\n\n" + e.getMessage());
            }
        }

        return cn;
    }
}
