
/**
 * 
 * @Nombre de la Clase: MedioGeneralista.
 * @Propósito de la Clase: Representa al suscriptor Medio Generalista
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class MedioGeneralista implements Suscriptor
{
    private String nombre;
    
    /**
     * Constructor parametrizado de la Clase MedioGeneralista.
     * 
     * @param  Es el nombre del MedioGeneralista
     */
    public MedioGeneralista(String nombre)
    {
        this.nombre=nombre;
    }
    
    //Método documentado en la Interfaz Suscriptor
    public void actualizar(int ronda, Tenista ganador, Tenista perdedor)
    {
        Campeonato aux = Campeonato.getInstance();
        Double diferencia = ganador.getPuntosAcumulados()-perdedor.getPuntosAcumulados();
        if (ganador.getRanking()<=2 || perdedor.getRanking() <=2)
            System.out.println("@@@@@@ El Medio Generalista " + nombre + " destaca en Deportes que en el Campeonato de "
            + aux.getNombreCampeonato() + " en la " + "\n" + 
            "ronda " + ronda + " se ha impuesto " + ganador.getNombre() + " a " + perdedor.getNombre() +
            "por una diferencia de " + diferencia + " puntos.");
    }
}
