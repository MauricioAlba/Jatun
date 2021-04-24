package LaDiosaDeLosSueños;

/**
 * Simula un dream de la gente.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Dreams
{
    private int prioridad;
    private String topico;
    private String descripcion;
    public Dreams(int prioridad, String topico, String descripcion){
        this.prioridad = prioridad;
        this.topico = topico;
        this.descripcion = descripcion;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public String getTopico(){
        return topico;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
