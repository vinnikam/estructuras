import java.util.LinkedList;

import ordenamientos.Persona;

/**
 * author : Vinni
 * Clase para ejemplificar una Cola con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura FIFO (First In - First Out, o Primero en entrar - primero en salir). 
 * 
 **/

public class GestorLIstaEncadenada {
    private LinkedList<Persona> laLista = new LinkedList<>();    
    public void adicionar(Persona p){
        laLista.add(p);        
    }
    public void retirar(){
        laLista.remove(); 
    }
    public void adicionaPr(Persona p){
        laLista.addFirst(p);        
    }
    
    public void imprimir(){
        System.out.println(" - -  - - LISTA ENCADENADA - - ");
        for (Persona persona : laLista) {
            System.out.println(persona);
        }
    }
}
