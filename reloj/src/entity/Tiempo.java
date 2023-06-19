package entity;

/**
 *
 * @author labtecweb10
 */
public class Tiempo {
    private  int seg;
    private int hora;
    private int min;

    public Tiempo() {}

    public Tiempo(int seg, int hora, int min) {
        this.seg = seg;
        this.hora = hora;
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    
}
