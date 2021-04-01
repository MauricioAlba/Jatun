
/**
 * Verificar dos numeros si son parientes o no.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN5
{
    public String verificarNumerosParientes(int num1, int num2){
        String respuesta;
        respuesta = ((num1%num2 == 0)||(num2%num1 == 0))? "Es numero pariente": "No es numero pariente";
        return respuesta;
    }
}
