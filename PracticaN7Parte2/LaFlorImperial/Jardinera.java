package LaFlorImperial;


/**
 * Simula una jardinera.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Jardinera
{
    private FlorImperial[] flores;
    private int posicion;
    public Jardinera(){
        flores = new FlorImperial[10];
        posicion = 0;
    }
    
    public String agregarFlor(FlorImperial nuevaFlor){
        String res;
        if(posicion<flores.length){
            flores[posicion] = nuevaFlor;
            posicion++;
            res = "Flor Imperial agregada exitosamente";
        }else{
            res = "La jardinera ya esta llena";
        }
        return res;
    }
    
    public String crecerFlor(int posicion){
        String res;
        FlorImperial aux= flores[posicion];
        res = aux.crecer();
        return res;
    }
    
    public String verTamañoAct(int posicion){
        String res;
        FlorImperial aux= flores[posicion];
        res = "El tamaño actual es: "+aux.getTamaño();
        return res;
    }
}
