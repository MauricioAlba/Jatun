/**
 * Identifica si el numero es capicua.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN1
{
    public String identificarNumeroCapicua(int numero){
        String respuesta;
        if(numero%10 == numero/100){
            respuesta = "Si";
        }else{
            respuesta = "No";
        }
        return respuesta;
    } 
}
