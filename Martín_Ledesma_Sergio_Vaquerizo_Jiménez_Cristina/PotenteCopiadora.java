
/**
 * Write a description of class potenteCopiadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PotenteCopiadora extends RaquetasPotentes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class potenteCopiadora
     */
    public PotenteCopiadora(String modelo, Double peso, Double longitud, Double tamañoCabeza, TipoEncordado tipo)
    {
        super(modelo, peso, longitud, tamañoCabeza, tipo);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
