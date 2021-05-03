
/**
 * Comprueba que el nombre empieza con un prefijo.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class ElLegadoDeLosAncestros
{
    public String comprobarPrefijo(String nombre, String prefijo){
        String res = "El nombre "+nombre+", Si comienza con el prefijo: "+prefijo;
        String nom = nombre.toLowerCase();
        boolean bandera = true;
        for(int pos = 0; pos<prefijo.length() && bandera; pos++){
            int auxNom = nom.charAt(pos);
            int auxPre = prefijo.charAt(pos);
            if(auxNom!=auxPre){
                res = "El nombre "+nombre+", No comienza con el prefijo: "+prefijo;
                bandera = false;
            }
        }
        return res;
    } 
}
