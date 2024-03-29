
/**
 * 
 * @Nombre de la clase: ConAgarre.
 * @Propósito de la clase: Guardar el tipo de zapatillas que será Con Agarre
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class ZapatillasConAgarre extends Zapatillas
{
    private final double multAga = 1.7;

    /**
     * Constructor parametrizado de la Clase ConAgarre. Llama al constructor de la superclase Zapatillas.
     * 
     * @param  modelo Es el modelo de las zapatillas del tenista
     * @param  numero Es el número de las zapatillas del tenista
     * @param  valor  Es el valor númerico de agarre o amortiguación de las zapatillas del tenista
     */
    public ZapatillasConAgarre(String modelo, Double numero, Double valor)
    {
        super(modelo, numero, valor);
    }

    /**
     * Devuelve el valor de resto que devuelve el método de la superclase Zapatillas, y multiplica ese valor por su multiplicador
     * de agarre que es 1.7
     * 
     * @return  Devuelve un número decimal que es el el valor de resto de las zapatillas con agarre
     */
    @Override
    public Double calcularValorResto()
    {
        return super.calcularValorResto() * multAga;       
    }
}
