
/**
 * Calcula la cantidad de hojas que se va a necesitar.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class UnicornioRecursivo
{
    public int cantidadHojas(int nPaginas){
        int respuesta;
        int mod = nPaginas % 2;
        respuesta = (nPaginas / 2) + mod;
        return respuesta;
    }
}
