package arboles.pq2;
import java.util.Optional;
public class Nodo{
    private Integer informacion;
    private Nodo izquierda;
    private Nodo derecha;
    public Nodo(Integer informacion) {
        this.informacion = informacion;
    }
    public void adicionar(Integer informacion) {
        if (informacion < this.informacion) {
            if (izquierda != null) {
                izquierda.adicionar(informacion);
            } else {
                izquierda = new Nodo(informacion);
            }
        } else {
            if (derecha != null) {
                derecha.adicionar(informacion);
            } else {
                derecha = new Nodo(informacion);
            }
        }
    }
    
    public Optional<Nodo> find(Integer informacion) {
        if (informacion == this.informacion) {
            return Optional.of(this);
        } else if (informacion < this.informacion) {
            if (this.izquierda != null) {
                return this.izquierda.find(informacion);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.derecha != null) {
                return this.derecha.find(informacion);
            } else {
                return Optional.empty();
            }
        }
    }
    
    public void imprimirInOrder(){
        if(izquierda!=null){
            izquierda.imprimirInOrder();
        }
        System.out.println(informacion);
        if(derecha!=null){
            derecha.imprimirInOrder();
        }
    }
 
    public void imprimirPreOrder(){
        System.out.println(informacion);
        if(izquierda!=null){
            izquierda.imprimirPreOrder();
        }
        if(derecha!=null){
            derecha.imprimirPreOrder();
        }
    }
 
    public void imprimirPosOrder(){
        if(izquierda!=null){
            izquierda.imprimirPreOrder();
        }
        if(derecha!=null){
            derecha.imprimirPreOrder();
        }
        System.out.println(informacion);
    }
    @Override
    public String toString() {
        return "Nodo [Informacion=" + informacion + ", izquierda=" + izquierda + ", derecha=" + derecha + "]";
    }
}