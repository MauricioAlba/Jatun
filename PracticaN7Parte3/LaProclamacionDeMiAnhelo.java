
/**
 * Implementa un metodo el cual cuenta la cantidad de signos se puntuacion.
 * 
 * @author (Matt4) 
 * @version (a version number or a date)
 */
public class LaProclamacionDeMiAnhelo
{
    public String contarSignosPuntuacion(String cadena){
        int res = 0;
        for(int pos = 0; pos<cadena.length(); pos++){
            res = res + buscarSignosDePuntuacion(cadena.charAt(pos));
        }
        return "Existen "+res+" signos de puntuación";
    }
    
    private int buscarSignosDePuntuacion(int letra){
        String signos = ".,:;¡!¿?'()_-";
        boolean bandera = true;
        int res = 0;
        for(int posSignos = 0; posSignos<signos.length() && bandera; posSignos++){
            if(signos.charAt(posSignos)==letra){
                bandera = false;
                res = 1;
            }
        }
        return res;
    }
}