
/**
 * Hallar el numero en desequilibrio dentro del arreglo.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class AnomaliaEnEquilibrio
{
    public String buscarNumeroDesequilibrio(int[] arreglo){
        String res = "";
        int inicio = 0; int fin = arreglo.length;
        int sum1 ;
        int sum2 ;
        boolean bandera = true;
        int numero = 0;
        while(inicio!=fin && bandera==true){
            sum1 = sumarNumeros(inicio, ((fin+inicio)/2), arreglo);
            sum2 = sumarNumeros(((fin+inicio)/2), fin, arreglo);
            if(sum1==sum2){
                res = "La suma de numeros es igual";
                bandera = false;
            }else if(sum1>sum2){
                if((fin-inicio)==1){
                    fin = inicio;
                    numero = sum1;
                }else{
                    fin = (fin+inicio)/2;
                }
            }else{
                if((fin-inicio)==1){
                    inicio = fin;
                    numero = sum2;
                }else{
                    inicio = (fin+inicio)/2;
                    numero = sum2;
                }
            }
        }
        if(res==""){
            res = "El numero en desequilibrio es: "+ numero;
        }
        return res;
    }

    private int sumarNumeros(int inicio, int fin, int[] arreglo){
        int suma=0;
        for(int i = inicio; i<fin ; i++){
            suma = suma + arreglo[i];
        }
        return suma;
    }
}
