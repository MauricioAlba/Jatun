
/**
 * Calcular la circunferencia a partir del radio.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalcularCircunferencia
{
    public double calcularCircunferencia(int radio){
        double respuesta;
        int diametro = 2*radio;
        double pi = 3.14159;
        respuesta = pi * diametro;
        return respuesta;
    }
}
