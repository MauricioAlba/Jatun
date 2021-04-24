
/**
 * Analiza el cielo limitado y busca las estrellas que han dejado de brillar.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class EstrellasSinBrillar
{
    public String contarEstrellasSinLuz(int[] arreglo, int inicio, int fin){
        int cont = 0;
        for(int i = inicio; i <= fin ; i++){
            if(arreglo[i] == 0){
                cont++;
            }
        }
        return "Hay "+cont+" estrella(s) que han dejado de brillar";
    }
}
