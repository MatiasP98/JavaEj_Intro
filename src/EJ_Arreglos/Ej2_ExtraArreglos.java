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
public class Ej2_ExtraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
        */
       Scanner leer = new Scanner(System.in);
        
       int [] vt1= new int[5];
       int [] vt2= new int[5];
       rellenar(vt1,vt2,leer);
       comparar(vt1,vt2);
        
    }
    public static void rellenar(int[]vt1, int[]vt2,Scanner leer){
        for (int i = 0; i < vt1.length; i++) {
            System.out.println("Introduzca a continuación el valor "+i+" del vector 1:");
            vt1[i]=leer.nextInt();
            System.out.println("Introduzca a continuación el valor "+i+" del vector 2:");
            vt2[i]=leer.nextInt();
        }
    }
    public static int  comparar(int[]vt1,int[] vt2){
        int comparar=0;
        for (int i = 0; i < vt1.length; i++) {
            if (vt1[i]==vt2[i]){
               comparar++ ;
            }else{ break;}
        }
        if (comparar==vt1.length) {
            System.out.println("Los vectores son iguales");  
        }else{ System.out.println("Los vectores no son iguales");}
    return comparar;}
}
