import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

/**
 * 
 * @Nombre de la clase: Tenista.
 * @Propósito de la clase: Representar los distintos tenistas de la competición, con sus
 * características de nombre, zapatillas, saque, resto, ranking, pais, puntosAcumulados, numPie y raqueta.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public abstract class Tenista
{
    private String nombre;
    private Zapatillas zapatillas;
    private Double saque;
    private Double resto;
    private int ranking;
    private String pais;
    private Double puntosAcumulados;
    private Double numPie;
    private Raqueta raqueta;

    private int posicion; //variable que utlizamos para el ComparadorPosicionEliminados

    /**
     * Constructor parametrizado 1 de la Clase Tenista.
     * 
     * @param nombre      Es el nombre del tenista
     * @param zapatillas  Son las zapatillas del tenista, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista
     * @param resto       Es el valor de velocidad media de resto del tenista
     * @param ranking     Es la posición del tenista en el ranking mundial
     * @param pais        Es el país del que procede el tenista
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista
     */
    public Tenista(String nombre, Zapatillas zapatillas, Double saque,
    Double resto, int ranking, String pais, Double numPie)
    {
        this.nombre = nombre;
        this.zapatillas = zapatillas;
        this.saque = saque;
        this.resto = resto;
        this. ranking = ranking;
        this.pais = pais;
        this.puntosAcumulados = 0.0;
        posicion = 0;
        this.numPie = numPie;
    }

    /**
     * Constructor parametrizado 2 de la Clase Tenista.
     * 
     * @param nombre      Es el nombre del tenista
     * @param zapatillas  Son las zapatillas del tenista, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista
     * @param resto       Es el valor de velocidad media de resto del tenista
     * @param ranking     Es la posición del tenista en el ranking mundial
     * @param pais        Es el país del que procede el tenista
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista
     * @param raqueta     Es la raqueta del tenista
     */
    public Tenista(String nombre, Zapatillas zapatillas, Double saque,
    Double resto, int ranking, String pais, Double numPie, Raqueta raqueta)
    {
        this.nombre = nombre;
        this.zapatillas = zapatillas;
        this.saque = saque;
        this.resto = resto;
        this. ranking = ranking;
        this.pais = pais;
        this.puntosAcumulados = 0.0;
        posicion = 0;
        this.numPie = numPie;
        this.raqueta = raqueta;
    }

    /**
     * Cambia el nombre del Tenista por el nombre indicado por parámetro.
     * 
     * @param nombre  Es el nombre del tenista
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre del Tenista.
     * 
     * @return nombre  Devuelve el nombre del tenista
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Cambia las zapatillas del Tenista por las zapatillas indicadas por parámetro.
     * 
     * @param zapatillas  Son las zapatillas del tenista, pueden ser Amortiguadas o ConAgarre
     */
    public void setZapatillas(Zapatillas zapatillas)
    {
        this.zapatillas = zapatillas;
    }

    /**
     * Retorna las zapatillas del Tenista.
     * 
     * @return zapatillas  Devuelve las zapatillas del tenista
     */
    public Zapatillas getZapatillas()
    {
        return zapatillas;
    }

    /**
     * Cambia el saque del Tenista por el saque indicado por parámetro.
     * 
     * @param saque  Es el valor de velocidad media de saque del tenista
     */
    public void setSaque(Double saque)
    {
        this.saque = saque;
    }

    /**
     * Retorna el saque del Tenista.
     * 
     * @return saque  Devuelve el valor de velocidad media de saque del tenista
     */
    public Double getSaque()
    {
        return saque;
    }

    /**
     * Cambia el resto del Tenista por el resto indicado por parámetro.
     * 
     * @param resto  Es el valor de velocidad media de resto del tenista
     */
    public void setResto(Double resto)
    {
        this.resto = resto;
    }

    /**
     * Retorna el resto del Tenista.
     * 
     * @return resto  Devuelve el valor de velocidad media de resto del tenista
     */
    public Double getResto()
    {
        return resto;
    }

    /**
     * Cambia la posición de ranking del Tenista por la posición indicada por parámetro.
     * 
     * @param ranking  Es la posición del tenista en el ranking mundial 
     */
    public void setRanking(int ranking)
    {
        this.ranking = ranking;
    }

    /**
     * Retorna la posición del ranking del Tenista.
     * 
     * @return ranking  Devuelve la posición del tenista en el ranking mundial 
     */
    public int getRanking()
    {
        return ranking;
    }

    /**
     * Cambia el país del Tenista por el país indicado por parámetro.
     * 
     * @param pais  Es el país del que procede el tenista
     */
    public void setPais(String pais)
    {
        this.pais = pais;
    }

    /**
     * Retorna el país del Tenista.
     * 
     * @return pais  Devuelve el país del que procede el tenista
     */
    public String getPais()
    {
        return pais;
    }

    /**
     * Cambia los puntos acumulados del Tenista por los puntos indicados por parámetro.
     * 
     * @param puntosAcumulados  Son los puntos que cade tenista consigue cuando juega cada partido
     */
    public void setPuntosAcumulados(Double puntosAcumulados)
    {
        this.puntosAcumulados = puntosAcumulados;
    }

    /**
     * Retorna los puntos acumulados del Tenista.
     * 
     * @return puntosAcumulados  Devuelve los puntos acumulados que tiene el tenista
     */
    public Double getPuntosAcumulados()
    {
        return puntosAcumulados;
    }

    /**
     * Cambia el número de pie de las zapatillas del Tenista por el número de pie indicado por parámetro.
     * 
     * @param numPie  Es el valor del número de pie de las zapatillas del tenista
     */
    public void setNumPie(Double numPie)
    {
        this.numPie = numPie;
    }

    /**
     * Retorna el número de pie de las zapatillas del Tenista
     * 
     * @return  Devuelve el valor del número de pie de las zapatillas del tenista
     */
    public Double getNumPie()
    {
        return numPie;
    }

    /**
     * Cambia la raqueta del Tenista por la raqueta indicada por parámetro
     * 
     * @param raqueta  Es la raqueta del tenista
     */
    public void setRaqueta(Raqueta raqueta)
    {
        this.raqueta = raqueta;
    }

    /**
     * Retorna la raqueta del Tenista.
     * 
     * @return  Devuelve la raqueta del Tenista
     */
    public Raqueta getRaqueta()
    {
        return raqueta;
    }

    /**
     * Cambia la posición en la que se encuentra el Tenista por la posición indicada por parámetro.
     * 
     * @param posicion  Es la posición en la que se encuentra el Tenista
     */
    public void setPosicion(int posicion)
    {
        this.posicion = posicion;
    }

    /**
     * Retorna la posición en la que se encuentra un Tenista.
     *
     * @return Devuelve la posición en la que se encuentra el Tenista
     */
    public int getPosicion()
    {
        return posicion;
    }

    /**
     * Muestra los campos del Tenista.
     * 
     * @return Devuelve una cadena String formada por el nombre, saque, resto, ranking, pais, numPie y zapatillas del Tenista
     */
    @Override
    public String toString()
    {
        return "[nombre = " + nombre + ", saque = " + saque + ", resto = " + resto + ", ranking = " + ranking + ", país = " + pais + 
        ", numero pie = " + numPie + "]" + "\n" 
        + zapatillas + "\n" + raqueta;
    }

    /**
     * Método que calcula el valor de saque del Tenista, con la ayuda del valor de saque de sus zapatillas,
     * el saque del Tenista, la potencia de la raqueta y su velocidad.
     * 
     * @return  Devuelve un valor decimal que es el valor de saque del Tensita
     */
    protected final Double calcularSaque()
    {
        return (zapatillas.calcularValorSaque() * saque * raqueta.calcularPotencia() * raqueta.calcularVelocidad());
    }

    /**
     * Método que pone la pelota en juego. Incrementa sus puntos acumulados con el valor devuelto al invocar
     * calcularValorSaque de sus zapatillas.
     */
    protected final void sacar()
    {
        puntosAcumulados += calcularSaque();  
    }

    /**
     * Método que calcula el valor de resto del tenista, con la ayuda del valor de resto de sus zapatillas,
     * el resto del Tenista, el control de la raqueta y su velocidad.
     * 
     * @return  Devuelve un valor decimal que es el valor de resto del Tensita
     */
    protected final Double calcularResto()
    {
        return (zapatillas.calcularValorResto() * resto * raqueta.calcularControl() * raqueta.calcularVelocidad());
    }

    /**
     * Método que responde al juego del tenista contrario.
     * Si el valor de resto del tenista que invoca calcularResto es mayor que el valor de saque del oponente, 
     * entonces se incrementa los puntos acumulados del tenista que invoca el método restar y sino, 
     * no se realiza ningún cambio.
     * 
     * @param oponente  Es un Tenista
     */
    protected final void restar(Tenista oponente)
    {
        if(calcularResto().compareTo( oponente.calcularSaque()) > 0)
        {
            puntosAcumulados += calcularResto();
        }
    }

    /**
     * Método que pone en juego el partido con la ayuda de los métodos sacar, restar, golpear y cambiarRaqueta.
     * 
     * @param oponente  Es un Tenista
     */
    public final void jugar(Tenista oponente)
    {
        sacar();
        oponente.restar(this);
        golpear();
        cambiarRaqueta();
    }

    /**
     * Método que asigna unas Zapatillas a cada Tenista según su número de pie, y elimina esas zapatillas del listado zapatillasCampeonato.
     * Si no encuentra unas zapatillas de su número (o no quedan zapatillas disponibles), se quedará con las zapatillas que llevaba.
     *  
     */
    protected final void elegirZapatillas()
    {
        Campeonato aux2 = Campeonato.getInstance();
        Iterator<Zapatillas> it = aux2.getListZapatillas().iterator();
        boolean enc = false;
        while(it.hasNext() && !enc) {
            Zapatillas aux = it.next();
            if(aux.getNumero().equals(numPie)){
                this.setZapatillas(aux);
                it.remove();
                enc = true;
            }
        }
        if (enc)
            System.out.println("       Zapatillas asignadas:     " + getZapatillas());
    }

    /**
     * Método en el que los tenistas cambian su raqueta, para ello obtienen la primera raqueta disponible en raquetasCampeonato y cambian su raqueta
     * por dicha raqueta, desechando la suya y la disponible en raquetasCampeonato. Si no hay raquetas disponibles se queda con la misma raqueta.
     * 
     */
    protected void cambiarRaqueta()
    {
        Campeonato aux= Campeonato.getInstance();
        Iterator <Raqueta> raquetasCampeonato=aux.getSetRaquetas().iterator();
        if(raquetasCampeonato.hasNext())
        {
            this.setRaqueta(raquetasCampeonato.next());
            raquetasCampeonato.remove();
            System.out.println("       "+getNombre() + " cambia su raqueta por: " + getRaqueta().getClass().getName() + " modelo = " + 
            getRaqueta().getModelo() +" velocidad = " + getRaqueta().calcularVelocidad());
        }
        else
            System.out.println("       "+getNombre() + " no cambia de raqueta");
        
    }

    /**
     * Método por defecto de golpear.
     * 
     */
    protected abstract void golpear();

    /**
     * Método en el que los propios tenistas se inscriben el el Campeonato.
     * 
     */
    public void realizarInscripcion()
    {
        Campeonato aux=Campeonato.getInstance();
        aux.inscribir(this);
    }

}
