package ejerciciolista.pq3;
/**
 * Author :  Vinni vinni_@yahoo.com
 */
public class ListaDoble {
    public Nodo nodoPrincipal;

        /**
     * Adiciona un nodo al final de la lista
     * @param nodo Nodo
     */
    public void adicionarNodoFin(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                Nodo aux = this.nodoPrincipal;
                while(aux.siguienteNodo != null){
                    aux = aux.siguienteNodo;
                }
                aux.siguienteNodo = nodo;
            }
           
        }

    }
    /**
     * Adiciona un nodo al inicio de la lista
     * @param nodo Nodo
     */
    public void adicionarNodoInicio(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                Nodo aux = this.nodoPrincipal;
                 nodo.siguienteNodo = aux;
                 this.nodoPrincipal = nodo;
            }
           

        }

    }
    /**
     * imprime toda la lista
     */
    public void imprimir(){
        Nodo aux = this.nodoPrincipal;
        while (aux != null){
            System.out.println(aux.informacion);
            aux = aux.siguienteNodo;

        }
        //System.out.println(this.nodoPrincipal);
        //System.out.println(this.nodoPrincipal.siguienteNodo);

    }
    public String obtenerLista(){
        Nodo aux = this.nodoPrincipal;
        StringBuilder listado = new StringBuilder();
        while (aux != null){
            listado.append(aux.informacion+"\n");
            aux = aux.siguienteNodo;
        }
        return listado.toString();
    }
    /**
     * borra el primer nodo de la lista y la reorganiza, El nodo nodo 2 queda de primero.
     * Si solo hay uno queda vacia
     */
    public void borrarPrimero(){
        if (this.nodoPrincipal.siguienteNodo == null)
            this.nodoPrincipal = null;
        else
        {
            nodoPrincipal = nodoPrincipal.siguienteNodo;
        }

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
