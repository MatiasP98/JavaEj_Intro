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
public class Ej5_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
        de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        Scanner leer= new Scanner(System.in);
        int[][] trasp= new int[3][3];
        int[][] matriz= new int[][]{{0,-2,4},{2,0,2},{-4,-2,0}};  
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(" "+matriz[i][j]);
        }
            System.out.println(" ");
        }
        System.out.println(" ");
        comprobar(matriz,trasp);
                
       
    }
     public static int[][] trasponer(int[][] matriz,int[][] trasp){
         for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           trasp[i][j]= matriz[j][i];
            System.out.print(" "+ trasp[i][j]);
        }
            System.out.println(" ");
        }
     return trasp;
    }
     public static int comprobar(int[][] matriz,int[][]trasp){
        trasponer(matriz,trasp);
        int count=0;
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           if (trasp[i][j]==(-1*matriz[i][j])){
           count++;}
            
        }}
        if (count==9){
            System.out.println("La matriz y su traspuesta son antisimétricas.");}
        else{
            System.out.println("La matriz y su traspuesta no son antisimétricas.");}
        
     return count;}
}
