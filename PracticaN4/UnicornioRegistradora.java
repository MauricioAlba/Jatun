
/**
 * Simula una caja registradora.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class UnicornioRegistradora
{
    private int totalPagar;
    public UnicornioRegistradora()
    {
        totalPagar = 0;
    }
    
    public void sumarProducto(int precioProducto, int cantProductos){
        totalPagar = totalPagar + (precioProducto*cantProductos);
    }
    
    public int getTotalPagar(){
        return totalPagar;
    }
    
    public String pagarProductos(int dineroIngresado){
        String res;
        int cambio = dineroIngresado - totalPagar;
        if(dineroIngresado >= totalPagar){
            res = "Cobro exitoso, el cambio a devolver es: "+cambio;
            totalPagar = 0;
        }else{
            res = " Error: El dinero indicado no cubre la compra";
        }
        
        return res;
    }
}
