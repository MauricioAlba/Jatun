
/**
 * Simula un bot que saluda.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class UnicornioBot
{
    private String nombreUsuario;
    public UnicornioBot(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
    }

    public String saludar(){
        return "Hola "+ nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
}
