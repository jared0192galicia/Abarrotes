/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 13 / Jun / 2023
 * Descripcion: Controlador para ventana de recuperación de contrsaeña
 */
package edu.unsis.controller;

import edu.unsis.model.IUserModel;
import edu.unsis.model.UserModelImpl;

public class RecoverAccesController {
    
    IUserModel model = new UserModelImpl();
    
    public boolean existEmail(String email) {
        return model.search(email);
    }
}
