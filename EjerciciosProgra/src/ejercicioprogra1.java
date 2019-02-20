
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
public class ejercicioprogra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner (System.in);
        
        float numero = 0;
        
        System.out.println("Para iniciar ingrese el numero que desee");
        numero =Float.valueOf(ingreso.next());
        if(numero >= 0 && numero <10 ){
           System.out.println("El numero solamente tiene una cifra");
        }
        else if(numero >=10 && numero <100 ){
           System.out.println("Ahora el numero tiene dos cifras");
        }
        else if(numero >=100 && numero <1000 ){
           System.out.println("Ahora el numero tiene tres cifras"); 
        }
        else if (numero >=1000 && numero < 10000){
            System.out.println("Ahora el numero tiene cuatro cifras");
        }
        else{
            System.out.println("Ahora su opcion es invalida");
        }        
    
    }
     }
    
 

