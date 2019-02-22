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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        float TASA = (float) 0.025;
        float capital = (float) 0;
        float interes = (float) 0;
        
        System.out.println("Ahora ingresa el capital:");
        capital = Float.valueOf(ingreso.next());
        interes = (capital * TASA) *12;
        System.out.println("Ahora tu interes es de:." + interes);
        
    }
    
}
