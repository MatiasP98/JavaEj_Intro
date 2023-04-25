/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejintro2;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class EJExt3_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        // TODO code application logic here
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
         */
         System.out.println("Ingrese a continuación una letra:");
         String letra = leer.nextLine();
         
         if (letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")|| letra.equalsIgnoreCase("U")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
              System.out.println("La letra ingresada es una consonante.");
        }
    }
    
}
