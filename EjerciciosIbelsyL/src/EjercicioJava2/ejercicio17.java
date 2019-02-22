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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        float TASA = (float) 0.10;
        float sueldo = (float) 0;
        float venta = (float) 0;
        float venta1 = (float) 0;
        float venta2 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = Float.valueOf(dato.next());
        
        System.out.println("Ahora ingrese valor de la primera venta:");
        venta = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese valor de la segunda venta:");
        venta1 = Float.valueOf(dato.next());
        System.out.println("Ahora ingrese valor de la tercera venta:");
        venta2 = Float.valueOf(dato.next());
        
        comision = (venta + venta1 + venta2) * TASA;
        
        System.out.println("Ahora tu sueldo es: " + sueldo);
        System.out.println("Ahora tu comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
        
    }
    
}
