/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_Arreglos;

/**
 *
 * @author Matias
 */
public class Ej1_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
        los muestre por pantalla en orden descendente.
        */
        
        int[] vector= new int[100];
        String aux="";
        for(int i=vector.length-1;i>-1;i--){
            vector[i]= i+1;
            aux +=" "+vector[i];
            
        }
        System.out.println(aux);
    }
    
}
