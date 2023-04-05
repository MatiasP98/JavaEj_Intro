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
public class EJ4_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese a continuación la temperatura en grados celsius: ");
        double tC= leer.nextDouble();
        double tF=(tC*1.8)+32;
        System.out.println("La temperatura en grados Fahrenheit es :"+ tC);
        
    }
    
}
