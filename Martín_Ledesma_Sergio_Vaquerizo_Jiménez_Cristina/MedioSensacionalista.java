
/**
 * 
 * @Nombre de la Clase: MedioSensacionalista.
 * @Propósito de la Clase: Representa al suscriptor Medio Sensacionalista
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class MedioSensacionalista implements Suscriptor
{
    private String nombre;
    
    /**
     * Constructor parametrizado de la Clase MedioSensacionalista.
     * 
     * @param  Es el nombre del MedioSensacionalista
     */
    public MedioSensacionalista(String nombre)
    {
        this.nombre=nombre;
    }
    
    //Método documentado en la Interfaz Suscriptor
    public void actualizar(int ronda, Tenista ganador, Tenista perdedor)
    {
        Campeonato aux = Campeonato.getInstance();
        int diferRanking = ganador.getRanking() - perdedor.getRanking();
        if (ganador.getRanking()>3 && perdedor.getRanking() <=3)
            System.out.println("@@@@@@ El Medio Sensacionalista " + nombre + " destaca en Deportes que ha habido sorpresa en el Campeonato de " + "\n" +
            aux.getNombreCampeonato() + " en la ronda " + ronda + " porque se ha impuesto " + ganador.getNombre() + " a " + perdedor.getNombre() + 
            " cuando les " + "\n" + "separan " + diferRanking + " puestos en el ranking.");
    }
}
