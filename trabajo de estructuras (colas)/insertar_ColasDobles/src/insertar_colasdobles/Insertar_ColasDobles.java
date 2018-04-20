
package insertar_colasdobles;

import java.util.Scanner;

/** estructuras de datos
 *  insertar  elemento en un bicola o colas dobles
 * @author marco nitola
 */
public class Insertar_ColasDobles {
Nodos  primero;
    Nodos ultimo;
    public Insertar_ColasDobles(){
        primero = null;
        ultimo = null;
        
}
    public void ingresar(){
      Scanner sc = new Scanner (System.in);
        int dato = sc.nextInt();
        Nodos nuevo = new Nodos();
        nuevo.dato = dato;
        
        if(primero == null){
            primero = nuevo;
            primero.siguiente=null;
            primero.anterior=null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = null;
            ultimo = nuevo;
            
        }
        
    }
    public void mostrar (){
        Nodos actual = new Nodos();
        actual = ultimo;
        while(actual != null){
           
            actual = primero;
            primero = actual.siguiente;
             System.out.println(actual.dato);
        }
    }
    
  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        Insertar_ColasDobles iniciar = new Insertar_ColasDobles();
        System.out.println("cuantos elementos va a ingresar??");
        int elementos = leer.nextInt();
        
      for (int i = 0; i < elementos; i++) {
          System.out.println("\n "+"ingresa elemento"+i);    
          iniciar.ingresar();
      }
        System.out.println("\n la cola quedo asi:");
      iniciar.mostrar();
    
      
    }
    
}
