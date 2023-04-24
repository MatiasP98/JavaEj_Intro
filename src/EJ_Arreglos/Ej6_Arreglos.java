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
public class Ej6_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y determine 
        si este cuadrado es mágico o no. El programa deberá comprobar que los números 
        introducidos son correctos, es decir, están entre el 1 y el 9.
        */
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese a continuación los números que contendrá la matriz:");
        int[][] matriz= new int[][]{{2,7,6},{9,5,1},{4,3,8}};
        
        int c1=0;
        int c2=0;
        int c3=0;
        int f1=0;
        int f2=0;
        int f3=0;
        int diag1=0;
        int diag2=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++) {
              /*matriz[i][j]= leer.nextInt();*/
               System.out.print(" "+matriz[i][j]);
               if(i==j){
               diag1+= matriz[i][j];}
               if( (i==2 && j==0) || (i==1 && j==1) || (i==0 && j==2)){
	       diag2+=matriz[i][j];}
               
            switch(i){
                   case 0:
                       c1+=matriz[i][j];
                   break;
                   case 1:
                       c2+=matriz[i][j];
                   break;
                   case 2:
                       c3+=matriz[i][j];
                   break;
               }
             switch(j){
                   case 0:
                       f1+=matriz[i][j];
                   break;
                   case 1:
                       f2+=matriz[i][j];
                   break;
                   case 2:
                       f3+=matriz[i][j];
                   break;
               }
				 
            }
            System.out.println(" "); 
        }
       int total=c1+c2+c3+f1+f2+f3+diag1+diag2;
       if((total/8)==c1){
           System.out.println("La matriz ingresada es mágica :3 ");}
       else{System.out.println("La matriz ingresada no es mágica :(");}
    }
    
}
