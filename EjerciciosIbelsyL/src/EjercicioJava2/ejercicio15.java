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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int años = 0;
        int meses = 0;
        int edad = 0;
        System.out.println("Ahora ingresa años:. ");
        años = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingresa meses:. ");
        meses = Integer.valueOf(ingreso.next());
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es:."+ edad);
        
    }
    
}
