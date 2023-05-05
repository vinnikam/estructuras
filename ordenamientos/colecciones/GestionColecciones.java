

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import ordenamientos.Persona;

public class GestionColecciones {
    List<Persona> personas;
    public GestionColecciones(){
        personas = new ArrayList<>();
    }
    public void adicionarPersona(Persona persona){
        this.personas.add(persona);
    }
    public void imprimir (){
        System.out.println(" - - - - -- - LISTA DE PERSONAS ---- ");
        for (int i = 0; i < this.personas.size(); i++){
            System.out.println(this.personas.get(i));

        }
        System.out.println("Fin");
    }

    public void ordenarAsc(){        
        Collections.sort(this.personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                Long dato1 = p2.getIdentificacion();
                Long dato2 = p1.getIdentificacion();
                return dato2.compareTo(dato1); 
                
            }
        });
        
    }
    public void ordenarDesc(){
        
        Collections.sort(this.personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
                Long dato1 = p2.getIdentificacion();
                Long dato2 = p1.getIdentificacion();
                
				return dato1.compareTo(dato2); 
                
			}
		});
    }
    public void ordenarNombreAsc(){        
        Collections.sort(this.personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                String dato1 = p2.getNombre();
                String dato2 = p1.getNombre();
                
                return dato2.compareTo(dato1); 
                
            }
        });
        
    }
    public void ordenarNombreDesc(){
        
        Collections.sort(this.personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
                String dato1 = p2.getNombre();
                String dato2 = p1.getNombre();
                
				return dato1.compareTo(dato2); 
                
			}
		});
    }
    public List<Persona> ordenarLamdaAsc(){ 
        List<Persona> personasOrden = this.personas;
        personasOrden.sort(Comparator.comparing(Persona::getIdentificacion)
                      .reversed()
                      .thenComparing(Comparator.comparing(Persona::getIdentificacion)
                      .reversed()));
        return personasOrden;
    }
    public void imprimir (List<Persona> personas){
        System.out.println(" - - - - -- - LISTA DE PERSONAS ---- ");
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));

        }
        System.out.println("Fin");
    }
}
