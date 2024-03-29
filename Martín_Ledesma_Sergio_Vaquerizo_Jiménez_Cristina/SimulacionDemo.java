
/**
 * 
 * @Nombre de la clase: SimulacionDemo.
 * @Propósito de la clase: Simular la Competición
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class SimulacionDemo
{
    public static void main(String[] args) {
        //Creación del campeonato
        //Instanciar una variable de tipo Campeonato;
        Campeonato c1 = Campeonato.getInstance();
        
        //Crear los tres medios medios de comunicacion
        Suscriptor m1 = new MedioGeneralista ("La Tierrina");
        Suscriptor m2 = new MedioDeportivo ("Anota");
        Suscriptor m3 = new MedioSensacionalista ("Adios");
        
        //Suscribimos los tres medios de comunicación
        c1.suscribir(m1);
        c1.suscribir(m2);
        c1.suscribir(m3);
        
        //Carga de datos iniciales del campeonato
        //Instanciar una variable de tipo InitTennisData pasando la variable instanciada de tipo campeonato como parámetro;
        CargarDatos cargar = new CargarDatos(c1);
        
        System.out.println("***** Inicio del campeonato: Campeonato de "+ c1.getNombreCampeonato() + " *****" + "\n");
        
        //Asignamos las raquetas
        //Llamada al método que inicia la simulación del campeonato
        //Llamar al método que hayáis definido en vuestra clase Campeonato en la variable instanciada de tipo campeonato para que realice el campeonato;
        c1.competicion(); 
    }
}
