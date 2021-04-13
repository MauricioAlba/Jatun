
/**
 * Simula una libreta co funcion recordatorio.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class UnicornisLibrumMemoriae
{
    private String tareaActual;
    private int cantTareas;
    private String estadoTareaActual;
    public UnicornisLibrumMemoriae(String nuevaTarea)
    {
        tareaActual = nuevaTarea;
        cantTareas = 1;
        estadoTareaActual = "En curso";
    }

    public String getEstadoTareaActual(){
        return "Tarea " + estadoTareaActual;
    }

    public void concluirTarea(){
        estadoTareaActual = "Concluida";
    }

    public String nuevaTarea(String nuevaTarea){
        String res;
        if(estadoTareaActual.equals("Concluida")){
            tareaActual = nuevaTarea;
            res = "Nueva Tarea Asignada";
            estadoTareaActual = "En curso";
            cantTareas++;
        }else{
            res = "La tarea en curso, aun no ha sido concluida";
        }
        return res;
    }
    
    public int getCantTareas(){
        return cantTareas;
    }
}
