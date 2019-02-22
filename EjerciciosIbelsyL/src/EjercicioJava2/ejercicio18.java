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
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float TASA = (float) 0.15;
        float v_compra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        v_compra = Float.valueOf(ingreso.next());
        
        descuento = v_compra * TASA;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (v_compra - descuento));
        
        
    }
    
}
