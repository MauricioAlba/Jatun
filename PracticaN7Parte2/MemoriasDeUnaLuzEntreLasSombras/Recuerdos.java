package MemoriasDeUnaLuzEntreLasSombras;


/**
 * Esta clase simulara a un recuerdo.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class Recuerdos
{
    private Fecha date;
    private String descripcion;
    public Recuerdos(int dia, int mes, int year, String descripcion){
        date = new Fecha(dia,mes,year);
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Recuerdos obtenerCopia(){
        int valorDia = getDay();
        int valorMes = getMonth();
        int valorYear = getYear();
        Recuerdos copia = new Recuerdos(valorDia, valorMes, valorYear, descripcion);
        return copia;
    }
    public int getDay(){
        return date.getDay();
    }
    public int getMonth(){
        return date.getMonth();
    }
    public int getYear(){
        return date.getYear();
    }}
