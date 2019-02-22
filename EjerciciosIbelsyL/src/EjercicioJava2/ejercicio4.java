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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner ingreso = new Scanner(System.in);
        int T_DOLARES = 2150;
        int T_EUROS = 145;
        float dinero = (float)  0;
        System.out.println("Ahora ingresa la cantidad a convertir:+");
        dinero = Float.valueOf(ingreso.next());
        
        System.out.println("La conversion a Dolares es:."+(dinero * T_DOLARES));
        System.out.println("La conversion a Dolares es:."+(dinero * T_EUROS));
    }
    
}
