/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsintro;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class Ej2_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá a continuación tu nombre:");
        String  name=leer.nextLine();
        System.out.println("El nombre ingresado fue :"+ name );
    }
    
}
