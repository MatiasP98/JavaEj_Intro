/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_Arreglos;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class Ej1_ExtraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un vector
        de tamaño N, con los valores ingresados por el usuario.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese a continuación el tamaño del vector:");
        int n= leer.nextInt();
        int[]vt=new int[n];
        int suma=0;
        System.out.println("Ingrese a continuación uno a uno los elementos del vector: ");
        for (int i = 0; i < vt.length; i++) {
            vt[i]=leer.nextInt();
            suma+=vt[i];
        }
        System.out.println("La suma de los elementos del vector es "+suma);
    }
    
}
