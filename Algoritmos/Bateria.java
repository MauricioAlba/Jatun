
/**
 * Calcula la bateria restante del celular.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bateria
{
    public int bateriaRestante(int pestadoBateria, int pJuegos,int pRevisarRedesSociales,int pVerYoutube){
        double jugar = 20/60;
        double revisarRedesSociales = 10/60;
        double verYoutube = 15/60;
        int estadoBateria = pestadoBateria;
        estadoBateria = (int)(pestadoBateria - (pJuegos * jugar));
        estadoBateria = (int)(pestadoBateria - (pRevisarRedesSociales * revisarRedesSociales));
        estadoBateria = (int)(pestadoBateria - (pVerYoutube * verYoutube));
        return estadoBateria;
    }
}
