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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        int operacion1 = 0;
        int operacion2 = 0;
        
        System.out.println("Ingresa el primer valor:");
        valor1 = Integer.valueOf(ingreso.next());
        System.out.println("Ingresa el segundo valor:");
        valor2 = Integer.valueOf(ingreso.next());
        operacion1 = (valor1 * 2) + (valor2 *valor2);
        operacion2 = ((valor1 * valor1 * valor1)+(valor2 * valor2 * valor2))/3;
        
        System.out.println("La primera operacion es: " + operacion1);
        System.out.println("La segunda operacion es: " + operacion2);
    }
    
}
