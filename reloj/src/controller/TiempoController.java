package controller;

import entity.Tiempo;

public class TiempoController implements Runnable {
    
    private final Tiempo tiempo;
    
    public TiempoController(Tiempo tiempo) {
        this.tiempo = tiempo;
    }
    
    public void iniciar() {
        if (this.tiempo.getSeg() == 59) {
            if (this.tiempo.getMin() == 59) {
                this.tiempo.setMin(0);
            this.tiempo.setHora(this.tiempo.getHora() + 1);
            }
            this.tiempo.setSeg(0);
            this.tiempo.setMin(this.tiempo.getMin() + 1);
        }
        this.tiempo.setSeg(this.tiempo.getSeg() + 1);
        System.out.println(this.tiempo.getHora() + " : " + this.tiempo.getMin() + " : " + this.tiempo.getSeg());
        
    }
    
    public void detener() {
        
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            this.iniciar();
        }
    }
    
    public static void main(String[] args) {
        Tiempo t = new Tiempo();
        TiempoController tc = new TiempoController(t);

        // Hilo
        Thread hilo = new Thread(tc);
        hilo.start();
        
    }
}
