/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Clase padre para usuarios
 */
package edu.unsis.model.entity;

/**
 *
 * @author elietzer
 */
public abstract class People {
    private String name;
    private int edad;
    private char sexo;

    public People() {}
    
    /**
     * @param name
     * @param edad
     * @param sexo 
     */
    public People(String name, int edad, char sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
