package edu.unsis.controller;

import edu.unsis.utilities.MatchForMail;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ThreadTimer extends Thread {

    JLabel showTimer;

    public ThreadTimer() {}

    
    public ThreadTimer(JLabel showTimer) {
        this.showTimer = showTimer;
    }
    
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
