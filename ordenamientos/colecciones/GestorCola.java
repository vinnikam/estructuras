import java.util.LinkedList;
import java.util.Queue;
import ordenamientos.Persona;

/**
 * author : Vinni
 * Clase para ejemplificar una Cola con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura FIFO (First In - First Out, o Primero en entrar - primero en salir). 
 * 
 **/
public class GestorCola {
    private Queue<Persona> laCola = new LinkedList<Persona>();
    public void adicionar(Persona p){
        laCola.add(p);        
    }
    public void retirar(){
        laCola.poll();        
    }
    public void imprimir(){
        System.out.println(" - -  - - LISTA COLA - - ");
        for (Persona persona : laCola) {
            System.out.println(persona);
        }
    }
}
