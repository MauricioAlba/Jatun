
/**
 * Calcula cuantos usarios mas puedes seguir.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class UnicornioApp
{
    public int usuariosAdicionales(int uSiguiendo, int uQueTeSiguen){
        int respuesta;
        respuesta =(uQueTeSiguen*3) - uSiguiendo;
        return respuesta;
    }
}
