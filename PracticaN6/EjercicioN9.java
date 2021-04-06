/**
 * Transformar un numero de notacion decimal a notacion binaria.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN9
{
    public int calcularValorBinario(int numDecimal){
        int respuesta = 0;
        int aux = 0;
        int ultDig;
        boolean bandera = true;
        int cont = 1;
        while(numDecimal>0){
            ultDig = numDecimal%2;
            if(bandera == true && ultDig == 0){
                cont = cont*10;
            }else{
                bandera = false;
            }
            aux = aux * 10 + ultDig;
            numDecimal = numDecimal/2;
            ultDig = 0;
        }
        while(aux>0){
            ultDig = aux%10;
            respuesta = respuesta*10 + ultDig;
            aux = aux / 10;
        }
        return respuesta*cont;
    }
}
