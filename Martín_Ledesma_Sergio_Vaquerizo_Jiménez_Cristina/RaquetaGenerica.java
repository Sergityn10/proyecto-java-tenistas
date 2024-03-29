import java.util.Map;
import java.util.HashMap;

/**
 * 
 * @Nombre de la clase: RaquetaGenerica.
 * @Propósito de la clase: Declara la funcionalidad común de todas las Raquetas
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public abstract class RaquetaGenerica implements Raqueta
{
    private String modelo;
    private Double peso;
    private Double longitud;
    private Double tamañoCabeza;
    
    private TipoEncordado tipo;
    private Tablas tablas;
    
    /**
     * Constructor parametrizado de la Clase RaquetaGenerica
     * 
     * @param modelo        Es el modelo de la Raqueta
     * @param peso          Es el peso de la Raqueta
     * @param longitud      Es la longitud de la Raqueta
     * @param tamañoCabeza  Es el tamaño de cabeza de la Raqueta
     * @param tipo          Es el estilo del encordado de la Raqueta, puede ser, Abierto o Cerrado
     */
    public RaquetaGenerica(String modelo, Double peso, Double longitud, Double tamañoCabeza, TipoEncordado tipo)
    {
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tamañoCabeza = tamañoCabeza;
        this.tipo = tipo;
        tablas = new Tablas();
    }
    
    /**
     * Cambia el modelo de la Raqueta por el modelo indicado por parámetro.
     * 
     * @param modelo  Es el modelo de la Raqueta
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    /**
     * Retorna el modelo de la Raqueta.
     * 
     * @return modelo  Devuelve el modelo de la Raqueta
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Cambia el peso de la Raqueta por el peso indicado por parámetro.
     * 
     * @param peso  Es el peso de la Raqueta
     */
    public void setPeso(Double peso)
    {
        this.peso = peso;
    }
    
    /**
     * Retorna el peso de la Raqueta
     * 
     * @return peso  Devuelve el peso de la Raqueta
     */
    public Double getPeso()
    {
        return peso;
    }
    
    /**
     * Cambia la longitud de la Raqueta por la longitud indicada por parámetro.
     * 
     * @param longitud  Es la longitud de la Raqueta
     */
    public void setLongitud(Double longitud)
    {
        this.longitud = longitud;
    }
    
    /**
     * Retorna la longitud de la Raqueta.
     * 
     * @return longitud  Devuelve la longitud de la Raqueta
     */
    public Double getLongitud()
    {
        return longitud;
    }
    
    /**
     * Cambia el tamañoCabeza de la Raqueta por el tamañoCabeza indicado por parámetro.
     * 
     * @param tamañoCabeza  Es el tamaño de cabeza de la Raqueta
     */
    public void setTamañoCabeza(Double tamañoCabeza)
    {
        this.tamañoCabeza = tamañoCabeza;
    }
    
    /**
     * Retorna el tamañoCabeza de la Raqueta.
     * 
     * @return tamañoCabeza  Devuelve el tamañoCabeza de la Raqueta
     */
    public Double getTamañoCabeza()
    {
        return tamañoCabeza;
    }
    
    /**
     * Cambia el tipo encordado de la Raqueta por el tipo encordado indicado por parámetro.
     * 
     * @param tipo  Es el estilo del encordado de la Raqueta, puede ser, Abierto o Cerrado
     */
    public void setEncordado(TipoEncordado tipo)
    {
        this.tipo = tipo;
    }
    
    /**
     * Retorna el tipo encordado de la Raqueta.
     * 
     * @return tipo  Devuelve el tipo encordado de la Raqueta
     */
    public TipoEncordado getEncordado()
    {
        return tipo;
    }
    
    //Método documentado en la Interfaz Raqueta
    public Double calcularPotencia()
    {
        return tablas.getPotencia(longitud);
    }
    
    //Método documentado en la Interfaz Raqueta
    public Double calcularControl()
    {    
        return tablas.getControl(tamañoCabeza);    
    }
    
    //Método documentado en la Interfaz Raqueta
    public Double calcularVelocidad()
    {
        return tablas.getVelocidad(peso);
    }
    
    //Método documentado en la Interfaz Raqueta
    @Override
    public String toString()
    {
        return "        [modelo = "+ getModelo() + "\n" +
        "        longitud: " + getLongitud() +", potencia asociada: " + this.calcularPotencia() + "\n" +
        "        tamaño: " + getTamañoCabeza() +", control asociado: "+ this.calcularControl() + "\n" +
        "        peso: " + getPeso() +", velocidad asociada: " + this.calcularVelocidad() + "] ";
    }
}
