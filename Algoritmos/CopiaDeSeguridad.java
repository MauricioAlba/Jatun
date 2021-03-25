
/**
 * Este codigo representa un algoritmo que realiza copias de seguridad.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class CopiaDeSeguridad
{
    int cantidadDeCd, almacenamientoCd, almacenamientoACopiar; 
    public CopiaDeSeguridad(){
        almacenamientoCd = 700;
        almacenamientoACopiar = 5120;
    }
    public int cdNecesarios(){
        if(almacenamientoACopiar % almacenamientoCd == 0){
            cantidadDeCd = almacenamientoACopiar / almacenamientoCd;
        }else{
            cantidadDeCd = (almacenamientoACopiar / almacenamientoCd)+1;
        }
        return cantidadDeCd;
    }
    public int almacenaientoDemas(){
        int almacenamientoSobra;
        if(almacenamientoACopiar % almacenamientoCd == 0){
            almacenamientoSobra = 0;
        }else{
            almacenamientoSobra = almacenamientoCd*cantidadDeCd - almacenamientoACopiar;
        }
        return almacenamientoSobra;
    }
}
