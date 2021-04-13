
/**
 * Simula un reproductor de musica simple.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class RitmoCornio
{
    private String estado;
    private String cancion;
    public RitmoCornio()
    {
        estado = "En pausa";
        cancion = "Dua Lipa - Last Dance";
    }

    public String reproducirCancion(){
        String res;
        if(estado.equals("En pausa")){
            estado = "Reproduciendo";
            res = "La Cancion ha empezado a sonar";
        }else{
            res = "Ya esta sonando una cancion";
        }
        return res;
    }
    
    public String pausarCancion(){
        String res;
        if(estado.equals("Reproduciendo")){
            estado = "En pausa";
            res = "La cancion ha sido pausada";
        }else{
            res = "La cancion ya se encuentra En pausa";
        }
        return res;
    }
    
    public void setCancion(){
        if(cancion.equals("Dua Lipa - Last Dance")){
            cancion = "Dua Lipa - Hotter than Hell";
        }else if(cancion.equals("Dua Lipa - Hotter than Hell")){
            cancion = "Christian Nodal - No Es Justo X El";
        }else{
            cancion = "Dua Lipa - Last Dance";
        }
    }
    
    public String getCancion(){
        return cancion;
    }
}
