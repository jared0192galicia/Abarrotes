/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / Jun / 2023
 * modificado 29 / Jun / 2023
 * Descripcion: Controlar temporizador y mostrar en label
 */
package edu.unsis.controller;

import edu.unsis.utilities.MatchForMail;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ThreadTimer extends Thread {

    private JLabel showTimer;

    /**
     * Create a new object
     */
    public ThreadTimer() {}

    /**
     * Create a new object with all properties
     * @param showTimer 
     */
    public ThreadTimer(JLabel showTimer) {
        this.showTimer = showTimer;
    }
    
    /**
     * Coount 1 minute and show for seconds
     */
    @Override
    public void run() {
        for (int i = 60; i >= 0; i--) {
            showTimer.setText("Código valido durante " + i + " Seg");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        MatchForMail.updateCode();
    }

    public JLabel getShowTimer() {
        return showTimer;
    }

    public void setShowTimer(JLabel showTimer) {
        this.showTimer = showTimer;
    }
    
    
}
