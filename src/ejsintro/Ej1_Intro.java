/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsintro;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class Ej1_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
    System.out.println("Ingrese a continuación dos números que serán sumados:");
     int num1=leer.nextInt();
     int num2=leer.nextInt();
     int suma=num1+num2;
     System.out.println("La suma de los numeros ingresados es:" ); 
     System.out.println(suma);
    }
    
    
}
