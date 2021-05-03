
/**
 * Contar la cantidad de vocales que hay en la cadena.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class RebeldiasYDistinciones
{
    public String contarVocales(String cad){
        String cadena = cad.toLowerCase();
        int res = 0;
        for(int posCad = 0; posCad<cadena.length();posCad++){
            res = res + buscarVocales(cadena.charAt(posCad));
        }
        return "Existen "+res+" vocales.";
    }
    
    private int buscarVocales(int letra){
        String vocales = "aeiouüéáíóú";
        int res = 0;
        boolean bandera = true;
        for(int posVocales = 0; posVocales<vocales.length() && bandera; posVocales++){
            if(vocales.charAt(posVocales)==letra){
                res = 1;
                bandera = false;
            }
        }
        return res;
    }
}
