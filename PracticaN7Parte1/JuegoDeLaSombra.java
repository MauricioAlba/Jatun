
/**
 * Simularemos el juego de la sombra.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class JuegoDeLaSombra
{
    public String generarSombra(int valorInicialSombra, int cantHoras){
        String res;
        int[] arreglo = new int[cantHoras];
        int aux = 1;
        int valorActualSombra = valorInicialSombra;
        for(int i = 0; i < cantHoras; i++){
            arreglo[i] = valorActualSombra;
            if(valorActualSombra%2==0){
                valorActualSombra = valorActualSombra/2;
            }else{
                valorActualSombra = valorActualSombra + aux;
                aux++;
            }
        }
        res = generarArreglo(arreglo);
        return res;
    }
    private String generarArreglo(int[] arreglo){
        String res = "";;
        for(int i= 0; i<arreglo.length;i++){
            res = res + arreglo[i] +" ";
        }
        return res;
    }
}
