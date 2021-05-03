
/**
 * Invierte la posicion de cadenas.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class ZenithYNadir
{
    public String invertirCadena(String cadena){
        String res = "";
        for(int pos = 0; pos<cadena.length();pos++){
            res = cadena.charAt(pos) + res;
        }
        return res;
    }
}
