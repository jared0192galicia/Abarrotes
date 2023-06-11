/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Objeto usuario
 */
package edu.unsis.model.entity;

public class User extends People {
    
    private String userName;
    private String password;
    private String email;
    private int level;
    private boolean status;

    public User() {}

    /**
     * @param userName
     * @param password
     * @param email
     * @param level
     * @param status 
     */
    public User(String userName, String password, String email, int level, boolean status) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.level = level;
        this.status = status;
    }

    /**
     * Usa este
     * @param userName
     * @param password
     * @param email
     * @param level
     * @param status
     * @param name
     * @param edad
     * @param sexo 
     */
    public User(String userName, String password, String email, int level,
            boolean status, String name, int edad, char sexo) {
        super(name, edad, sexo);
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.level = level;
        this.status = status;
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean compareTo(User u) {
        return u.toString().equals(this.toString());
    }
    
    @Override
    public String toString() {
        return super.toString() + "User{" + "userName=" + userName + ", password=" + password + 
        ", email=" + email + ", level=" + level + ", status=" + status + '}';
    }

    
    
}
