package ordenamientos;
/**
 * Clase que probar los ordenamientos  BubbleSort y InsertionSort
 * author: Vinni 
 * email: vinni9@gmail.com
 * 
 */
public class Principal{
    public static void main(String[] args) {
        GestionOrdenamientos gestor = new GestionOrdenamientos(4);
        Persona p = new Persona(25);
        gestor.adicionarPersona(p);

        gestor.adicionarPersona(new Persona(5, "Elsa Patero"));
        gestor.adicionarPersona(new Persona(9, "Eldoc Torcito"));
        gestor.adicionarPersona(new Persona(45, "Elin Geniero"));

        gestor.imprimirOriginal();
        gestor.ordenaBubbleSort();
        System.out.println(" Ordena BubleSort ");        
        gestor.imprimirOrdenado();
        
        System.out.println(" Ordena InsertionSort ");        
        gestor.ordenaInsertionSort();
        gestor.imprimirOrdenado();
        

    }
} 