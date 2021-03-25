
/**
 * Verifica el ultimo numero de la identificacion.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class MaquinaDeVerificacion
{
    public int ultimoNumero(int numero){
        int numeroAVerificar;
        numeroAVerificar = numero % 10;
        return numeroAVerificar;
    }
}
