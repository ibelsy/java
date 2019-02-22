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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double PRECIO_KM = 10.5;
        int km = 0;
        
        System.out.println("Ahora ingrese cantidad de km:.");
        km = Integer.valueOf(dato.next());
        System.out.println("Ahora su total a pagar es:." + (km * PRECIO_KM));
    }
    
}
