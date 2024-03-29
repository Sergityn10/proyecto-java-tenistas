import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.Iterator;

/**
 * 
 * @Nombre de la clase: Campeonato.
 * @Propósito de la clase: Representar el campeonato, con su nombre, lista de competidores, lista de eliminados,
 * lista de zapatillas del campeonato y lista de raquetas del campeonato.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class Campeonato extends NotificadorAbstracto
{
    private String nombre;
    private List<Tenista> competidores;
    private List<Tenista> eliminados;
    private List<Zapatillas> zapatillasCampeonato;
    private Set <Raqueta> raquetasCampeonato; 
    private static Campeonato singleton;

    /**
     * Constructor por defecto de la Clase Campeonato.
     */
    private Campeonato()
    {
        nombre = " ";
        competidores = new ArrayList <Tenista> ();
        eliminados = new ArrayList <Tenista> ();
        zapatillasCampeonato = new ArrayList<Zapatillas> ();
        raquetasCampeonato = new TreeSet <Raqueta> (new comparaRaqueta().reversed()); 
    }

    /**
     * Constructor parametrizado de la Clase Campeonato.
     * 
     * @param nombre  Es el nombre del Campeonato
     */
    private Campeonato(String nombre)
    {
        this.nombre = nombre;
        competidores = new ArrayList<Tenista> ();
        eliminados = new ArrayList<Tenista> ();
        zapatillasCampeonato = new ArrayList<Zapatillas> ();
        raquetasCampeonato = new TreeSet <Raqueta> (new comparaRaqueta().reversed());
    }

    /**
     * Devuelve el Set de raquetasCampeonato.
     * 
     * @return  Retorna el Set de raquetasCampeonato del campeonato
     */
    public Set<Raqueta> getSetRaquetas()
    {
        return raquetasCampeonato;
    }

    /**
     * Devuelve la List de competidores.
     * 
     * @return  Retorna la List de competidores del campeonato
     */
    public List<Tenista> getListCompetidores()
    {
        return competidores;
    }

    /**
     * Devuelve la List de zapatillasCampeonato.
     * 
     * @return  Retorna la List de zapatillasCampeonato del campeonato
     */
    public List<Zapatillas> getListZapatillas()
    {
        return zapatillasCampeonato;
    }

    /**
     * Método estático que devuelve la misma instancia de campeonato,
     * con la ayuda del campo estático singleton.
     */
    public static synchronized Campeonato getInstance()
    {
        if(singleton == null)
        {
            singleton = new Campeonato("Extremadura");
        }
        return singleton;
    }
    
    /**
     * Método que borra la misma instancia de campeonato (campo estático singleton)
     */
    public void borrarCampeonato()
    {
        singleton = null;
    }

    /**
     * Cambia el nombre del Campeonato por el nombre indicado por parámetro.
     * 
     * @param nombre  Es el nombre del Campeonato
     */
    public void setNombreCampeonato(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre del Campeonato.
     * 
     * @return  Devuelve el nombre del Campeonato
     */
    public String getNombreCampeonato()
    {
        return nombre;
    }

    /**
     * Muestra una lista Tenista que se indique por parámetro.
     * 
     * @param lista  Es un ArrayList<Tenista>
     */
    public void mostrar(List<Tenista> lista)
    {
        for(Tenista jugador : lista){
            System.out.println("    ** " + jugador + "\n");
        }
    }

    /**
     * Muestra los mensajes del "ganador" y "eliminado" de cada juego.
     * 
     * @param ganador     Es un Tenista
     * @param perdedor    Es un Tenista
     * @param Eliminados  Es un número entero que utilizamos como contador
     */
    public void mostrarGanadorYEliminados(Tenista ganador, Tenista perdedor,int Eliminados)
    {
        System.out.println("    ## Gana este juego: " + ganador.getNombre() + " con " + ganador.getPuntosAcumulados() + " puntos acumulados");
        System.out.println("    ## Se elimina: " + perdedor.getNombre() + " con " + perdedor.getPuntosAcumulados() + " puntos acumulados. " + 
            "Tenista eliminado núm: " + Eliminados+"\n"); 
        eliminados.add(perdedor);
        competidores.remove(perdedor);
        ganador.setPuntosAcumulados(0.0);
        perdedor.setPosicion(Eliminados);
    }

    /**
     * Método que rellena el ArrayList<zapatillasCampeonato> con las zapatilla indicada por parámetro.
     * 
     * @param zapatilla  Es una zapatilla
     */
    public void rellenarZapatillasCampeonato(Zapatillas zapatilla)
    {
        zapatillasCampeonato.add(zapatilla);        
    }

    /**
     * Método que rellena el ArrayList<raquetasCampeonato> con las raqueta indicada por parámetro.
     * 
     * @param raqueta  Es una raqueta
     */
    public void rellenarRaquetasCampeonato(Raqueta raqueta)
    {
        raquetasCampeonato.add(raqueta);    
    }

    /**
     * Método que inscribe los Tenistas en la competición.
     * 
     * @param jugador  Es un Tenista
     */
    public void inscribir(Tenista jugador)
    {
        competidores.add(jugador);
    }

    /**
     * Método que asigna una Raqueta según su orden, a cada Tenista del listado de competidores.
     * Hasta que todos los Tenistas tengan una raqueta para jugar.
     * 
     * return  Retorna true si todos los Tenistas tienen una Raqueta, y false si no hay sufientes Raquetas para cada Tenista.
     */
    private boolean asignarRaquetas()
    {
        System.out.println("***** Asignando raquetas a tenistas *****");
        Iterator<Raqueta> raq = raquetasCampeonato.iterator();
        int i = 0;
        while(raq.hasNext() && i<competidores.size()){
            Raqueta r = raq.next();
            competidores.get(i).setRaqueta(r);
            System.out.println("   **" + r.toString() + "asignada a -->> " + competidores.get(i).getNombre()); 
            raq.remove();
            i++;
        }

        return i==(competidores.size());
    }

    /**
     * Método que muestra por pantalla el listado de raquetas disponibles del Campeonato.
     */
    private void ListadoRaquetas()
    {
        System.out.println("\n ***** Listado de raquetas disponibles:");
        Set<Raqueta> raq = raquetasCampeonato;
        for(Raqueta r : raq){
            System.out.println(r);
        }
    }

    /**
     * Método que pone en juego el Campeonato, asignando las distintas rondas, juegos, 
     * competidores, eliminados, zapatillas y raquetas.
     */
    public void competicion()
    {
        if(asignarRaquetas()){
            int rondas = 1;
            int numEliminados = 0;
            System.out.println("\n" + "***** Listado de Competidores:");
            mostrar(competidores);
            ListadoRaquetas();
            while(competidores.size() > 1){
                int tam_inicial = competidores.size()/2;
                System.out.println("\n" + "***** Ronda---->>>>: " + rondas);
                for(int i = 0; i < tam_inicial; i++){
                    System.out.println("  #### Juego ----------->>>: " + i);
                    Tenista jugador;
                    Tenista oponente;
                    jugador = competidores.get(i);
                    oponente = competidores.get(competidores.size() - 1);
                    System.out.println("    ## Tenista1 (" + jugador.getClass().getName() + ") ---->>>: " + jugador.getNombre());
                    jugador.elegirZapatillas();
                    System.out.println("    ## Tenista2 (" + oponente.getClass().getName() + ") ---->>>: " + oponente.getNombre());
                    oponente.elegirZapatillas();
                    jugador.jugar(oponente);
                    oponente.jugar(jugador);
                    Double suma1 = 0.0;
                    Double suma2 = 0.0;
                    suma1 = jugador.getSaque() + jugador.getResto();
                    suma2 = oponente.getSaque() + oponente.getResto();
                    if((jugador.getPuntosAcumulados().equals(oponente.getPuntosAcumulados()) && suma1.compareTo(suma2) < 0) || jugador.getPuntosAcumulados() > oponente.getPuntosAcumulados()){
                        numEliminados++;
                        notificarSuscriptores(rondas,jugador,oponente);
                        mostrarGanadorYEliminados(jugador,oponente,numEliminados);
                    }
                    else{
                        numEliminados++;
                        notificarSuscriptores(rondas,oponente,jugador);
                        mostrarGanadorYEliminados(oponente,jugador,numEliminados);
                        competidores.remove(oponente);
                        competidores.add(i,oponente);
                    }
                }  
                rondas++;
                tam_inicial = competidores.size()/2;
            }

            Collections.sort(eliminados, new ComparadorPosicionEliminados());
            Tenista ganadorFinal;
            ganadorFinal = competidores.get(0);

            System.out.println("\n" + "---->>>>  Gana la competición:   ** " + ganadorFinal + "\n"+"  <<<<----"  + "\n");
            System.out.println("***** Listado de eliminados:");
            mostrar(eliminados);
        }
        else{
            System.out.println("El campeonato no se ha podido realizar, no hay raquetas suficientes");
        }
    }

}

