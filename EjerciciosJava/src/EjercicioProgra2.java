
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
public class EjercicioProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        
        int dato = 0;
        
        String comodin = "";
        String almacenador = "";
        System.out.print("Ingrese el numero:.");
        dato = Integer.valueOf(ingreso.next());
        if(dato >= 0 && dato <=9999){
            int longitud = String.valueOf(dato).length();
            comodin = String.valueOf(dato);
            for(int i = (longitud); i-1 >= 0 ; i--){
                //System.out.println(dato);
                //System.out.print(comodin.subSequence(i-1, i));    
                almacenador = almacenador + (comodin.subSequence(i-1, i));
                
            }
            System.out.println(almacenador);
            
            
        }else{
            System.out.println("solo digitos entre 0 y 9999");
        }
        
        
    }
    
}

