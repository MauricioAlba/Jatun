package MemoriasDeUnaLuzEntreLasSombras;

/**
 * Simula una mente que puede guardar recuerdos.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Mente
{
    private Recuerdos[] memoria;
    private int posLibre;
    public Mente(int tam){
        memoria = new Recuerdos[tam];
        posLibre = 0;
    }

    public String agregarRecuerdos(Recuerdos nuevo){
        String res;
        if(posLibre<memoria.length){
            memoria[posLibre] = nuevo;
            posLibre++;
            res = "Recuerdo agregado exitosamente";
        }else{
            res = "No hay espacio en el array";
        }
        return res;
    }

    public String obtenerRecuerdosDeLuz(){
        String res;
        if(posLibre==memoria.length){
            Recuerdos aux  = memoria[memoria.length/2];
            res = aux.getDescripcion();
        }else{
            res = "El array aun no esta lleno";
        }
        return res;
    }

    public void ordenarPorDia(){
        for(int i=0; i<memoria.length-1; i++){
            for(int pos = 0; pos<memoria.length-1-i; pos++){
                Recuerdos actual = memoria[pos];
                Recuerdos vecino = memoria[pos+1];
                int diaRecuerdoActual = actual.getDay();
                int diaRecuerdoVecino = vecino.getDay();
                if(diaRecuerdoActual > diaRecuerdoVecino){
                    Recuerdos aux = actual.obtenerCopia();
                    memoria[pos] = vecino.obtenerCopia();
                    memoria[pos+1] = aux;
                }
            }
        }
    }
}

