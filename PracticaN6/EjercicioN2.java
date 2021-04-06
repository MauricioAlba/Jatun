/**
 * Verificar si un numero es primo o no.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN2
{
    public String verificarNumeroPrimo(int numero){
        String respuesta;
        boolean bandera = true;
        for(int div = 2; div<=(numero/2)&& bandera == true; div++){
            if(numero%div == 0){
                bandera = false;
            }
        }
        if(bandera == true){
            respuesta = "Es un numero primo";
        }else{
            respuesta = "No es un numero primo";       
        }
        return respuesta;
    }
}
