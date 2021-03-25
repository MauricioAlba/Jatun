
/**
 * Calcula la cantidad maxima que puede entrar en un video.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class Youtuber
{
    public int cantidadMaximaCanciones(){
        int duracionVideo = 15;
        double duracionMinCancion = 2.5;
        int cantidadCanciones = (int)(duracionVideo/duracionMinCancion);
        return cantidadCanciones;
    }
}
