
/**
 * Este programa determina si el dia ingresado es un dia normal o una cruz 
 * para Dariel.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class Ejercicio3
{
    public String determinarElDia(int dia){
        String respuesta;
        int dig1 = dia/10;
        int dig2 = dia%10;
        if(dig1%2==0 && dig2%2!=0){
            respuesta = "Cruz de Dariel";
        }else if(dig1%2!=0 && dig2%2==0){
            respuesta = "Cruz de Dariel";
        }else{
            respuesta = "Dia normal";
        }
        return respuesta;
    }
}
