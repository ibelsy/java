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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float metro_cubico = (float)0.5;
        float largo = 0;
        float ancho = 0;
        
        System.out.println("Ahora ingrese el largo de la pared en metros:");
        largo = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingrese el ancho de la pared en metros:");
        ancho =  Float.valueOf(ingreso.next());
        
        System.out.println("La arena requerida es:."+ ((largo * ancho )*metro_cubico));
        
    }
    
}
