
/**
 * 
 * @Nombre del enum: TipoEncordado.
 * @Propósito del enum: Guardar los dos tipos de encordado (abierto y cerrado) y sus multiplicadores de potencia y control.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public enum TipoEncordado
{
    Abierto("Abierto", 2.0, 2.2), Cerrado("Cerrado", 1.8, 2.5);
    
    private String tipo;
    private Double multPot;
    private Double multCont;
    
    /**
     * Constructor parametrizado del enum TipoEncordado.
     * 
     * @param tipo     Es el tipo de encordado
     * @param multPot  Es el multiplicador de potencia del encordado
     * @param multCont Es el multiplicador de control del encordado
     * 
     */
    private TipoEncordado(String tipo, Double multPot, Double multCont)
    {
        this.tipo = tipo;
        this.multPot = multPot;
        this.multCont = multCont;
    }

    /**
     * Devuelve el tipo de encordado. 
     * 
     * @return Retorna el tipo de encordado
     */
    public String getTipo()
    {
        return tipo;
    }
    
    /**
     * Devuelve el multiplicador de potencia del encordado.
     * 
     * @return Retorna el multiplicador de potencia del encordado
     */
    public Double getMultPot()
    {
        return multPot;
    }
    
    /**
     * Devuelve el multiplicador de control del encordado.
     * 
     * @return Retorna el multiplicador de control del encordado
     */
    public Double getMulCont()
    {
        return multCont;
    }
    
    /**
     * Muestra los campos del enum TipoEncordado.
     * 
     * @return  Devuelve una cadena String formada por el tipo de encordado, el multiplicador de potencia y 
     * el multiplicador de control de la Raqueta
     */
    @Override
    public String toString()
    {
        return " (Encordado:"+ getTipo() + ") (MultiplicadorDePotencia:"+ multPot + ") " +
        "(MultiplicadorDeControl:"+ multCont + ") \n";
    }
}
