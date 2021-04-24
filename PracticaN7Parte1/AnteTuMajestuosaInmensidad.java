
/**
 * Clasifica la luminosidad de las estrellas de una manera peculiar.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class AnteTuMajestuosaInmensidad
{
    public int[] ordenarPorLuminosidad(int []arreglo){
        for(int i = 0 ; i<arreglo.length; i++){
            for(int pos = 1; pos<arreglo.length -i; pos++){
                if(arreglo[pos-1]%2==0 && arreglo[pos]%2==0){
                    if(arreglo[pos-1]<arreglo[pos]){
                        int aux = arreglo[pos-1];
                        arreglo[pos-1]=arreglo[pos];
                        arreglo[pos]=aux;
                    }
                }else if(arreglo[pos-1]%2!=0 && arreglo[pos]%2!=0){
                    if(arreglo[pos-1]>arreglo[pos]){
                        int aux = arreglo[pos-1];
                        arreglo[pos-1]=arreglo[pos];
                        arreglo[pos]=aux;
                    }
                }else if(arreglo[pos-1]%2==0 && arreglo[pos]%2!=0){
                    int aux = arreglo[pos-1];
                    arreglo[pos-1]=arreglo[pos];
                    arreglo[pos]=aux;
                }
            }
        }
        return arreglo;
    }
}

