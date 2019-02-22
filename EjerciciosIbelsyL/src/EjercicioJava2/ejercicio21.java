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
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float PORCENTAJE = (float) 0.25;
        float salario = 0;
        float nuevo_sal = 0;
        
        System.out.println("Ingrese su sueldo anterior");
        System.out.println("Para calcular su aumento");
        salario = Float.valueOf(ingreso.next());
        nuevo_sal = salario*PORCENTAJE;
        System.out.println("su nuevo sueldo es de "+(salario+nuevo_sal));
        
    }
    
}

        
