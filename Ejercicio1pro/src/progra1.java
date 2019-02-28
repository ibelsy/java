
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
public class progra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        
        
        char Mayus[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            Mayus[j] = (char) i;
        }   
        
        String cadena = "";
        int eleccion = -1;
        
        do
        {
            System.out.println("Elija e ingrese un indice entre 0 y"+(Mayus.length -1));
            eleccion = Integer.valueOf(ingreso.next());
            
            if (!(eleccion >= 0 && eleccion <= Mayus.length -1))
            {
                System.out.println("Error, Ahora ingrese otro numero para seguir el programa");
            }
            else
            {
                if (eleccion != -1)
                {
                    cadena += Mayus[eleccion];
                }
            }
        } while (eleccion != -1);
        System.out.println(cadena);


    }
    
}
