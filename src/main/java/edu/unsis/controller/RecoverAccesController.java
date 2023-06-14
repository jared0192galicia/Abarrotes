/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 13 / Jun / 2023
 * Descripcion: Controlador para ventana de recuperación de contrsaeña
 */
package edu.unsis.controller;

import edu.unsis.model.IUserModel;
import edu.unsis.model.UserModelImpl;
import javax.swing.JLabel;

public class RecoverAccesController {

    IUserModel model = new UserModelImpl();
    ThreadTimer timer = new ThreadTimer();

    public boolean existEmail(String email) {
        return model.search(email);
    }

    public void startTime(JLabel labelTime) {
        timer.setShowTimer(labelTime);
        timer.start();
    }
    
    public void stopTime() {
        timer.stop();
    }

    public void updatePassword(String mail, String pass) {
        model.update(mail, pass);
    }
}
