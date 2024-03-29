
/**
 * 
 * @Nombre de la Clase: MedioDeportivo.
 * @Propósito de la Clase: Representa al suscriptor Medio Deportivo
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class MedioDeportivo implements Suscriptor
{
    private String nombre;
    
    /**
     * Constructor parametrizado de la Clase MedioDeportivo.
     * 
     * @param  Es el nombre del MedioDeportivo
     */
    public MedioDeportivo(String nombre)
    {
        this.nombre=nombre;
    }
    
    //Método documentado en la Interfaz Suscriptor
    public void actualizar(int ronda, Tenista ganador, Tenista perdedor)
    {
        Campeonato aux = Campeonato.getInstance();
        System.out.println("@@@@@@ El Medio Deportivo " + nombre + " destaca que en el Campeonato de " + aux.getNombreCampeonato() + " en la ronda " + ronda 
        + " se " + "\n" + "ha impuesto " + ganador.getNombre() + " que ocupa la posicion " + ganador.getRanking() + " en el ranking a " + 
        perdedor.getNombre() + " ocupa la posicion " + "\n" + perdedor.getRanking() + " con un marcador de " + ganador.getPuntosAcumulados() + "-" + 
        perdedor.getPuntosAcumulados()+ ".");
    }
}
