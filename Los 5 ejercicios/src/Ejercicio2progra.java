
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
public class Ejercicio2progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    Scanner ingreso = new Scanner(System.in);
        int num[];
        num = new int[5];
        int contar_positivos = 0, contar_negativos = 0, contar_0 = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ahora ingrese un valor ");
            num[i] = Integer.valueOf(ingreso.next());
            if(num[i] > 0){
                contar_positivos++;
            }
            else if(num[i] < 0){
                contar_negativos++;
            }
            else{
                contar_0++;
            }
        }
        
        System.out.println("Cantidad de positivos es "+ contar_positivos);
        System.out.println("Cantidad de negativos es "+ contar_negativos);
        System.out.println("Cantidad de ceros es "+ contar_0);
    }
    
}
   
