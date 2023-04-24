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
public class Ej3_ExtraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear una función rellene un vector con números aleatorios, pasándole
        un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el tamaño del vector:");
        int n=leer.nextInt();
        int[] vt= new int[n];
        rellenar(vt);
        mostrar(vt);
    }
     public static void rellenar(int[]vt1){
        for (int i = 0; i < vt1.length; i++) {
            
            vt1[i]=(int) (Math.random()*10);
          
        }
    }
     public static void mostrar(int[]vt){
         System.out.print(" Vector= (");
         for (int i = 0; i < vt.length; i++) {
             System.out.print(" "+vt[i]);
             
         }
         System.out.print(" )");
         System.out.println(" ");
    }
}
