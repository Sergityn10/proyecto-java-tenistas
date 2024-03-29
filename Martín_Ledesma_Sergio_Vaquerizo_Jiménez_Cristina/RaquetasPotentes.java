
/**
 * 
 * @Nombre de la clase: RaquetasPotentes.
 * @Propósito de la clase: Declara la funcionalidad de las Raquetas Potentes
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class RaquetasPotentes extends RaquetaGenerica
{
    private final Double multVel = 1.5;
    
    /**
     * Constructor parametrizado de la Clase RaquetasPotentes
     * 
     * @param modelo        Es el modelo de la Raqueta Potente
     * @param peso          Es el peso de la Raqueta Potente
     * @param longitud      Es la longitud de la Raqueta Potente
     * @param tamañoCabeza  Es el tamaño de cabeza de la Raqueta Potente
     * @param tipo          Es el estilo del encordado de la Raqueta Potente, puede ser, Abierto o Cerrado
     */
    public RaquetasPotentes(String modelo, Double peso, Double longitud, Double tamañoCabeza, TipoEncordado tipo)
    {
        super(modelo, peso, longitud, tamañoCabeza, tipo);
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularPotencia()
    {
        TipoEncordado aux = getEncordado();
        return aux.getMultPot() * super.calcularPotencia();
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularVelocidad()
    {
        return super.calcularVelocidad() * multVel; 
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public String toString()
    {
        return "       "+getClass().getName()+ getEncordado() +super.toString();
    }
}
