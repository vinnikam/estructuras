
import java.util.List;

import ordenamientos.Persona;

public class Principal {
    public static void main(String[] args) {
        GestionColecciones gestor = new GestionColecciones();
        Persona p = new Persona(25);
        gestor.adicionarPersona(p);

        gestor.adicionarPersona(new Persona(5, "Elsa Patero"));
        gestor.adicionarPersona(new Persona(9, "Eldoc Torcito"));
        gestor.adicionarPersona(new Persona(45, "Elin Geniero"));

        System.out.println(" Lista Original ");
        gestor.imprimir();
        gestor.ordenarAsc();
        System.out.println(" Lista despues de ordenar Ascendente ");
        gestor.imprimir();
        gestor.ordenarDesc();
        System.out.println(" Lista despues de ordenar Descendente ");
        gestor.imprimir();
        System.out.println("- - -- NOMBRES - - - - ");
        gestor.ordenarNombreDesc();
        System.out.println(" Lista despues de ordenar Descendente ");
        gestor.imprimir();
        gestor.ordenarNombreAsc();
        System.out.println(" Lista despues de ordenar Ascendente ");
        gestor.imprimir();
        
        List<Persona> lalista = gestor.ordenarLamdaAsc();
        System.out.println(" Lista despues de ordenar Lambda Ascendente-> ");
        gestor.imprimir(lalista);
        
    }
    
        
}
