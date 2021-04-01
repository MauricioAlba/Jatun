/**
 * Determina la combinacion de 2 jugos mas barata.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN2
{
    public int calcularCombinacionDeJugos(int pJugo1, int pJugo2, int pJugo3){
        int respuesta;
        int sum1 = pJugo1 + pJugo2;
        int sum2 = pJugo1 + pJugo3;
        int sum3 = pJugo3 + pJugo2;
        if(sum1<sum2){
            if(sum1<sum3){
                respuesta = sum1;
            }else{
                respuesta = sum3;
            }
        }else{
            if(sum2<sum3){
                respuesta = sum2;
            }else{
                respuesta = sum3;
            }
        }
        return respuesta;
    }
}
