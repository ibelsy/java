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
public class ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float lb = 0;
        float K = (float) 2.2046;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas");
        lb = Float.valueOf(ingreso.next());
        
        System.out.println("la cantida en kilogramos es de :."+(lb*K));
        
    }
    
}

  
