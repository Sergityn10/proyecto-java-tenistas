import java.util.Comparator;

/**
 * 
 * @Nombre de la clase: ComparadorPuntosTenistas.
 * @Propósito de la clase: Hacer un comparador que compare los puntos de los Tenistas.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class ComparadorPuntosTenistas implements Comparator <Tenista>
{
    /**
     * Método que compara los puntos de los Tenistas, si los puntos son iguales, se tiene en cuenta 
     * el nombre del Tenista como criterio de desempate.
     * 
     * @param t1  Es un Tenista
     * @param t2  Es un Tenista
     * 
     * @return    Devuelve un número entero según la comparación de los puntos de los Tenistas.
     */
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getPuntosAcumulados() == t2.getPuntosAcumulados()){
            return (t1.getNombre().compareTo(t2.getNombre()));
        }
        else{
            if(t1.getPuntosAcumulados() > t2.getPuntosAcumulados())
                return 1;
            else
                return -1;
        }
    }
}
