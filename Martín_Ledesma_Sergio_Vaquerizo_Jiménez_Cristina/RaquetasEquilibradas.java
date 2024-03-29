
/**
 * 
 * @Nombre de la clase: RaquetasEquilibradas.
 * @Propósito de la clase: Declara la funcionalidad de las Raquetas Equilibradas
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class RaquetasEquilibradas extends RaquetaGenerica
{
    private final Double multPot;
    private final Double multCont;
    
    /**
     * Constructor parametrizado de la Clase RaquetasEquilibradas
     * 
     * @param modelo        Es el modelo de la Raqueta Equilibrada
     * @param peso          Es el peso de la Raqueta Equilibrada
     * @param longitud      Es la longitud de la Raqueta Equilibrada
     * @param tamañoCabeza  Es el tamaño de cabeza de la Raqueta Equilibrada
     * @param tipo          Es el estilo del encordado de la Raqueta Equilibrada, puede ser, Abierto o Cerrado
     * @param multPot       Es el multiplicador de potencia de la Raqueta Equilibrada
     * @param multCont      Es el multiplicador de control de la Raqueta Equilibrada
     */
    public RaquetasEquilibradas(String modelo, Double peso, Double longitud, Double tamañoCabeza, TipoEncordado tipo,
                                Double multPot, Double multCont)
    {
        super(modelo, peso, longitud, tamañoCabeza, tipo);
        this.multPot = multPot;
        this.multCont = multCont;
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularPotencia()
    {
        return super.calcularPotencia() * multPot; 
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularControl()
    {
        return super.calcularControl() * multCont;     
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public String toString()
    {
        return "       "+getClass().getName()+" (MultiplicadorDePotencia:"+ multPot + ") " +
        "(MultiplicadorDeControl:"+ multCont +") \n"+super.toString();
    }
}
