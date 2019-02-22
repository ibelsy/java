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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float precio = (float) 0;
        int hrs = 0;
        int hrs_x = 0;
        
        System.out.println("Ahora ingresa precio de hora:");
        precio = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingresa horas trabajadas:.");
        hrs = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingresa horas extra trabajadas:.");
        hrs_x = Integer.valueOf(ingreso.next());
        
        System.out.println("Tu sueldo ahora es:."+ ((precio * hrs) +(precio * (hrs_x * 2))));
    }
    
}
