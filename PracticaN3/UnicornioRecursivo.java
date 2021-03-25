
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
        if(nPaginas % 2 ==0){
            respuesta = nPaginas / 2;
        }else{
            respuesta = 1+(nPaginas / 2);
        }
        return respuesta;
    }
}
