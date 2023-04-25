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
public class EJ5_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, 
         *y a continuación solicite números al usuario hasta que la suma de 
         *los números introducidos supere el límite inicial.
         */
    Scanner leer= new Scanner(System.in);
    
    System.out.println("Introduzca a continuación un número que será el límite: ");
    int lim = leer.nextInt();
    int suma=0;
    
    System.out.println("Introduzca a continuación un número");
    
    while(suma!=lim && suma< lim ){
    int num = leer.nextInt();
    suma=suma+num;}
    
    
    
   

    }
    
}
