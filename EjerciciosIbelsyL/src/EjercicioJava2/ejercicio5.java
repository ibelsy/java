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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        float DESC =(float) 0.35;
        float precio = (float) 0;
        System.out.println("Ahora ingrese el precio del medicamento:");
        precio = Integer.valueOf(dato.next());
        System.out.println("Ahora tu descuento es: " + (precio * DESC));
        System.out.println("Ahora tu pago es: " + (precio - (precio * DESC)));
    }
    
}
