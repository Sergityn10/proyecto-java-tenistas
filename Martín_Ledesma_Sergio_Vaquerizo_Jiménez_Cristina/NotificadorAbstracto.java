import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @Nombre de la Clase: NotificadorAbstracto.
 * @Propósito de la Clase: Envía eventos de interés a objetos suscritos a sus cambios de estado.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public abstract class NotificadorAbstracto implements Notificador
{
    List<Suscriptor> suscriptores = new ArrayList<>();

    //Método documentado en la Interfaz Notificador
    public void suscribir (Suscriptor suscriptor)
    {
        suscriptores.add(suscriptor);
    }
    
    //Método documentado en la Interfaz Notificador
    public void anularSuscripcion(Suscriptor suscriptor)
    {
        suscriptores.remove(suscriptor);
    }
    
    //Método documentado en la Interfaz Notificador
    public void notificarSuscriptores (int ronda, Tenista ganador, Tenista perdedor){
        for(Suscriptor suscriptor : suscriptores)
            suscriptor.actualizar(ronda, ganador, perdedor);
    }
}
