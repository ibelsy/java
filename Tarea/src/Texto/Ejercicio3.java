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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingrese = new Scanner (System.in);
        int seleccionar = 0;
        float cantidad_Dolar = 0;
        float cantidad_Quetzales = 0;
        float valor_Quetzales = 0;
        float Total_Quetzales = 0;
        float Total = 0;
        System.out.println("Convertidor de dolar a quetzal (1) \n  Convertidor de quetzal a dolar (2)");
        seleccionar = ingrese.nextInt();
        
        if (seleccionar == 1)
        {
            System.out.println("Escriba la cantidad en dolares:");
            cantidad_Dolar = Float.valueOf(ingrese.next());
            System.out.println("Escriba el valor del dolar en la actualidad:");
            valor_Quetzales = Float.valueOf(ingrese.next());
            Total_Quetzales = cantidad_Dolar * valor_Quetzales;
            System.out.println("El total en Quetzales es de:." +Total_Quetzales);
            
        }
        else if (seleccionar ==2)
            {
                
                System.out.println("Escriba el valor del dolar en la actualidad:");
                cantidad_Dolar = Float.valueOf(ingrese.next());
                System.out.println("Escriba la cantidad en Quetzales:");
                cantidad_Quetzales = Float.valueOf(ingrese.next());
                Total =(cantidad_Quetzales/cantidad_Dolar);
                System.out.println("El total en dolares es de:" +Total);
            }
            else
            {
               System.out.println("Opcion Invalida");
            }
    }
    
}

    
