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
public class EJExt1_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
     calcular su equivalente: 1 día, 2 horas.*/
     Scanner leer= new Scanner(System.in);
    System.out.println("Introduzca a continuación la cantidad de minutos para calcular su equivalencia:");
    int min = leer.nextInt();
    int dia=min/1440;
    int hora= (min%1440)/60;
    
    if (dia==1){
        if(hora==1){
    System.out.println(dia +" día, "+hora+" hora " );
        }else{ System.out.println(dia +" día, "+hora+" horas " );}
    }else{ System.out.println(dia +" días, "+hora+" horas " );}
    }
    
}
