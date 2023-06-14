package edu.unsis.utilities;

public class MatchForMail {
    
    private static String code = "";
    
    public static String generateCode() {
        
        int aux;
        
        for (int i = 0; i < 6; i++) {
            aux = (int) (Math.random() * 10);
            MatchForMail.code += String.valueOf(aux);
        }
        
        return MatchForMail.code;
    }
    
    public static String updateCode() {
        int aux;
        
        for (int i = 0; i < 6; i++) {
            aux = (int) (Math.random() * 10);
            MatchForMail.code += String.valueOf(aux);
        }
        
        return MatchForMail.code;
        
    }
    
    public static void deleteCode() {
        MatchForMail.code = "";
    }
    
    public static boolean compareTo(String code) {
        return MatchForMail.code.equals(code);
    }
}
