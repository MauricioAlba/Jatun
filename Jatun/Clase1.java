
/**
 * Evaluar las expresiones.
 * 
 * @author (Mauricio) 
 * @version (1.0)
 */
public class Clase1
{
    public void evaluarExpresiones()
    {
        double expresion1, expresion4;
        boolean expresion2, expresion3, expresion5;
        expresion1 = 5+7/3;
        expresion2 =  8%5>=6/5;
        expresion3 = (5!=6 || -7>10%2)&&((2+3*5)<6*5);
        expresion4 =  6*5%10+12.4;
        expresion5 = (23/15>13%2) || (13/15 < 14%7);
        System.out.println(expresion1);
        System.out.println(expresion2);
        System.out.println(expresion3);
        System.out.println(expresion4);
        System.out.println(expresion5);
        
        /*
         * Verificar si las siguientes expresiones
         * generan algun error.
         */
        //int a = 45+21; //no genera algun error
        //double x = 31; //no genera algun error
        //char c = "z"; //genera un erro ya que la variable caracter requiee de comillas simples
        //int b = 'y' + 3; //genera un error porque la variable int no acepta valores tipo caracter
        //byte d = 2567; //genera un error ya que la variable tipo byte acepta de -128 a 127
    }
}
