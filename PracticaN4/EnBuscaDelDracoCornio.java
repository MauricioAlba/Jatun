
/**
 * Simula un juego de battleship.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class EnBuscaDelDracoCornio
{
    private int posicionX;
    private int posicionY;
    private int intentos;
    public EnBuscaDelDracoCornio(int posicionX, int posicionY)
    {
        this.posicionX = (int)Math.random()*10+1;;
        this.posicionY = (int)Math.random()*10+1;
        intentos = 3;
    }

    public void reiniciarJuego(){
        this.posicionX = (int)Math.random()*10+1;;
        this.posicionY = (int)Math.random()*10+1;
        intentos = 3;
    }

    public String evaluarPosicion(int pingresadaX, int pingresadaY){
        String res;
        if(intentos>0){
            if(posicionX==pingresadaX && posicionY==pingresadaY){
                res =  "Felicidades, acabas de encontrar en Tesoro Del DracoCornio";
            }else{
                res = evaluarPosicionX(pingresadaX)+", "+evaluarPosicionY(pingresadaY);
            }
            intentos--;
        }else{
            res = "Lo siento, perdiste, me saludas al Megalodon";
        }
        return res;
    }

    private String evaluarPosicionX(int x){
        String res;
        int aux;
        aux = Math.abs(posicionX - x);
        if(aux == 0){
            res = "X esta en su poisicion";
        }else if(aux<=2){
            res = "X esta cerca";
        }else{
            res = "X esta lejos";
        }
        return res;
    }

    private String evaluarPosicionY(int y){
        String res;
        int aux;
        aux = Math.abs(posicionX - y);
        if(aux == 0){
            res = "Y esta en su poisicion";
        }else if(aux<=2){
            res = "Y esta cerca";
        }else{
            res = "Y esta lejos";
        }
        return res;
    }
}
