/**
 * Halla el alterego de los numeros.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN3
{
    public int invertirNumero(int numero){
        int respuesta = 0;
        int ultDig;
        while(numero>0){
            ultDig = numero%10;
            respuesta = respuesta*10 + ultDig;
            numero = numero / 10;
        }
        return respuesta;
    }
}
