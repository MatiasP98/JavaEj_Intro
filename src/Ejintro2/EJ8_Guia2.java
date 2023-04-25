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
public class EJ8_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
         *Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
         * * * *
         *     *
         *     *
         * * * *
         */
        
           Scanner leer= new Scanner(System.in);
    
    System.out.println("Introduzca a continuación el tamaño de lado del cuadrado:");
    int lado = leer.nextInt();
    
    for (int i=0;i<lado;i++){System.out.print("* ");}
    System.out.println();
    for (int i=0;i<lado-2;i++){System.out.print("*");
     for (int j=0;j<lado-2;j++){System.out.print("  ");}
         System.out.print(" *");
     System.out.println();}
   
    for (int i=0;i<lado;i++){System.out.print("* ");}
        
     
    }
    
}
