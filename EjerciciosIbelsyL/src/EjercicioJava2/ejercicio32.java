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
public class ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        float cm = 0;
        float P = (float) 0.39737;
        
        System.out.println("Favor de ingresar cantidad en cm para convertilos a pulgadas");
        cm = Float.valueOf(ingreso.next());
        
        System.out.println("la medida en pulgadas es de:."+(cm*P));
        
    }
}

    
