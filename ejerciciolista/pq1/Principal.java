package ejerciciolista.pq1;

import ejerciciolista.pq2.Lista;
import ejerciciolista.pq2.Nodo;

public class Principal{
    public static void main(String[] args) {
        System.out.println("Probando");

        Lista lista = new Lista();
        Nodo nodo = new Nodo("Arsenal");
        lista.adicionarNodo(nodo);
        Nodo nodo1 = new Nodo("Chelsea");
        lista.adicionarNodo(nodo1);
        Nodo nodo2 = new Nodo("Liverpool");
        lista.adicionarNodo(nodo2);
        lista.imprimir();
    }
}