
/**
 * 
 * @Nombre de la Interface: Raqueta.
 * @Propósito de la Interface: Declara la funcionalidad común de todas las Raquetas
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public interface Raqueta 
{
    /**
     * Retorna el modelo de la Raqueta.
     * 
     * @return Devuelve un String que es el modelo de la Raqueta
     */
    public String getModelo();
    
    /**
     * Método que calcula el valor de Potencia de la Raqueta.
     * 
     * @return  Devuelve un número decimal que es el valor de Potencia de la Raqueta
     */
    public abstract Double calcularPotencia();
    
    /**
     * Método que calcula el valor de Control de la Raqueta.
     * 
     * @return  Devuelve un número decimal que es el valor de Control de la Raqueta
     */
    public abstract Double calcularControl();
    
    /**
     * Método que calcula el valor de Velocidad de la Raqueta.
     * 
     * @return  Devuelve un número decimal que es el valor de Velocidad de la Raqueta
     */
    public abstract Double calcularVelocidad();
    
    /**
     * Muestra los campos de las Raquetas: modelo, peso, longitud, tamaño de la cabeza y estilo de encordado.
     * 
     * @return  Devuelve una cadena String formada por el modelo, peso, longitud, tamaño de la cabeza y estilo de encordado de la Raqueta
     */
    @Override
    public abstract String toString();
}
