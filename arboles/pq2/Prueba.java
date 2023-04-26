package arboles.pq2;
import java.util.Optional;

public class Prueba {
    public static void main(String[] args) {
        Nodo root = new Nodo(10);
        root.adicionar(5);
        root.adicionar(15);
        root.adicionar(8);
 
        Optional<Nodo> result = root.find(11);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("No tiene informacion");
        }
 
        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Informacion no encontrada");
        }
        System.out.println("Imprimir in order");
        root.imprimirInOrder();
        System.out.println("Imprimir pos order");
        root.imprimirPosOrder();
        System.out.println("Imprimir pre order");
        root.imprimirPreOrder();
    }
}
