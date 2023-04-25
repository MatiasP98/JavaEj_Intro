/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejintro2;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class EJ2_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    *el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
    * Nota: investigar la función equals() en Java.
    */
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la clave");
    String clave =leer.nextLine();
        
    if (clave.equals("eureka")){
    System.out.println("Clave correcta, acceso permitido");
    }else{System.out.println("Clave incorrecta, acceso denegado");}
    
    
    
    
    }
    
}
