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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        float M1 = (float) 0.05;
        float M2 = (float) 0.1;
        float M3 = (float) 0.12;
        float M4 = (float) 0.25;
        float M5 = (float) 0.50;
        float M6 = (float) 1;
        float mon1 = (float) 0;
        float mon2 = (float) 0;
        float mon3 = (float) 0;
        float mon4 = (float) 0;
        float mon5 = (float) 0;
        float mon6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ahora ingrese cantidad de monedas de 0.05:");
        mon1 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese cantidad de monedas de 0.10:");
        mon2 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese cantidad de monedas de 0.12:");
        mon3 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese cantidad de monedas de 0.25:");
        mon4 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese cantidad de monedas de 0.5:");
        mon5 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese cantidad de monedas de 1:");
        mon6 = Float.valueOf(dato.next());
        total = (mon1 * M1) + (mon2 * M2) + (mon3 * M3) + (mon4 * M4) + (mon5 * M5) + (mon6 * M6); 
        System.out.println("Total: "+ total);
    }
    
}
