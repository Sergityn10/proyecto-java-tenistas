
/**
 * 
 * @Nombre de la clase: RaquetasControladas.
 * @Propósito de la clase: Declara la funcionalidad de las Raquetas Controladas
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class RaquetasControladas extends RaquetaGenerica
{
    private final Double mulVel = 1.2;
    
    /**
     * Constructor parametrizado de la Clase RaquetasControladas
     * 
     * @param modelo        Es el modelo de la Raqueta Controlada
     * @param peso          Es el peso de la Raqueta Controlada
     * @param longitud      Es la longitud de la Raqueta Controlada
     * @param tamañoCabeza  Es el tamaño de cabeza de la Raqueta Controlada
     * @param tipo          Es el estilo del encordado de la Raqueta Controlada, puede ser, Abierto o Cerrado
     */
    public RaquetasControladas(String modelo, Double peso, Double longitud, Double tamañoCabeza, TipoEncordado tipo)
    {
        super(modelo, peso, longitud, tamañoCabeza, tipo);
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularControl()
    {
        TipoEncordado aux = getEncordado();
        return aux.getMulCont() * super.calcularControl();
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public Double calcularVelocidad()
    {
        return super.calcularVelocidad() * mulVel; 
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public String toString()
    {
        return "       "+getClass().getName() + getEncordado() + super.toString();
    }

}
