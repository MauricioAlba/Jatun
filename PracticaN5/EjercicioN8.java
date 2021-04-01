/**
 * Escribir de forma literal la fecha ingresada de manera numerica.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class EjercicioN8
{
    public String mostrarFecha(int dia,int mes, int año){
        String respuesta;
        String mesAux;
        if(mes == 1){
            mesAux = "Enero";
        }else if(mes == 2){
            mesAux = "Febrero";
        }else if(mes == 3){
            mesAux = "Marzo";
        }else if(mes == 4){
            mesAux = "Abril";
        }else if(mes == 5){
            mesAux = "Mayo";
        }else if(mes == 6){
            mesAux = "Junio";
        }else if(mes == 7){
            mesAux = "Julio";
        }else if(mes == 8){
            mesAux = "Agosto";
        }else if(mes == 9){
            mesAux = "Septiembre";
        }else if(mes == 10){
            mesAux = "Octubre";
        }else if(mes == 11){
            mesAux = "Noviembre";
        }else{
            mesAux = "Diciembre";
        }
        respuesta = dia + " de " + mesAux + " de " + año;
        return respuesta;
    }
}
