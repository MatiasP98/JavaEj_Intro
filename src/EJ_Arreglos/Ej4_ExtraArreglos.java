/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ_Arreglos;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class Ej4_ExtraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro 
        de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
        de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
        2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
        Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados 
        y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de cálculo de notas");
        System.out.println("Ingrese a continuación una a una las correspondientes notas:");
        double[] notas= new double[10];
        cargar_notas(leer,notas);
        mostrar(notas);
        aprobado(notas);
    }
    public static void cargar_notas(Scanner leer, double[]notas){
        for (int i = 1; i < 11; i++) {
            System.out.println("Alumno "+i);
            System.out.println("Primer TP:");
            int Tp1= leer.nextInt();
            System.out.println("Segundo TP:");
            int Tp2= leer.nextInt();
            System.out.println("Primer Integrador:");
            int I1= leer.nextInt();
            System.out.println("Segundo Integrador:");
            int I2= leer.nextInt();
            notas[i-1]=(Tp1*0.1)+(Tp2*0.15)+(I1*0.25)+(I2*0.5);
        }
}
    public static void mostrar(double[]notas){
        System.out.print("Alumno     ");
        for (int i = 1; i < 11; i++) {
            System.out.print("| "+i+" |");
        }
        System.out.println(" ");
        System.out.print("Nota Final ");
       
        for (int i = 0; i < 10; i++) {
            
            System.out.print("|"+notas[i]+"|");
        }
         System.out.println(" ");
}
    public static void aprobado (double[]notas){
        int apro=0;
        int desa=0;
        for (int i = 0; i < 10; i++) {
            if (notas[i]>=7) {
                apro++;
            }else{desa++;}
            
        }
        System.out.println("La cantidad de alumnos aprobados es: "+apro);
        System.out.println("La cantidad de alumnos desaprobados es: "+desa);
}
}
