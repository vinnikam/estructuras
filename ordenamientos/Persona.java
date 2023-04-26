package ordenamientos;

/**
 * Clase con datos de una persona, identificaicon y nombre. 
 * Se utiliza para ejemplificar ordenamiento
 * author: Vinni 
 * email: vinni9@gmail.com
 * 
 */
public class Persona{
    private long identificacion;
    private String nombre;
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

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}