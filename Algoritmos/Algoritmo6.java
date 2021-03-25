
/**
 * Cuantos minutos duermen los jovenes.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class Algoritmo6
{
    public int calcularHora(){
     int horaInicial = 2;
     int horaFinal = 11;
     int minutoInicial = 45;
     int minutoFinal = 25;
     int hora;
     hora = horaFinal - horaInicial;
     if((minutoFinal - minutoInicial)<0){
            hora += 1;
        }
     return hora;
    }
    public int calcularMinutos(){
        int minutos;
        int minutoInicial = 45;
        int minutoFinal = 25;
        if(minutoFinal<minutoInicial){
            minutos = 60-(minutoInicial-minutoFinal);
        }else{
            minutos = minutoFinal - minutoInicial;
        }
        return minutos;
    }
}
