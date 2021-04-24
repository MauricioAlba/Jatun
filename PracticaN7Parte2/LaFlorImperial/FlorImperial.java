package LaFlorImperial;

/**
 * Simula el crecimiento de una flor Imperial.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class FlorImperial
{
    private int tamActual;
    public FlorImperial(int tamInicial){
        tamActual = tamInicial;
    }

    public String crecer(){
        String res;
        int aux = tamActual*2;
        if(aux<100000000){
            tamActual = aux;
            res = "Crecimiento exitoso";
        }else{
            res = "Ya llego a su limite de crecimiento";
        }
        return res;
    }

    public int getTamaño(){
        return tamActual;
    }
}