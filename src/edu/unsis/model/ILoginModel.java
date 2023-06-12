/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Interfaz del modelo para la ventana Login
 */
package edu.unsis.model;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public interface ILoginModel {
    
    /**
     * Method for search user with data = credentials
     * @param credentials data of the acces
     * @param user Obj to load the data
     * @return status of the operation
     */
    public boolean search(Credentials credentials, User user);
}
