import java.util.Stack;
import ordenamientos.Persona;

/**
 * author : Vinni
 * Clase para ejemplificar una Pila con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura LIFO (Last In - First Out, o último en entrar - primero en salir). 
 * 
 **/
public class GestorPila{
    private Stack<Persona> laPila = new Stack<>();

    public void adicionar(Persona p){
        laPila.push(p);        
    }
    public void retirar(){
        laPila.pop();        
    }
    public void imprimir(){
        System.out.println(" - -  - - LISTA PILA - - ");
        for (Persona persona : laPila) {
            System.out.println(persona);
        }
    }
}