
/**
 * Determinar el color del semaforo actual despues de n veces cambio.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN4
{
    public String mostrarEstadoSemaforo(String colorSem, int numero){
        String respuesta;
        int estado = 0;
        switch (colorSem){
            case "rojo": estado = 1; break;
            case "verde": estado = 2; break;
            case "amarillo": estado = 3; break;
            default: respuesta = "El dato que ingreso es invalido";
        }
        estado = estado + numero;
        estado = estado%3;
        if(estado == 1){
            respuesta = "rojo";
        }else if(estado == 2){
            respuesta = "verde";
        }else{
            respuesta = "amarillo";
        }
        return respuesta;
    }
}
