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
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float peso = 0;
        System.out.println("Ahora ingrese el peso en kilos");
        peso = Float.valueOf(ingreso.next());
        
        System.out.println("El peso en gramos es de:."+(peso*1000));
        System.out.println("El peso en libras es de:."+(peso*2.20462));
        System.out.println("El peso en toneladas es de:."+(peso*0.001));
        
    }
    
}


