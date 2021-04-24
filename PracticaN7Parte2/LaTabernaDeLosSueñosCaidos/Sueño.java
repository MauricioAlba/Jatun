package LaTabernaDeLosSueñosCaidos;


/**
 * Simula un sueño.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Sueño
{
    private String nombre;
    private String descripcion;
    public Sueño(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
