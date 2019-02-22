/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioJava2;

import java.util.Scanner;

/**
 *
 * @author ibelsy rosario lopez
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float segundo = (float ) 0;
        float minuto = (float ) 0;
        float hora = (float ) 0;
        float P_SEG = (float ) 0.25;
        float tiempo_s = (float ) 0;
        System.out.println("Ahora ingresa la cantidad de horas:.");
        hora = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingresa la cantidad de minutos:.");
        minuto = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingresa la cantidad de segundos:.");
        segundo = Float.valueOf(ingreso.next());
        tiempo_s = segundo + (minuto * 60 )+ ((hora * 60)*60) ;
        System.out.println("El costo es:."+ (tiempo_s * P_SEG));
    }
    
}
