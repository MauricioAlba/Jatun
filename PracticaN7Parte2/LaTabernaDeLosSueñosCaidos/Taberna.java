package LaTabernaDeLosSueñosCaidos;

/**
 * Simula un almacen de los recuerdos que olvidamos.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Taberna
{
    private Sueño[] sueños;
    private int posicionLibre;
    public Taberna(int tam){
        sueños = new Sueño [tam];
        posicionLibre = 0;
    }

    public String buscarSueños(String nombre){
        String res = "No se ha encontrado ese sueño";
        int posicion;
        boolean bandera = true;
        for(posicion = 0; posicion<sueños.length && bandera; posicion++){
            Sueño aux = sueños[posicion];
            String nomComparar = aux.getNombre();
            if(nomComparar.equals(nombre)){
                res = "Se ha encontrado el sueño";
                bandera = false;
            }
        }
        return res;
    }

    public String almacenarSueños(Sueño nuevo){
        String res;
        int posLibre = buscarPosLibre();
        if(posLibre<sueños.length){
            sueños[posLibre] = nuevo;
            res = "El sueño se agrego exitosamente";
        }else{
            res = "No ha sido posible almacenarlo, la memoria está llena";
        }
        return res;
    }

    public String eliminarSueños(int posicion){
        String res;
        if(posicion<sueños.length){
            if(sueños[posicion]!= null){
                sueños[posicion] = null;
                res = "El sueño ha sido eliminado correctamente";
            }else{
                res = "El espacio indicado está vacío";
            }
        }else{
            res = "La posición indicada no existe";
        }
        return res;
    }
    
    private int buscarPosLibre(){
        boolean bandera = true;
        int res = 0;
        for(int pos = 0; pos<sueños.length && bandera; pos++){
            if(sueños[pos]==null){
                bandera =false;
                res = pos;
            }
        }
        if(bandera){
            res = sueños.length;
        }
        return res;
    }
    
    public String verDetallesSueños(){
        String res = "";
        boolean bandera = true;
        for(int i = 0; i<sueños.length; i++){
            if(sueños[i]!=null){
                Sueño aux = sueños[i];
                res = res + "\n El nombre es: "+aux.getNombre()+" La descripcion es: "+aux.getDescripcion();
            }
        }
        return res;
    }
}
