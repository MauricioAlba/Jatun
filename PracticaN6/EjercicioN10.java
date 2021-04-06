/**
 * Verificar si el valor ingresado en notacion decimal es Odioso o Malvado.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN10
{
    public String verificarNumOdiosoMalvado(int numDecimal){
        String respuesta;
        int numDeUnos = 0;
        int ultDig;
        while(numDecimal>0){
            ultDig = numDecimal % 2 ;
            numDecimal = numDecimal / 2;
            if(ultDig == 1){
                numDeUnos++;
            }
        }
        if(numDeUnos % 2 == 0){
            respuesta = "Malvado";
        }else{
            respuesta = "Odioso";
        }
        return respuesta;
    }
}
