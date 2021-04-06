
/**
 * Verificar si un numero es Unicornio.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN15
{
    public String verificarNumUnicornio(int numero){
        String respuesta;
        int cont = 0;
        int aux = numero;
        int div3;
        while(numero>0){
            numero = numero / 10;
            cont++;
        }
        if(cont % 2 == 0){
            for(int x = 1 ; x < (cont/2); x++){
                aux  = aux / 10;
            }
            div3 = aux % 10;
            aux = aux / 10;
            div3 = div3*10 + aux%10;
        }else{
            for(int y = 1 ; y <= (cont/2); y++){
                aux  = aux / 10;
            }
            div3 = aux % 10;
        }
        if(div3 % 3 == 0){
            respuesta = "Numero Unicornio";
        }else{
            respuesta = "Numero Normal";
        }
        return respuesta;
    }
}
