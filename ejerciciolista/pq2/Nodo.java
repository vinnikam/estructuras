package ejerciciolista.pq2;

public class Nodo {
    public String informacion;
    public Nodo siguienteNodo;    
    public Nodo(String informacion){
        this.informacion = informacion;
        siguienteNodo =  null;
    }
    @Override
    public String toString() {
        return "informacion : "+informacion+ " Siguiente nodo ->"+siguienteNodo;
    }
}
