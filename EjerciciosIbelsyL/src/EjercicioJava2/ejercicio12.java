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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float DESC =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ahora ingresa tu sueldo actual:");
        sueldo = Float.valueOf(ingreso.next());
        System.out.println("Ahora tu nuevo sueldo es: "+ (sueldo - (sueldo * DESC)));
    }
    
}
