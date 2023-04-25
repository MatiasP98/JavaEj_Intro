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
public class EJ7_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
       este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
       deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
       el primer carácter tiene que ser X y el último tiene que ser una O.
       Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
       “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
       que no respete el formato se considera incorrecta.
       Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
       correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
       las siguientes funciones de Java Substring(), Length(), equals().*/
      
    Scanner leer= new Scanner(System.in);
    
    System.out.println("Codifique a continuación la secuencia de caracteres:");
    
   int correct=0;
   int incorrect=0;       
   String sec = leer.nextLine();
   while(sec.equals("&&&&&")==false){
     sec = leer.nextLine();
   int medida = sec.length();
   
   if(medida==5){
          if(sec.substring(0,1).equalsIgnoreCase("x")&&sec.substring(4,5).equalsIgnoreCase("o")){
           correct=correct+1;
                   }else{ incorrect=incorrect+1;
                              }
          
                  }else{incorrect=incorrect+1;}
   
   }
    System.out.println("La cantidad de lecturas correctas fue de:"+correct);
    System.out.println("La cantidad de lecturas incorrectas fue de:"+incorrect);        
    } 
    
}
