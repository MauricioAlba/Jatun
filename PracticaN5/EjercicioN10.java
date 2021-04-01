/**
 * Determinar si un numero esta en crecimiento.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN10
{
    public String determinarNumeroCrecimiento(int numero){
        String respuesta;
        int primDig = numero / 100;
        int segDig = (numero/10)%10;
        int terDig = numero%10;
        if(primDig<=segDig && segDig<=terDig){
            respuesta = "Es un numero en crecimiento";
        }else{
            respuesta = "NO esta en crecimiento";
        }
        return respuesta;
    }
}
