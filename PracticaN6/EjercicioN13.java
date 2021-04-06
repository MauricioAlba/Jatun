
/**
 * Verifica si dos numeros son amigos o no.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN13
{
    public String verificarNumerosAmigos(int num1, int num2){
        String respuesta;
        int divNum1 = 1;
        int divNum2 = 1;
        for(int x = 2;x <= (num1/2); x++ ){
            if(num1 % x == 0){
                divNum1 = divNum1 + x;
            }
        }
        for(int y = 2; y <= (num2/2); y++){
            if(num2 % y == 0){
                divNum2 = divNum2 + y;
            }
        } 
        if(divNum2 == num1 && divNum1 == num2){
            respuesta = "Son Amigos";
        }else{
            respuesta = "No son Amigos";
        }
        return respuesta;
    }
}
