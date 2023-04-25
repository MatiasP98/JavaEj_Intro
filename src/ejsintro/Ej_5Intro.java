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
public class Ej_5Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ingrese a continuación un número:");
        int num = leer.nextInt();

        System.out.println("El doble del número ingresado es: " + (num * 2));
        System.out.println("El doble del número ingresado es: " + (num * 3));
        System.out.println("El doble del número ingresado es: " + (Math.sqrt(num)));
    }

}
