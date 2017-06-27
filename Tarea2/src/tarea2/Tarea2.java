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

    
public static String invertir (String str){
    String resp= "";
    for(int i = str.length()-1; i>=0;i--){
        resp = resp + str.charAt(i);
    }
    return resp;
}

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(invertir("casa"));
    }
    
}
