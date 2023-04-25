/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjFuncionesJava;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class EJ2_Guía3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima 
        los datos de las personas ingresadas por teclado e indique si son mayores 
        o menores de edad. Después de cada persona, el programa debe preguntarle al 
        usuario si quiere seguir mostrando personas y frenar cuando el 
        usuario ingrese la palabra “No”.
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese a continuación la cantidad de personas que se tendrán en cuenta:");
        int cant=leer.nextInt();
        personas(leer,cant);
    }
    public static void personas(Scanner leer,int cant){
     String[] persona=new String[cant];
    
        for (int i = 0; i < cant; i++) {
            System.out.println("Nombre:");
            String nombre= leer.nextLine();
        }
    }
    
}
