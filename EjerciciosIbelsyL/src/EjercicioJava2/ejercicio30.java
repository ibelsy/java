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
public class ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        int numero;
        System.out.println("Ahora ingrese el radicando");
        numero = ingreso.nextInt(); 
        float resultado1 = (float) Math.sqrt(numero);
        System.out.println("La raiz cuadrada de "+ numero + "es: " + resultado1);
        
    }
    
}
