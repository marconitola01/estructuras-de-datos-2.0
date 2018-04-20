
package invertir_colas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/** invertir una cola sencilla 
 *  estructuras de datos
 * @author marco nitola
 */
public class Invertir_colas {

    public static void main(String[] args) {
         
        LinkedList cola = new LinkedList ();
        Stack <String> pila = new Stack< >();
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos elementos va a ingresar? ");
        int elementos = leer.nextInt();
        int fin = elementos -2 ;
        
        
        for (int i = 0; i < elementos; i++) {
            System.out.println("ingrese elemento "+i); 
        cola.add(leer.nextInt());   
        }
        
        
        while(cola.size()>0)
            pila.push(Integer.toString((int)cola.removeLast()));
        while(!pila.empty())
            cola.add(Integer.parseInt(pila.pop()));
        
         System.out.println("cola invertida"); 
        while(cola.size()>0)
           
            System.out.print(" " + (int) cola.removeLast()+" ");
        
     
        
    }
    
}
