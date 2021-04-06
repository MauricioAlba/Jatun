 /** 
 * Verificar si el numero ingresado es perfecto,abundante o defectivo.
 * 
 * @author (Mauicio) 
 * @version (1.0)
 */
public class EjercicioN6
{
    public String verificarNumero(int numero){
        String respuesta;
        int sumDiv = 1;
        for(int divisor = 2;divisor<=(numero/2);divisor++){
            if(numero%divisor == 0){
                sumDiv = sumDiv + divisor;
            }
        }
        if(sumDiv == numero){
            respuesta = "Es un numero Perfecto";
        }else if(sumDiv <= numero) {
            respuesta = "Es un numero Defectivo";
        }else{
            respuesta = "Es un numero Abundante";
        }
        return respuesta;
    }
}