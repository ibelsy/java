
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
public class Ejercicio5progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        int numero[];
        numero = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ahora ingrese un numero ");
            numero[i] = Integer.valueOf(ingreso.next());
        }
        System.out.println("Ahora los numeros son ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numero[i]);
        }
        
    }
    
}

        
        