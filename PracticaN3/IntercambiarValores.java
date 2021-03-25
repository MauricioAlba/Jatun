
/**
 * Intercambia el valor de las variables.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class IntercambiarValores
{
    public String intercambiarValores(int a, int b, int c){
        String respuesta;
        int aux=0;
        aux = a;
        a = b;
        b = aux;
        aux = a;
        a = c;
        c = aux;
        respuesta = a + " "+b+ " "+c + " ";
        return respuesta;
    }
}
