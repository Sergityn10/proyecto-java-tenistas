
/**
 * 
 * @Nombre de la Interface: Notificador.
 * @Propósito de la Interface: Envía eventos de interés a objetos suscritos a sus cambios de estado.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public interface Notificador
{
    /**
     * Método que suscribe a un suscriptor en la lista de suscriptores.
     * 
     * @param suscriptor  Es un Suscriptor
     * 
     */
    public void suscribir(Suscriptor suscriptor);
    
    /**
     * Método que elimina a un suscriptor en la lista de suscriptores.
     * 
     * @param suscriptor  Es un Suscriptor
     * 
     */
    public void anularSuscripcion(Suscriptor suscriptor);
    
    /**
     * Método que nofica a los suscriptores de alguna noficación/alarma/novedad/...
     * 
     * @param ronda     Es un contador que cuenta el número de rondas
     * @param ganador   Es un Tenista
     * @param perdedor  Es un Tenista
     * 
     */
    public void notificarSuscriptores(int ronda, Tenista ganador, Tenista perdedor);
}
