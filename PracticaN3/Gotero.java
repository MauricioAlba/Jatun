
/**
 * Calcula cuantos mL. en el gotero despues de un tiempo.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class Gotero
{
    public int calcularCantidad(int aguaAlmacenada, int segundosTranscurridos){
        int respuesta;
        respuesta = aguaAlmacenada - segundosTranscurridos;
        return respuesta;
    }
}
