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
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int numero_hombre = 0;
        int numero_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        numero_hombre = Integer.valueOf(ingreso.next());
        System.out.println("Ingresa la cantidad de mujeres:");
        numero_mujeres = Integer.valueOf(ingreso.next());
        
        total = numero_hombre + numero_mujeres;
        
        System.out.println("Ahora el porcentaje de mujeres es:" + ((numero_mujeres *100) / total));
        System.out.println("Ahora el porcentaje de hombres es:" + ((numero_hombre *100) / total));
    }
    
}
