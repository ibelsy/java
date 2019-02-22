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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        float URGENC = (float) 0.37;
        float PEDIAT = (float) 0.42;
        float TRAUMATOL = (float) 0.21;
        float presupuesto = (float) 0;
        System.out.println("Ingresa presupuesto:.");
        presupuesto = Float.valueOf(dato.next());
        System.out.println("El presupuesto para Emergencias es:"+(presupuesto * URGENC) );
        System.out.println("El presupuesto para Pediatria es:"+(presupuesto * PEDIAT) );
        System.out.println("El presupuesto para Traumatologia es:"+(presupuesto * TRAUMATOL) );
    }
    
}
