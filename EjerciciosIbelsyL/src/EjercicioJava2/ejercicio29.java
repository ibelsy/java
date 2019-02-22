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
public class ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;
        float numero3 = 0;
        float promedio = 0;
        
        System.out.println("Ahora ingresa nota1");
        numero1 = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingresa nota2");
        numero2 = Float.valueOf(ingreso.next());
        System.out.println("Ahora ingresa nota3");
        nnumero3 = Float.valueOf(ingreso.next());
        promedio = (numero1+numero2+numero3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
        
        
        
    }
    
}

