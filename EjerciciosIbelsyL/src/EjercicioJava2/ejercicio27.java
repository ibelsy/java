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
public class ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner (System.in);
        
        int año_nacimiento = 0;
        int año_actual = 0;
        
        System.out.println("Ahora ingrese su año de nacimiento:.");
        año_nacimiento = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingrese el año actal:.");
        año_actual = Integer.valueOf(ingreso.next());
        
        int edad = (año_actual - año_nacimiento);
        if (edad > 0 && año_nacimiento > 0 && año_actual > año_nacimiento){
            System.out.println("Tu edad actual es: "+(año_actual - año_nacimiento));
            
        }else{ 
            System.out.println("Es invalido:.");
        }
    }
    
}
