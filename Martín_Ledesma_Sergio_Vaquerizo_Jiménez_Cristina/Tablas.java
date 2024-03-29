import java.util.Map;
import java.util.HashMap;

/**
 * 
 * @Nombre de la clase: Tablas.
 * @Propósito de la clase: Guardar las tablas de control, potencia y velocidad.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class Tablas
{
    private Map <Double,Double> Control;
    private Map <Double,Double> Potencia;
    private Map <Double,Double> Velocidad;

    /**
     * Constructor por defecto de la Clase Tablas.
     */
    public Tablas ()
    {
        Control = new HashMap <>();
        Potencia = new HashMap <>();
        Velocidad = new HashMap <>();
        
        Potencia.put(680.0, 2.0);
        Potencia.put(690.0, 4.0);
        Potencia.put(700.0, 6.0);
        Potencia.put(720.0, 8.0);
        Potencia.put(740.0, 10.0);
        
        Control.put(600.0, 10.0);
        Control.put(630.0, 8.0);
        Control.put(650.0, 6.0);
        Control.put(680.0, 4.0);
        Control.put(720.0, 2.0);
        
        Velocidad.put(220.0, 10.0);
        Velocidad.put(260.0, 8.0);
        Velocidad.put(300.0, 6.0);
        Velocidad.put(320.0, 4.0);
        Velocidad.put(340.0, 2.0);
    }
    
    /**
     * Devuelve el valor de potencia teniendo en cuenta la longitud de la raqueta.
     * 
     * @return Retorna el valor de potencia
     * 
     */
    public Double getPotencia(Double key)
    {
        return Potencia.get(key);
    }
    
    /**
     * Devuelve el valor de control teniendo en cuenta la el tamaño de la cabeza de la raqueta.
     * 
     * @return Retorna el valor de control
     * 
     */
    public Double getControl(Double key)
    {
        return Control.get(key);
    }
    
    /**
     * Devuelve el valor de velocidad teniendo en cuenta el peso de la raqueta.
     * 
     * @return Retorna el valor de velocidad
     * 
     */
    public Double getVelocidad(Double key)
    {
        return Velocidad.get(key);
    }
}
