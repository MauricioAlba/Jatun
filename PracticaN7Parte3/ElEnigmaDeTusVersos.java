
/**
 * Simula un juego logico.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class ElEnigmaDeTusVersos
{
    public String verificarPalabraEnVerso(String verso, String palabra){
        String res;
        boolean bandera = false;
        int posPalabra = 0;
        for(int posVerso = 0; posVerso < verso.length() && posPalabra<palabra.length() ; posVerso++){
            if(verso.charAt(posVerso)==32){
                bandera =true;
            }
            else if(bandera==true ){
                if(palabra.charAt(posPalabra)==verso.charAt(posVerso)){
                    posPalabra++;
                }
            }
        }
        if(posPalabra==palabra.length()){
            res = "Si es posible formar la palabra deseada";
        }else{
            res = "No es posible formar la palabra deseada";
        }
        return res;
    }
}
