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
public class Ej2_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
        y le pida al usuario un número a buscar en el vector. El programa mostrará 
        dónde se encuentra el numero y si se encuentra repetido
        */
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese a continuación el tamaño del vector:");
        int N= leer.nextInt();
        int[] v= new int[N];
         String aux="";
        Random rand= new Random();
        for(int i=0; i<N;i++ ){
         /*v[i]= rand.nextInt(10);*/
         v[i] = (int) (Math.random() *5 +1);
          /*aux += " "+ v[i];*/System.out.print(" "+v[i]);
        }
        /*System.out.println(aux);*/
        System.out.println("");
        System.out.println("Ingrese a continuación el número a buscar:");
        int num=leer.nextInt();
        int cant=0;
        for(int elemento:v){
            if (elemento==num) {
                 cant++;}}
         if (cant==0){
                    System.out.println("El número no está dentro del vector.");
                }else{
             if (cant==1) {
                 System.out.println("El número no está dentro del vector.");}else{
                  if(cant>1){
                    System.out.println("El número está dentro del vector y se repite "+cant+" veces");}
             }
}
           
    }
    /*
    import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        // Crear el vector y llenarlo con valores aleatorios
        int[] vector = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100); // Genera un valor aleatorio entre 0 y 99
        }
        
        // Mostrar el vector generado
        System.out.println("El vector generado es: " + Arrays.toString(vector));
        
        // Pedir el número a buscar en el vector
        System.out.print("Ingrese el número a buscar en el vector: ");
        int numeroBuscado = sc.nextInt();
        
        // Buscar el número en el vector
        boolean encontrado = false;
        int indiceEncontrado = -1;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                if (encontrado) {
                    System.out.println("El número se encuentra repetido en los índices " + indiceEncontrado + " y " + i);
                } else {
                    System.out.println("El número se encuentra en el índice " + i);
                    encontrado = true;
                    indiceEncontrado = i;
                }
            }
        }
        
        // Mostrar mensaje si no se encontró el número
        if (!encontrado) {
            System.out.println("El número no se encuentra en el vector");
        }
    }

}
    */
    }