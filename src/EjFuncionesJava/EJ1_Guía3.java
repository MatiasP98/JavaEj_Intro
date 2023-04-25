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
public class EJ1_Guía3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*Crea una aplicación que le pida dos números al usuario y este pueda elegir
        entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
        para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
            */
            Scanner leer= new Scanner(System.in);
                 
         System.out.println("Ingrese a continuación dos números:");
         System.out.print("Número 1: ");int num1 = leer.nextInt();
         System.out.print("Número 2: ");int num2 = leer.nextInt();
         
          System.out.println("MENÚ");
    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.Multiplicar");
    System.out.println("4.Dividir");
    System.out.println("5.Salir");
    String salida ="n";
            
    do {
    System.out.println("Elija una opción:");
    int op = leer.nextInt();
    switch(op){
    case 1: 
             System.out.println("El resultado de la suma es:"+suma(num1,num2));
             
        break;
    case 2: int resta=num1-num2;
             System.out.println("El resultado de la resta es:"+resta(num1,num2));
             
        break;    
    case 3: int multi=num1*num2;
             System.out.println("El resultado de la multiplicación es:"+multi(num1,num2));
           
        break;    
    case 4: int div=num1/num2;
             System.out.println("El resultado de la división es:"+div(num1,num2));
             
                     
        break;    
    case 5: 
             System.out.println("¿Está seguro de que desea salir del programa (S/N)?");
            salida = leer.nextLine();
        break;
    }
    }while(salida.equalsIgnoreCase("n"));
    
    }
public static int suma(int num1,int num2){
 
 int suma=num1+num2;
return suma;
}
public static int resta(int num1,int num2){
 
 int resta=num1-num2;
return resta;
}
public static int multi(int num1,int num2){
 
 int multi=num1*num2;
return multi;
}
public static double div(double num1,double num2){
 
 double div=(num1/num2);
return div;
}
}
