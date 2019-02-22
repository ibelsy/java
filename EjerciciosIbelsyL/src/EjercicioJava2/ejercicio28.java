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
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        
        float precio = 0;
        float IVA = (float) 0.09;
        float producto = 0;
        
        System.out.println("Ahora ingrese el precio del articulo");
        precio = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingrese la cantidad del articulo");
        producto = Float.valueOf(ingreso.next());
        
        float to = precio*producto;
        float total = ((precio*producto)*IVA);
        
        System.out.println("Ahora la cantidad a pagar es de "+(to-total));
       

        
        
    }
    
}

        
 
