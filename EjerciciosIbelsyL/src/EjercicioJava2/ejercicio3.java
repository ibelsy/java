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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double PRECIO_H = 1.5;
        int hrs = 0;
        int descuento = 0;
        int hrs_gratis = 0;
        System.out.println("Ahora ingrese la cantidad de horas utilizada:.");
        hrs = Integer.valueOf(dato.next());
        
        hrs_gratis = (hrs / 5);
        System.out.println("Ahora tu total a pagar es de:." + (hrs * PRECIO_H));
        System.out.println("por el uso de internet obtuviste "+ hrs_gratis + " horas gratis");
        
        
    }
    
}
