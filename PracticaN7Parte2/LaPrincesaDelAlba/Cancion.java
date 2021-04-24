package LaPrincesaDelAlba;


/**
 * Simula una cancion.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Cancion
{
    private String nombreAutor;
    private String tituloCancion;
    public Cancion(String nombreAutor, String tituloCancion){
        this.nombreAutor = nombreAutor;
        this.tituloCancion = tituloCancion;
    }
    
    public String getNombreAutor(){
        return nombreAutor;
    }
    
    public String getTituloCancion(){
        return tituloCancion;
    }
    
    public Cancion getCancion(){
        String nombre = nombreAutor;
        String titulo = tituloCancion;
        Cancion copia = new Cancion(nombre, titulo);
        return copia;
    }
}
