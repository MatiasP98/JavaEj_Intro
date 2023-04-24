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
public class Ej5_ExtraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz a continuación:");
        System.out.print("Filas:"); int f = leer.nextInt();
        System.out.print("Columnas:"); int c = leer.nextInt();
        int[][] matriz=new int[f][c];
        rellenar(matriz,f,c);
        total(matriz);
    }
    public static void rellenar(int[][]matriz,int f,int c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(" "+ matriz[i][j]);
            }
            System.out.println(" ");
        }
}
    public static void total(int[][]matriz){
        int total=0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                total+= elemento;
            }
        }
        System.out.println("El total de la suma de todos los elementos de la matriz es "+total);
}
}
