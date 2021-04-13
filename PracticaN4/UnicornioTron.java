
/**
 * Simula una maquina de apuesta.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class UnicornioTron
{
    private int premio;
    private int numAleatorio;
    private int cantFichas;
    private int premioActual;
    public UnicornioTron(int premio)
    {
        this.premio = premio;
        premioActual = premio;
        numAleatorio = (int)Math.random()*10+1;
        cantFichas = 0;
    }

    public String adivinarNumero(int numIngresado){
        String res;
        if(premioActual>0){
            if(cantFichas>=1){
                cantFichas--;
                if(numAleatorio == numIngresado){
                    res = "Ganaste";
                    premioActual = 0;
                }else{
                    res = "Fallaste este intento";
                }
            }else{
                res = "No hay ficha(s)";
            }
        }else{
            res = "No hay premio";
        }

        return res;
    }
    
    public void recargarMaquina(){
        premioActual = premio;
        numAleatorio = (int)Math.random()*10+1;
    }
    
    public void insertarFichas(int numFichas){
        cantFichas = numFichas;
    }
    
    public int getPremio(){
        return premioActual;
    }
}
