
/**
 * Compara dos cadenas lexicograficamente.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class LosFragmentosDeDhilva
{
     public String comparaLexicograficamente(String cadena1, String cadena2){
        String res;
        if(cadena1.compareTo(cadena2)==0){
            res = "Las palabras son lexicogr√°ficamente iguales";
        }else if(cadena1.compareTo(cadena2)>0){
            res = "La palabra "+cadena1+" es mayor lexicogr√°ficamente que "+cadena2;        
        }else{
            res = "La palabra "+cadena1+" es menor lexicogr√°ficamente que "+cadena2;
        }   
        return res;
    }
}
