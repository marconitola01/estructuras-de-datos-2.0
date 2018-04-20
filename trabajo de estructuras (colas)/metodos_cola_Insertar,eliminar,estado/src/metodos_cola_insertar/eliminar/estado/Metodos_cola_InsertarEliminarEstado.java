
package metodos_cola_insertar.eliminar.estado;

import java.io.IOException;
import java.util.Scanner;

/** programa que ese metodos para insertar,eliminar y mostrar los elementos de una cola (dice si esta vacia o no)
 * estructuras de datos
 * @author marco nitola
 */
public class Metodos_cola_InsertarEliminarEstado {

    public static class ClaseColas {  
        
        static int max=5; 
         static int cola[]= new int[max]; 
         static int frente, fin;
        
         ClaseColas() { 
          frente=0;   fin=0;
          System.out.println("Cola inicializada !!!");
         }
        
         public static void Insertar(int dato) {
         Scanner sc = new Scanner(System.in);
             
             if(fin==max) { 
          System.out.println("\nCola llena !!!");
           return;
          }
          cola[fin++]=dato;
          System.out.println("Dato insertado !!!");
    }
           
         public static void insercion() throws IOException {
     Scanner db = new Scanner(System.in);
               int elemento=0;
     System.out.println("\n\n<<< insercion >>>");
             for (int i = 0; i < 5; i++) {
                 System.out.print("Elemento a insertar? ---> ");
     elemento=(db.nextInt());  
     Cola.Insertar(elemento); 
             }
     
   
  }
        
         public static void Eliminar() {
          System.out.println("\n\n<<< ELIMINAR >>>");
          if(frente==fin) { 
           System.out.println("\nCola vacia !!!");
           return;
          }
             System.out.println("Elemento eliminado: "+cola[frente++]);
         }
        
         public static void Mostrar() {
          int i=0;
          System.out.println("\n\n<<< MOSTRAR >>>");
          if(frente==fin)  System.out.println("\nCola vacia !!!");
          for(i=frente; i<fin; i++) {
           System.out.println("cola["+i+"]="+" "+cola[i]);
          }
          System.out.println("\nFrente= "+frente);
          System.out.println("Final = "+fin);
          System.out.println("Max  = "+max);
         }
    }
  
    static ClaseColas Cola=new ClaseColas();  
  
   
    public static void main(String args[]) throws IOException {
     int op=0;
     do {
           System.out.println("\n\n..COLAS..");
           System.out.println("1. - insertar");
           System.out.println("2.- Eliminar");
           System.out.println("3.- Mostrar");
           System.out.println("4.- Salir");
           System.out.print("Opcion? ---> ");
           Scanner leer = new Scanner(System.in);
           op=(leer.nextInt());
         
           switch(op) {
             case 1 : Cola.insercion();  break;    
            case 2 : Cola.Eliminar(); break;
            case 3 : Cola.Mostrar();  break;
            case 4 : break;
           }
     }while(op!=0);
    }
    
    
    
        
    }
