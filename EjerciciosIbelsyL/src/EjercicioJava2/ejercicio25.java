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
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        System.out.println("Ahora ingrese un numero");
        numero = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingrese un segundo numero");
        numero1 = Integer.valueOf(ingreso.next());
        if (numero >= 0 && numero1 >= 0)
        {
            System.out.println("La suma es:."+(numero+numero1));
            System.out.println("La multiplicacion es:."+(numero*numero1));
        }
        else{
            System.out.println("Ingrese un numero positivo");
        }
        
    }
    
}

  
