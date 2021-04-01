/**
 * Identificar quien es el mayor, el mediano y el menor.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN6
{
    public String identificarHijos(String hijo1, int edad1, String hijo2, int edad2,String hijo3, int edad3){
        String respuesta, mayor, medio, menor;
        int num1, num2;
        if(edad1>edad2 && edad1>edad3){
            mayor = hijo1;
        }else if(edad2>edad1 && edad2>edad3){
            mayor = hijo2;
        }else{
            mayor = hijo3;
        }
        if(edad1<edad2 && edad1<edad3){
            menor = hijo1;
        }else if(edad2<edad1 && edad2<edad3){
            menor = hijo2;
        }else{
            menor = hijo3;
        }
        if(hijo1!=mayor && hijo1!=menor){
            medio = hijo1;
        }else if(hijo2!=mayor && hijo2!=menor){
            medio = hijo2;
        }else{
            medio = hijo3;
        }
        respuesta = "El hermano mayor es "+mayor+" El hermano del medio es "+medio+" El hermano menor es "+menor;
        return respuesta;
    }
}
