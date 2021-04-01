/**
 * Determinar si un año es bisiesto o no.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN9
{
    public String determinarSiEsBisiesto(int anio){
        String respuesta;
        if(anio%4!=0){
            respuesta = "No es bisiesto";
        }else if(anio%100==0){
            if(anio%400==0){
                respuesta = "Es bisiesto";
            }else{
                respuesta = "No es bisiesto";
            }
        }else{
            respuesta = "Es bisiesto";
        }
        return respuesta;
    }
}
