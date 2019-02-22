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
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float numero = 0;
        
        System.out.println("Ahora ingrese numero para elevarlo al cubo");
        numero = Float.valueOf(ingreso.next());
        
        System.out.println("Ahora el numero elevado al cubo es "+(numero*numero*numero));
        
    }
    
}

        
        
