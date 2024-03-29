
/**
 * 
 * @Nombre de la clase: Amortiguadas.
 * @Propósito de la clase: Guardar el tipo de zapatillas que será Amortiguadas
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class ZapatillasAmortiguadas extends Zapatillas
{
    private final double multAmort = 1.8;

    /**
     * Constructor parametrizado de la Clase Amortiguadas. Llama al constructor de la superclase Zapatillas.
     * 
     * @param  modelo Es el modelo de las zapatillas del tenista
     * @param  numero Es el número de las zapatillas del tenista
     * @param  valor  Es el valor númerico de agarre o amortiguación de las zapatillas del tenista
     */
    public ZapatillasAmortiguadas(String modelo, Double numero, Double valor)
    {
        super(modelo, numero, valor);
    }

    /**
     * Devuelve el valor de saque que devuelve el método de la superclase Zapatillas, y multiplica ese valor por su multiplicador
     * de amortiguación que es 1.8
     * 
     * @return  Devuelve un número decimal que es el el valor de saque de las zapatillas amortiguadas
     */
    @Override
    public Double calcularValorSaque()
    {
        return super.calcularValorSaque() * multAmort;       
    }

}
