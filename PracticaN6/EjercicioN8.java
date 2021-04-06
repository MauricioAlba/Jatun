
/**
 * Formar un nuevo numero de manera cambiada con el ultimo y primer digito.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN8
{
    public int nuevoNumero(int numero){
        int respuesta;
        int ultDig = numero%10;
        int primDig;
        while(numero>10){
            numero = numero / 10;
        }
        primDig = numero;
        respuesta = ultDig*10 + primDig;
        return respuesta;
    }
}
