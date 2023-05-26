/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25/may/2023
 * modificado 25/may/2023
 * Descripcion: Obj for credentials of the acces
 */
package edu.unsis.model;

/**
 *
 * @author elietzer
 */
public class Credentials {
    private String password;
    private String user;

    public Credentials() {}

    public Credentials(String password, String user) {
        this.password = password;
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Credentials{" + "password=" + password + ", user=" + user + '}';
    }
    
    
}
