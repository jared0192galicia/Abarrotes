/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 27 / Jun / 2023
 * Descripcion: Class for gestion of the code of security
 */
package edu.unsis.utilities;

public class MatchForMail {

    private static String code = "";

    /**
     * Generate new code and save in var static
     *
     * @return
     */
    public static String generateCode() {
        int aux;

        for (int i = 0; i < 6; i++) {
            aux = (int) (Math.random() * 10);
            MatchForMail.code += String.valueOf(aux);
        }

        return MatchForMail.code;
    }

    /**
     * Change code in static var
     */
    public static void updateCode() {

        MatchForMail.deleteCode();

        int aux;

        for (int i = 0; i < 6; i++) {
            aux = (int) (Math.random() * 10);
            MatchForMail.code += String.valueOf(aux);
        }
    }

    /**
     * Reset code
     */
    public static void deleteCode() {
        MatchForMail.code = "";
    }

    /**
     * comapre code with parameter of input
     *
     * @param code code to compare
     * @return true if are equals or false otherwise
     */
    public static boolean compareTo(String code) {
        return MatchForMail.code.equals(code);
    }
}
