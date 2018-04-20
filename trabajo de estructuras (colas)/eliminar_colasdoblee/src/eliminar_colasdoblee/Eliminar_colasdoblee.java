
package eliminar_colasdoblee;

import java.util.Scanner;

/**
 * eliminar un elemento de una cola doble elimina final y inicio
 * @author marco nitola
 */
public class Eliminar_colasdoblee {
Nodos  primero;
    Nodos ultimo;
    public Eliminar_colasdoblee(){
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
    public int eliminarInicio(){
        int elemento = ultimo.dato;
        if(primero==ultimo){
            primero = ultimo = null;
            primero.anterior=null;
                
            }
           return elemento; 
        }
     public int eliminarFinal(){
        int elemento = primero.dato;
        if(primero==ultimo){
            primero = ultimo = null;
            primero.anterior=null;
        } else{
            ultimo = ultimo.anterior;
            ultimo.siguiente=null;
        }
           return elemento; 
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
        Eliminar_colasdoblee iniciar = new Eliminar_colasdoblee();
        System.out.println("cuantos elementos va a ingresar??");
        int elementos = leer.nextInt();
        
      for (int i = 0; i < elementos; i++) {
          System.out.println("\n "+"ingresa elemento"+i);    
          iniciar.ingresar();
      }
        System.out.println("\n");
       iniciar.eliminarFinal();
       iniciar.mostrar();
    
      
    }
    
}

    

