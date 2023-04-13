package ejerciciolista.pq3;

public class Nodo {
    public String informacion;
    public Nodo anteriorNodo;    
    public Nodo siguienteNodo;    
    public Nodo(String informacion){
        this.informacion = informacion;
        siguienteNodo =  null;
        anteriorNodo = null;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Anterior nodo -> "+ anteriorNodo + ": informacion : "+informacion+ " Siguiente nodo ->"+siguienteNodo;
    }
}
