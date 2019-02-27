
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibelsy rosario lopez
 */
public class Ejercicio3progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        int numeros[];
        numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ahora Ingrese un valor ");
            numeros[i] = Integer.valueOf(ingreso.next());
        }
        System.out.println("Ahora los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ numeros[i]+" valor2-"+numeros[9-i]);
        }
    }
    
}

 
