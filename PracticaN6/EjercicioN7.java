/**
 * Determinar si un numero es Narcicista o normal.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN7
{
    public String verificarNumNarcicista(int numero){
        String respuesta;
        int ultDig;
        int aux = numero;
        int cont = 0;
        int num2 = 0;
        int aux2;
        while(aux>0){
            aux = aux /10;
            cont++;
        }
        aux = numero;
        for(int x= 0 ; x<cont ; x++ ){
            ultDig = aux%10;
            aux = aux / 10;
            aux2 = 1;
            for(int y = 0; y<cont ; y++){
                aux2 = aux2 * ultDig;
            }
            num2 = num2 + aux2;
        }
        if(num2==numero){
            respuesta = "Narcicista";
        }else{
            respuesta = "Normal";
        }
        return respuesta;
    }
}
