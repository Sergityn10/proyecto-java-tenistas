import java.util.Comparator;

/**
 * 
 * @Nombre de la clase: ComparaRaqueta.
 * @Propósito de la clase: Hacer un comparador que compare dos Raquetas.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class comparaRaqueta implements Comparator <Raqueta>
{
    /**
     * Método que compara dos raquetas según su potencia, si son iguales, se tiene en cuenta 
     * el modelo de Raqueta como criterio de desempate.
     * 
     * @param r1  Es una Raqueta
     * @param r2  Es una Raqueta
     * 
     * @return    Devuelve un número entero según la comparación de la potencia de las raquetas.
     */
    public int compare(Raqueta r1, Raqueta r2)
    {
        if(r1.calcularPotencia().equals( r2.calcularPotencia())){
            return (r1.getModelo().compareTo(r2.getModelo()));
        }
        else{
            if(r1.calcularPotencia().compareTo( r2.calcularPotencia()) > 0)
                return 1;
            else
                return -1;
        }
    }
}
