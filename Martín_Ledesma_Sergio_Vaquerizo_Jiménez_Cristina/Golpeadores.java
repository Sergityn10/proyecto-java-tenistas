
/**
 * 
 * @Nombre de la clase: Golpeadores.
 * @Propósito de la clase: Representar el tipo de Tenista denominado Golpeador.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class Golpeadores extends Tenista
{
   /**
     * Constructor parametrizado 1 de la Clase Golpeadores.
     * 
     * @param nombre      Es el nombre del tenista golpeador
     * @param zapatillas  Son las zapatillas del tenista golpeador, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista golpeador
     * @param resto       Es el valor de velocidad media de resto del tenista golpeador
     * @param ranking     Es la posición del tenista golpeador en el ranking mundial
     * @param pais        Es el país del que procede el tenista golpeador
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista golpeador
     */
   public Golpeadores(String nombre, Zapatillas zapatillas, Double saque,
   Double resto, int ranking, String pais, Double numPie)
   {
        super(nombre, zapatillas, saque, resto, ranking, pais, numPie);
   }
   
   /**
     * Constructor parametrizado 2 de la Clase Golpeadores.
     * 
     * @param nombre      Es el nombre del tenista golpeador
     * @param zapatillas  Son las zapatillas del tenista golpeador, pueden ser Amortiguadas o ConAgarre
     * @param saque       Es el valor de velocidad media de saque del tenista golpeador
     * @param resto       Es el valor de velocidad media de resto del tenista golpeador
     * @param ranking     Es la posición del tenista golpeador en el ranking mundial
     * @param pais        Es el país del que procede el tenista golpeador
     * @param numPie      Es el valor del número de pie de las zapatillas del tenista golpeador
     * @param raqueta     Es la raqueta del tenista golpeador
     */
   public Golpeadores(String nombre, Zapatillas zapatillas, Double saque,
   Double resto, int ranking, String pais, Double numPie, Raqueta raqueta)
   {
       super(nombre, zapatillas, saque, resto, ranking, pais,numPie, raqueta);    
   }
   
   /**
     * Método el que los tenistas voleadores incrementan sus puntos acumulados en un 10% de la 
     * velocidad que alcanza su raqueta.
     * 
     */
   @Override
   protected void golpear()
   {
        Double aux = getPuntosAcumulados()+getRaqueta().calcularVelocidad()*0.1;
        setPuntosAcumulados(aux);
   }
   
   /**
     * Muestra los campos del Tenista Golpeador.
     * 
     * @return Devuelve una cadena String formada por el nombre, saque, resto, ranking, pais, numPie y zapatillas del Tenista Golpeador
     */
   @Override
   public String toString()
   {
       return "Tenista ("+ this.getClass().getName() + ") " + super.toString();
   }
}
