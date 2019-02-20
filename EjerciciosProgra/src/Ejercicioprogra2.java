
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
public class Ejercicioprogra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        
        int numero = 0;
        int numero1 = 0;
        
        System.out.println("Ahora ingrese el numero que desee para que lo muestre al reves:.");  
        numero = ingreso.nextInt();
        
        String srt = String.valueOf(numero);
        String rpta = "";
        
        char [] valor = srt.toCharArray();
        
        for (int i = valor.length-1; i>-1; i--)
        {
            rpta+= valor [i]+"";
        }
        System.out.println("Ahora el numero al reves seria:"+rpta);
        
        
            
        
            
        
        }
    }
    

