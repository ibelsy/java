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
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Scanner ingreso = new Scanner(System.in);
        float distancia = 0;
       
        
        System.out.println("Ahora ingrese una distancia en mestros:.");
        distancia = Float.valueOf(ingreso.next());
        System.out.println("Su distancia en pulgadas es de:."+(distancia*39.37));
        System.out.println("Su distancia en pies es de:."+(distancia*3.28));
        
        
    }
    
}


