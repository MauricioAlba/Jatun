package LaPrincesaDelAlba;

/**
 * Simula un reproductor de musica magico.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class PiedraDeHelitz
{
    private Cancion[] listaReproduccion;
    private int posLibre; 
    public PiedraDeHelitz(int tam){
        listaReproduccion = new Cancion[tam];
        posLibre = 0;
    }

    public void ordenarPorAutor(){
        int max = listaReproduccion.length-1;
        for(int i = 0; i<max; i++){
            for(int pos = 0; pos< max-i; pos++){
                Cancion actual = listaReproduccion[pos];
                Cancion siguiente = listaReproduccion[pos+1];
                if(actual.getNombreAutor().compareTo(siguiente.getNombreAutor())>0){
                    Cancion aux = actual.getCancion();
                    listaReproduccion[pos] = listaReproduccion[pos+1];
                    listaReproduccion[pos+1]=aux;
                }
            }
        }
    }

    public void ordenarPorTituloCancion(){
        int max = listaReproduccion.length-1;
        for(int i = 0; i<max; i++){
            for(int pos = 0; pos< max-i; pos++){
                Cancion actual = listaReproduccion[pos];
                Cancion siguiente = listaReproduccion[pos+1];
                if(actual.getTituloCancion().compareTo(siguiente.getTituloCancion())>0){
                    Cancion aux = actual.getCancion();
                    listaReproduccion[pos] = listaReproduccion[pos+1];
                    listaReproduccion[pos+1]=aux;
                }
            }
        }
    }

    public String agregarCancion(Cancion nuevaCancion){
        String res;
        buscarPosLibre();
        if(posLibre<listaReproduccion.length){
            listaReproduccion[posLibre] = nuevaCancion;
            res = "Agregado exitosamente";
        }else{
            res= "La memoria se encuentra llena";
        }
        return res;
    }

    private int buscarPosLibre(){
        boolean bandera = true;
        int res = 0;
        for(int pos = 0; pos<listaReproduccion.length && bandera; pos++){
            if(listaReproduccion[pos]==null){
                bandera =false;
                posLibre = pos;
            }
        }
        if(bandera){
            posLibre = listaReproduccion.length;
        }
        return res;
    }

    public String quitarCancion(int posicion){
        String res;
        if(posicion<5){
            if(listaReproduccion[posicion]!= null){
                listaReproduccion[posicion] = null;
                res = "El sueño ha sido eliminado correctamente";
            }else{
                res = "El espacio indicado está vacío";
            }
        }else{
            res = "La posición indicada no existe";
        }
        return res;
    }

    public String reemplazarCancion(Cancion nuevaCancion, int posicion){
        String res;
        if(posicion<5){
            listaReproduccion[posicion] = nuevaCancion;
            res = "Agregado exitosamente";
        }else{
            res= "El dato ingresado no es valido";
        }
        return res;
    }

    private void ordenarCadena(int pos, String cadena1, String cadena2){
        if(cadena1.compareTo(cadena2)==1){
            Cancion aux = listaReproduccion[pos];
            listaReproduccion[pos] = listaReproduccion[pos+1];
            listaReproduccion[pos+1]=aux;
        }
    }
}
