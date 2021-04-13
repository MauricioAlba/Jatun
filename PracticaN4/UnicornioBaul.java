
/**
 * Simula una caja de seguridad.
 * 
 * @author (Matt4) 
 * @version (1.0)
 */
public class UnicornioBaul
{
    private String estBaul;
    private int contraseña;
    public UnicornioBaul()
    {
        estBaul = "cerrado";
        contraseña = 1111;
    }

    public String abrirBaul(int contraseña){
        String res;
        if(estBaul.equals("cerrado")){
            if(this.contraseña==contraseña){
                res = "El barril se abrio exitsamente";
                estBaul = "abierto";
            }else{
                res = "La contraseña es incorrecta";
            }
        }else{
            res = "El barril ya esta abierto";
        }
        return res;
    }
    
    public String cerrarBaul(){
        String res;
        if(estBaul.equals("abierto")){
            res = "El barril se cerro exitsamente";
            estBaul = "cerrado";
        }else{
            res = "El barril ya esta cerrado";
        }
        return res;
    }
    
    public String cambiarContraseña(int nuevaContraseña){
        String res;
        if(nuevaContraseña>=1000 && nuevaContraseña<10000){
            res = "La contraseña ha sido cambiado exitosamente";
            contraseña = nuevaContraseña;
        }else{
            res = "El valor ingresado no es valido";
        }
        return res;
    }
}
