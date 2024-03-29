
/**
 * 
 * @Nombre de la clase: Zapatillas.
 * @Propósito de la clase: Guardar las zapatillas de cada tenista, que tendrán un modelo, valor y número distinto
 * para cada tenista.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public abstract class Zapatillas
{
    private String modelo;
    private Double valor;
    private Double numero;
    
    private final double multValorSaque = 1.2;
    private final double multValorResto = 1.3;
    
    /**
     * Constructor parametrizado de la Clase Zapatillas.
     * 
     * @param modelo  Es el modelo de las zapatillas del tenista
     * @param numero  Es el número de las zapatillas del tenista
     * @param valor   Es el valor númerico de agarre o amortiguación de las zapatillas del tenista
     */
    public Zapatillas(String modelo, Double numero, Double valor)
    {
        this.modelo = modelo;
        this.numero = numero;
        this.valor = valor;
    }
    
    /**
     * Cambia el modelo de Zapatillas por el modelo indicado por parámetro.
     * 
     * @param modelo  Es el modelo de las zapatillas del tenista
     */
    public void setModelo(String modelo)
    {
       this.modelo = modelo; 
    }
    
    /**
     * Retorna el modelo de Zapatillas.
     * 
     * @return modelo  Devuelve el modelo de las zapatillas del tenista 
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Cambia el valor de Zapatillas por el valor indicado por parámetro.
     * 
     * @param valor  Es el valor númerico de agarre o amortiguación de las zapatillas del tenista 
     */
    public void setValor(Double valor)
    {
       this.valor = valor; 
    }
    
    /**
     * Retorna el valor de Zapatillas.
     * 
     * @return valor  Devuelve el valor númerico de agarre o amortiguación de las zapatillas del tenista
     */
    public Double getValor()
    {
        return valor;
    }
    
    /**
     * Cambia el numero de Zapatillas por el numero indicado por parámetro.
     * 
     * @param numero  Es el número de las zapatillas del tenista 
     */
    public void setNumero(Double numero)
    {
        this.numero = numero;
    }
    
    /**
     * Retorna el numero de Zapatillas.
     * 
     * @return numero  Devuelve el número de las zapatillas del tenista
     */
    public Double getNumero()
    {
        return numero;
    }
    
    /**
     * Muestra los campos de las Zapatillas: modelo, numero y valor.
     * 
     * @return  Devuelve una cadena String formada por el modelo, numero y valor de las zapatillas del tenista
     */
    @Override
    public String toString()
    {
        return "       "+getClass().getName()+" [modelo = " + this.getModelo() + ", número = " + this.getNumero() + ", valor = " + this.getValor() + "]";
    }
    
    /**
     * Devuelve el valor de saque de dichas zapatillas, que es el valor de las zapatillas multiplicado por 12 
     * que es el multiplicador de saque, cuando esta acción sea invocada desde el método sacar de la clase Tenista.
     * 
     * @return  Devuelve un número decimal que es el el valor de las zapatillas multiplicado por 1.2 (multValorSaque)
     */
    public Double calcularValorSaque()
    {   
        return valor * multValorSaque;
    }
    
    /**
     * Devuelve el valor de resto de dichas zapatillas, que es el valor de las zapatillas multiplicado por 1.3 
     * que es el multiplicador de resto, cuando esta acción sea invocada desde el método restar de la clase Tenista.
     * 
     * @return  Devuelve un número decimal que es el el valor de las zapatillas multiplicado por 1.3 (multValorResto)
     */
    public Double calcularValorResto()
    {
        return valor * multValorResto;
    }
}
