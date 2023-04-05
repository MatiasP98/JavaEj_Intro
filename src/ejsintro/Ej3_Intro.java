/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsintro;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Matias
 */
public class Ej3_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese a continuación una frase:");
        String frase=leer.nextLine();
        System.out.println("La frase en mayúsculas es: " +( toUpperCase(frase)) );
        System.out.println("La frase en minúsculas es:" + ( toLowerCase(frase)) );
    }
    
    
}
