
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
public class EjercicioProgra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("Ahora ingresa un numero:.");
        numero = Integer.valueOf(ingreso.next());
        
        if(numero >= 0 && numero <=9999){
            if(numero >= 0 && numero <= 9){
                System.out.println("El numero:. "+numero+" tiene 1 cifra");
            }
            else if(numero >= 10 && numero <=99){
                System.out.println("El numero:. "+numero+" tiene 2 cifras");
            }
            else if(numero >= 100 && numero <=999){
                System.out.println("El numero:. "+numero+" tiene 3 cifras");
            }
            else if(numero >= 1000 && numero <=9999){
                System.out.println("El numero:. "+numero+" tiene 4 cifras");
            }
            
        }else{
            System.out.println("El numero ingresado no es valido.");
        }
            
    }
    
}
