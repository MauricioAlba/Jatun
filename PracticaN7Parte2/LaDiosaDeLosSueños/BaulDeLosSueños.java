package LaDiosaDeLosSueños;


/**
 * Simula una reliquia que cumple los sueños.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class BaulDeLosSueños
{
    private Dreams[] dreams;
    private int posLibre;
    public BaulDeLosSueños(int tam){
        dreams = new Dreams[tam];
        posLibre = 0;
    }
    
    public String agregarDream(Dreams newDream){
        String res;
        if(posLibre<dreams.length){
            dreams[posLibre] = newDream;
            posLibre++;
            res = "Agregado exitosamente";
        }else{
            res = "La memoria ya esta llena";
        }
        return res;
    }
    
    public void ordenarPorPrioridad(){
        for(int i = 0 ; i<dreams.length-1; i++){
            for(int pos = 1; pos<posLibre-i; pos++){
                Dreams actual = dreams[pos-1];
                Dreams vecino = dreams[pos];
                if(actual.getPrioridad()>vecino.getPrioridad()){
                    Dreams aux = new Dreams(actual.getPrioridad(), actual.getTopico(), actual.getDescripcion());
                    dreams[pos-1] = dreams[pos];
                    dreams[pos] = actual;
                }
            }
        }
    }
    
    public String cumplirPrimerDeseo(){
        String res;
        ordenarPorPrioridad();
        if(dreams[0]!=null){
            dreams[0] = null;
            res = "Deseo cumplido con exito";
            posLibre--;
            actualizarArreglo(0);
        }else{
            res = "No hay ningun deseo";
        }
        return res;
    }
    
    private String cumplirDeseoPorTopico(String topico){
        String res = "No hay ningun deseo con ese topico";
        boolean bandera = true;
        for(int i = 0; i<=posLibre && bandera; i++){
            Dreams actual = dreams[i];
            if(actual.getTopico().equals(topico)){
                dreams[i] = null;
                res = "Deseo cumplido con exito";
                bandera =false;
                posLibre--;
                actualizarArreglo(i);
            }
        }
        
        return res;
    }
    
    public void actualizarArreglo(int posicion){
        boolean bandera = true;
        for(int pos = posicion+1; pos<dreams.length && bandera; pos++ ){
            if(dreams[pos] == null){
                bandera = false;
            }else{
                dreams[pos-1] = dreams[pos];
                dreams[pos] = null;
            }
        }
    }
}
