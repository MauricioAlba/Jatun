
/**
 * Simula un SylvanoCornio el cual crea Reflejos de lagrimas a partir
 * de savila.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class SylvanoCornio
{
    private boolean estSylvanoCornio;
    private int capActualSavia;
    private int capActualComponente;
    public SylvanoCornio()
    {
        estSylvanoCornio = false;
        capActualSavia = 0;
        capActualComponente = 0;
    }

    public String recolectarSavia(int cantSavia){
        String res;
        int aux = capActualSavia + cantSavia;
        if(estSylvanoCornio){
            if(aux <= 90){
                capActualSavia = capActualSavia + cantSavia;
                res = "Recoleccion exitosa";
            }else{
                res = "Espacio insuficiente";
            }
        }else{
            res = "El SylvanoCornio se encuentra apagado";
        }
        return res;
    }

    public String crearReflejosDeLagrimas(){
        String res;
        if(estSylvanoCornio){
            if(capActualComponente<20){
                if(capActualSavia>=50){
                    capActualComponente++;
                    res = "La accion ha sido completada con exito";
                    capActualSavia = capActualSavia - 50;
                }else{
                    res = "La cantidad de savia es insuficiente";    
                }
            }else{
                res = "No se puede realizar esta accion, espacio insuficiente"; 
            }
        }else{
            res = "El SylvanoCornio se encuentra apagado";
        }

        return res;
    }

    public String retirarComponente(){
        capActualComponente = 0;
        return "Los componentes han sido retirados exitosamente";
    }

    public void encenderSylvanoCornio(){
        estSylvanoCornio = true;
    }

    public void apagarSylvanoCornio(){
        estSylvanoCornio = false;
    }
    
}
