
/**
 * 
 * @Nombre de la Interface: Suscriptor.
 * @Propósito de la Interface: Declara la interfaz de Notificador.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public interface Suscriptor
{
    /**
     * Método que actualiza las notificaciones con respecto al Campeonato.
     * 
     * @param ronda     Es un contador que cuenta el número de rondas
     * @param ganador   Es un Tenista
     * @param perdedor  Es un Tenista
     * 
     */
    public void actualizar(int ronda, Tenista ganador, Tenista perdedor);
}
