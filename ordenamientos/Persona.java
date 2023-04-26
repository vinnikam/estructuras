package ordenamientos;

/**
 * Clase con datos de una persona, identificaicon y nombre. 
 * Se utiliza para ejemplificar ordenamiento
 * author: Vinni 
 * email: vinni9@gmail.com
 * 
 */
public class Persona{
    public long identificacion;
    public String nombre;
    public Persona(long identificacion){
        this.identificacion = identificacion;
        this.nombre = "NA";
    }
    
    public Persona(long identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.identificacion+" "+this.nombre;
    }
}