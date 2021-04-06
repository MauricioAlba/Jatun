
/**
 * Verifica si dos numeros son pareja.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN14
{
    public String verificarNumParejas(int num1, int num2){
        String respuesta;
        int divp1 = 0;
        int divp2 = 0;
        for(int x = 2; x <= (num1/2); x++){
            if( num1 % x == 0){
                divp1 = divp1 + x;
            }
        }
        for(int y = 2; y <= (num1/2); y++){
            if( num2 % y == 0){
                divp2 = divp2 + y;
            }
        }
        if(divp1 == num2 && divp2 == num1){
            respuesta = "Son Novios";
        }else{
            respuesta = "No pasa nada";
        }
        return respuesta;
    }
}
