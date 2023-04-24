/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej3_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese a continuación el tamaño del vector:");
        int N= leer.nextInt();
        int[] v= new int[N];
         String aux="";
        Random rand= new Random();
        for(int i=0; i<N;i++ ){
         v[i]= rand.nextInt(100000);
         /*v[i] = (int) (Math.random() *100000);*/
         /*aux += " "+ v[i];*/System.out.print(" "+v[i]);
        }
        /*System.out.println(aux);*/
        System.out.println("");
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        for(int elemento:v){
          if(elemento<10){
          cont1++;}else{
          if(elemento>=10 && elemento<100){
          cont2++;}else{
          if (elemento>=100 && elemento<1000){
          cont3++;}else{
          if(elemento>=1000 && elemento<10000){
          cont4++;}else{
          if(elemento>=10000 && elemento <100000){
          cont5++;}
          }}}}}
        System.out.println("Números de 1 cifra :"+cont1);
        System.out.println("Números de 2 cifra :"+cont2);
        System.out.println("Números de 3 cifra :"+cont3); 
        System.out.println("Números de 4 cifra :"+cont4);
        System.out.println("Números de 5 cifra :"+cont5);
    }
   
    }
