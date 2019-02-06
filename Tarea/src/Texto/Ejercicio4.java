/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Texto;

import java.util.Scanner;

/**
 *
 * @author ibelsy rosario lopez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner escriba = new Scanner (System.in);
       float numero =0;
       float cubo =0;
       float cuadrado = 0;
       int aumento =0;
       
       while (aumento !=5)
           {
               System.out.println("Escriba el numero que quiera elevar al cuadro y al cubo:.");
               numero = escriba.nextFloat();
               cubo = numero*numero*numero;
               cuadrado = numero*numero;
               System.out.println("Numero ingresado elevado al cuadrado es:." +cuadrado);
               System.out.println("Numero ingresado elevado al cubo es:." +cubo);
               aumento++;
              
               
               
               
           }
           
        
        
        
        
        
    }
    
}