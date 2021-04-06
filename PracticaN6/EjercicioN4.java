/**
 * Calcula el factorial.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN4
{
    public int calcularFactorial(int numero){
        int respuesta = 1;
        for(int aux = 1; numero>0 && aux<=numero;aux++){
            respuesta = respuesta*aux;
        }
        return respuesta;
    }
}
