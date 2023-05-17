package model.entity;

public class User {
    
    private String userName;
    private String password;
    private String email;
    private String name;
    private int level;
    private boolean status;

    public User() {}

    public User(String userName, String password, String email, String name, int level, boolean status) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", password=" + password + ", email=" + email + ", name=" + name + ", level=" + level + ", status=" + status + '}';
    }
}
