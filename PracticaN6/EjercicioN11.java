
/**
 * Calcular una multiplicacion a traves de sumas.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN11
{
    public int multiplicarDosNumeros(int num1, int num2){
        int respuesta = 0;
        for(int x = 0; x<num2; x++){
            respuesta = respuesta + num1;
        }
        return respuesta;
    }
}
