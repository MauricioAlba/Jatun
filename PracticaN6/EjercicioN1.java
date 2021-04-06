
/**
 * Verifica la cantidad de digitos del numero ingresado.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN1
{
    public int cantidadDeDigitos(int numero){
        int respuesta=0;
        while(numero>0){
            numero = numero/10;
            respuesta++;
        }
        return respuesta;
    }
}
