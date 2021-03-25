
/**
 * Evalua un caracter y devuelve el siguiente caracter.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class SiguienteCaracter
{
    public char siguienteCaracter(char caracter){
        char respuesta;
        int aux = (int) caracter;
        aux = aux +1;
        respuesta = (char)aux;
        return respuesta;
    }
}
