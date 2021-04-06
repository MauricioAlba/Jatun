
/**
 * Calcular la division de dos numeros de la manera clasica.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN12
{
    public int division(int num1, int num2){
        int respuesta = 0;
        while(num1>=num2){
            num1 = num1-num2;
            respuesta++;
        }
        return respuesta;
    }
}
