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
public class EJ1_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Crear un programa que dado un número determine si es par o impar.
    Scanner leer= new Scanner(System.in);
    System.out.println("Introduzca a continuación un número para determinar si es par o impar:");
    int num = leer.nextInt();
    
    if (num % 2 ==0){
    System.out.println("El número ingresado es par");
    }else{System.out.println("El número ingresado es impar");}
    
    
    }
    
}
