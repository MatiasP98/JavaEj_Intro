/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_Arreglos;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Matias
 */
public class Ej4_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
        la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
        se obtiene cambiando sus filas por columnas (o viceversa).
        */
        Scanner leer= new Scanner(System.in);
        Random ran = new Random();
        
        int[][] matriz= new int[4][4];
        int[][] trasp= new int[4][4];
        System.out.println("La matriz es : ");
        rellenar(matriz);
        System.out.println("La matriz transpuesta es: ");
        trasponer(matriz,trasp);
    }
    public static int[][] rellenar(int[][] matriz){
        for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
           matriz[i][j]= (int)(Math.random()*10);
            System.out.print(" "+matriz[i][j]);
        }
            System.out.println(" ");
        }
     return matriz;
    }
    public static int[][] trasponer(int[][] matriz,int[][] trasp){
         for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
           trasp[i][j]= matriz[j][i];
            System.out.print(" "+ trasp[i][j]);
        }
            System.out.println(" ");
        }
     return trasp;
    }
}
