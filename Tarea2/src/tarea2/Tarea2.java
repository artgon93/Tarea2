/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Jagz
 */
public class Tarea2 {

    
    public static String invertir (String cadena){
        String resp= "";
        for(int i = cadena.length()-1; i>=0;i--){
            resp = resp + cadena.charAt(i);
        }
        return resp;
    }
    
    public static int posicion(String palabra, char letra){
        int resp=0;
        for(int i = palabra.length()-1; i>=0;i--){
            char letraP = palabra.charAt(i);
            if(letra == letraP)){
                return i;
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(invertir("casa"));
    }
    
}
