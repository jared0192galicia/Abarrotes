package edu.unsis.abarrotes;

import edu.unsis.view.Login;

public class Abarrotes {
    
    private static final Login login = new Login();
    
    /**
     * Main method of the project
     * @param args 
     */
    public static void main(String[] args) {
        login.setVisible(true);
    }

    public static Login getLogin() {
        return login;
    }
}
