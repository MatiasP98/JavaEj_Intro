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
public class EJ6_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*Realizar un programa que pida dos números enteros positivos por teclado 
       *y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
       *y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
       *El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
       *si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
       *se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
       *Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
       */
         Scanner leer= new Scanner(System.in);
    
    System.out.println("Introduzca a continuación dos números con los que se realizaran los cálculos:");
    System.out.print("Número 1:");int num1 = leer.nextInt();
    System.out.println("Número 2:");int num2 = leer.nextInt();
    
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
    case 1: int suma=num1+num2;
             System.out.println("El resultado de la suma es:"+suma);
             suma=0;
        break;
    case 2: int resta=num1-num2;
             System.out.println("El resultado de la resta es:"+resta);
             resta=0;
        break;    
    case 3: int multi=num1*num2;
             System.out.println("El resultado de la multiplicación es:"+multi);
             multi=0;
        break;    
    case 4: int div=num1/num2;
             System.out.println("El resultado de la división es:"+div);
             div=0;
                     
        break;    
    case 5: 
             System.out.println("¿Está seguro de que desea salir del programa (S/N)?");
            salida = leer.nextLine();
        break;
    }
    }while(salida.equalsIgnoreCase("n"));

    
    
    

    
    }
    
}
