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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int resultado = 0;
        System.out.println("Ahora ingresa el valor1:");
        valor1 = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingresa el valor2:");
        valor2 = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingresa el valor3:");
        valor3 = Integer.valueOf(ingreso.next());
        
        resultado = Integer.valueOf(String.valueOf(valor1)+String.valueOf(valor2)+String.valueOf(valor3));
        System.out.println("El resultado es:" + resultado);
    }
    
}
