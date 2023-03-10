package pq1;

import pq2.Lista;
import pq2.Nodo;

public class Principal{
    public static void main(String[] args) {
        System.out.println("Probando");

        Lista lista = new Lista();
        Nodo nodo = new Nodo("Arsenal");
        lista.adicionarNodo(nodo);
        Nodo nodo1 = new Nodo("Chelsea");
        lista.adicionarNodo(nodo1);
        lista.imprimir();
    }
}