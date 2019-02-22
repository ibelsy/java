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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int nota = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        nota = Integer.valueOf(dato.next());
        System.out.println("Ingresa segunda nota:.");
        nota1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa tercera nota:.");
        nota2 = Integer.valueOf(dato.next());
        
        System.out.println("Tu nota final es:"+(nota + nota1 + nota2));
    }
    
}
