/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Texto;

import java.util.Scanner;

/**
 *
 * @author ibelsy rosario lopez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingrese = new Scanner(System.in);
        
        float Cantidad_Dolares = 0;
        float Cantidad_Quetzales = 0;
        float cambio = 0;
        System.out.println("Ingrese la cantidad de dinero en Quetzales:.");
        Cantidad_Quetzales = Float.valueOf(ingrese.next());
    
        System.out.println("Ingrese el valor del dolar en 2019");
        Cantidad_Dolares = Float.valueOf(ingrese.next());
    
        cambio = (Cantidad_Quetzales/Cantidad_Dolares);
        
        
        System.out.println("Total:." +cambio);
        
    
       
    
    }
    
} 