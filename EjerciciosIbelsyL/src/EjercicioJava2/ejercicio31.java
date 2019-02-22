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
public class ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float PI = (float) 3.1416;
        float radio = 0;
        float area = 0;
        
        System.out.println("Sea bienvenido al prgrama de calcular area de un circulo");
        System.out.println("Ahora favor de ingrese radio de un circulo");
        radio = Float.valueOf(ingreso.next());
        
        area = (PI*(radio*radio));
        
        System.out.println("Ahora el area del circulo es de:."+area);
    }
    
}

