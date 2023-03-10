package ejerciciolista.pq2;
/**
 * Author :  Vinni vinni_@yahoo.com
 */
public class Lista {
    public Nodo nodoPrincipal;

    /**
     * Adiciona un nodo al final de la lista
     * @param nodo Nodo
     */
    public void adicionarNodo(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                this.nodoPrincipal.siguienteNodo = nodo;
            }
           

        }

    }
    /**
     * imprime toda la lista
     */
    public void imprimir(){
        System.out.println(this.nodoPrincipal);
        System.out.println(this.nodoPrincipal.siguienteNodo);
        


    }
    /**
     * borra el primer nodo de la lista y la reorganiza, El nodo nodo 2 queda de primero.
     * Si solo hay uno queda vacia
     */
    public void borrarPrimero(){

    }
    /**
     * Borra el ultimo nodo de la lista y reorganiza. EL penultimo nodo queda de primero 
     * Si solo hay uno queda vacia
     */
    public void borrarUltimo(){

    }
    /**
     * borra el nodo de la posicion
     */
    public void borrarNodoIntermedio(int posicion){

    }
}
