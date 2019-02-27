
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
public class Ejercicio1progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner ingreso = new Scanner(System.in);
        int num[];
        num = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ahora ingrese un valor ");
            num[i] = Integer.valueOf(ingreso.next());
        }
        
        System.out.println("Los numeros son");
        
        for (int i = 4; i >=  0; i--) {
            System.out.println("El valor es "+ num[i]);
        }
    }
    
}


      

        
  
