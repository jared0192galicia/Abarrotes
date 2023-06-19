/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author labtecweb10
 */
public class Hilo extends Thread {

    private final javax.swing.JLabel labHora;
    private final javax.swing.JLabel labMin;
    private final javax.swing.JLabel labSeg;

    public Hilo(JLabel labHora, JLabel labMin, JLabel labSeg) {
        this.labHora = labHora;
        this.labMin = labMin;
        this.labSeg = labSeg;
    }

    @Override
    public void run() {
        int s = 0;
        int m = 0;
        int h = 0;

        while (true) {
            labHora.setText(String.valueOf(h));
            labMin.setText(String.valueOf(m));
            labSeg.setText(String.valueOf(s));

            s++;
            if (s == 59) {
                s = 0;
                m++;
                if (m == 59) {
                    h++;
                    m = 0;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojInter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
