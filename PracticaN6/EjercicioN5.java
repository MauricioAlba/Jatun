/**
 * Calcular la cantidad de acarreos efectuados en la suma.
 * 
 * @author (Mauicio) 
 * @version (1.0)
 */
public class EjercicioN5
{
    public int contarAcarreos(int num1, int num2){
        int respuesta = 0;
        int ultDig1, ultDig2;
        int acarreo = 0;
        while(num1 > 0 || num2 > 0){
            ultDig1 = num1%10; ultDig2 = num2%10;
            if(ultDig1 + ultDig2 + acarreo >= 10){
                respuesta++;
                acarreo = 1;
            }else{
                acarreo = 0;
            }
            num1 = num1/10 ; num2 = num2/10;
        }
        
        return respuesta;
    }
}
