import java.util.TreeSet;
import java.util.Iterator;

/**
 * 
 * @Nombre de la clase: Voleadores.
 * @Propósito de la clase: Representar el tipo de Tenista denominado Voleador.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class Voleadores extends Tenista
{
    /**
     * Constructor parametrizado 1 de la Clase Voleadores.
     * 
     * @param nombre      Es el nombre del tenista voleador
     * @param zapatillas  Son las zapatillas del tenista voleador, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista voleador
     * @param resto       Es el valor de velocidad media de resto del tenista voleador
     * @param ranking     Es la posición del tenista voleador en el ranking mundial
     * @param pais        Es el país del que procede el tenista voleador
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista voleador
     */
    public Voleadores(String nombre, Zapatillas zapatillas, Double saque,
    Double resto, int ranking, String pais, Double numPie)
    {
        super(nombre, zapatillas, saque, resto, ranking, pais, numPie);
    }

    /**
     * Constructor parametrizado 2 de la Clase Voleadores.
     * 
     * @param nombre      Es el nombre del tenista voleador
     * @param zapatillas  Son las zapatillas del tenista voleador, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista voleador
     * @param resto       Es el valor de velocidad media de resto del tenista voleador
     * @param ranking     Es la posición del tenista voleador en el ranking mundial
     * @param pais        Es el país del que procede el tenista voleador
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista voleador
     * @param raqueta     Es la raqueta del tenista voleador
     */
    public Voleadores(String nombre, Zapatillas zapatillas, Double saque,
    Double resto, int ranking, String pais, Double numPie, Raqueta raqueta)
    {
        super(nombre, zapatillas, saque, resto, ranking, pais, numPie, raqueta);    
    }

    /**
     * Método el que los tenistas voleadores incrementan sus puntos acumulados en un 15% de la 
     * potencia de su raqueta.
     * 
     */
    @Override
    protected  void golpear()
    {
        Double aux = getPuntosAcumulados()+getRaqueta().calcularPotencia()*0.15;
        setPuntosAcumulados(aux);
    }

    /**
     * Método en el que los tenistas voleadores cambian su raqueta en cada juego, para ello obtienen la primera raqueta disponible en raquetasCampeonato
     * que tenga una velocidad mayor a la suya, y cambian su raqueta por dicha raqueta, desechando la suya y la disponible en raquetasCampeonato. 
     * Si no hay raquetas disponibles se queda con la misma raqueta.
     * 
     */
    @Override
    protected void cambiarRaqueta()
    {
        Campeonato aux= Campeonato.getInstance();
        Iterator<Raqueta> raq = aux.getSetRaquetas().iterator();

        boolean enc = false;
        while(raq.hasNext() && !enc ){
            Raqueta r = raq.next();
            if(getRaqueta().calcularVelocidad().compareTo(r.calcularVelocidad()) < 0)
            {
                setRaqueta(r);
                raq.remove();
                enc=true;
                System.out.println("       "+getNombre() + " cambia su raqueta por : " + getRaqueta().getClass().getName() + " modelo = " + 
                getRaqueta().getModelo() +" velocidad = " + getRaqueta().calcularVelocidad());
            }

        }
        if(!enc)
            System.out.println("       "+getNombre() + " no ha cambiado de raqueta");
    }

    /**
     * Muestra los campos del Tenista Voleador.
     * 
     * @return Devuelve una cadena String formada por el nombre, saque, resto, ranking, pais, numPie y zapatillas del Tenista Voleador
     */
    @Override
    public String toString()
    {
        return "Tenista ("+ this.getClass().getName() + ") " + super.toString();
    }
}
