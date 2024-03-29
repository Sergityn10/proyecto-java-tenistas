import java.util.Comparator;

/**
 * 
 * @Nombre de la clase: ComparadorPosicionEliminados.
 * @Propósito de la clase: Hacer un comparador que compare la posición en la que fueron eliminados dos Tenistas.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class ComparadorPosicionEliminados implements Comparator <Tenista>
{
    /**
     * Método que compara la posición en la que fueron eliminados dos Tenistas, si la posición es la misma, se tiene en cuenta 
     * el nombre del Tenista como criterio de desempate.
     * 
     * @param t1  Es un Tenista
     * @param t2  Es un Tenista
     * 
     * @return    Devuelve un número entero según la comparación de la posición de los Tenistas.
     */
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getPosicion() == t2.getPosicion()){
            return (t1.getNombre().compareTo(t2.getNombre()));
        }
        else{
            if(t1.getPosicion() < t2.getPosicion())
                return 1;
            else
                return -1;
        }    
    }
}
