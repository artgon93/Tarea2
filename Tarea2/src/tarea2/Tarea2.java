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
        int resp =-1;
        for(int i = 0; i<=palabra.length()-1;i++){
            char letraP = palabra.charAt(i);
            if(letra==letraP){
                resp = i+1;
            }
        }
        return resp;
    }

    public static int comparacion(String palabra1, String palabra2){
        int resp = 1;
        if(palabra1.length()==palabra2.length()){ 
            for (int i =0; i<=palabra1.length()-1;i++){
                char letra1 = palabra1.charAt(i);
                char letra2 = palabra2.charAt(i);
                if(letra1!=letra2){
                    resp = 0;
                }            
            }
        }else{
            resp=0;
        }
        return resp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("casa");
        //System.out.println(posicion("casa",'s'));
        System.out.println(comparacion("casa","cassa"));
    }
    
}
