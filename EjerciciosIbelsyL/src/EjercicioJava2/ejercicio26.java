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
public class ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Ahora ingrese un numero");
        numero = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingrese un segundo numero");
        numero1 = Integer.valueOf(ingreso.next());
        System.out.println("Ahora ingrese un tercer numero");
        numero2 = Integer.valueOf(ingreso.next());
        
        
        int suma = (numero+numero1+numero2);
        int resta = (numero-numero1-numero2);
        int multiplicacion = (numero*numero1*numero2);
        if (suma > 0 && resta > 0 && multiplicacion > 0){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multiplicacion es "+multiplicacion);

        }
        else{
            System.out.println("los numeros son negativos");
        }
    }
    
}
