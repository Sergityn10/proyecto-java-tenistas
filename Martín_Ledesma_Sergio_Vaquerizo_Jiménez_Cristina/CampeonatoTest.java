

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class CampeonatoTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class CampeonatoTest
{
    private Zapatillas z1;
    private Zapatillas z2;
    private Zapatillas z5;
    private Zapatillas z7;
    private Raqueta r1;
    private Raqueta r5;
    private Raqueta r16;
    private Raqueta r20;
    private Tenista tenista1;
    private Tenista tenista2;
    private Tenista tenista3;
    private Tenista tenista4;
    private Campeonato campeonato1;
    
    /**
     * Default constructor for test class CampeonatoTest
     */
    public CampeonatoTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        campeonato1.getInstance().borrarCampeonato();
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);
        r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0, TipoEncordado.Abierto); 
        r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
        r16 = new RaquetasPotentes("Babolat Boost Drive", 220.0, 680.0,600.0, TipoEncordado.Cerrado);
        r20 = new RaquetasControladas("Head Instinct", 220.0, 680.0,600.0, TipoEncordado.Abierto);
        tenista1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
        tenista2 = new Golpeadores("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40.0);
        tenista3 = new Voleadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0);
        tenista4 = new Voleadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0);
        campeonato1 = Campeonato.getInstance();
        tenista1.realizarInscripcion();
        tenista2.realizarInscripcion();
        tenista3.realizarInscripcion();
        tenista4.realizarInscripcion();
        campeonato1.rellenarRaquetasCampeonato(r1);
        campeonato1.rellenarRaquetasCampeonato(r5);
        campeonato1.rellenarRaquetasCampeonato(r16);
        campeonato1.rellenarRaquetasCampeonato(r20);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        campeonato1.getInstance().borrarCampeonato();
    }

    @Test
    public void testAsignarRaquetasYCompeticion()
    {
        assertEquals(null, tenista1.getRaqueta());
        assertEquals(null, tenista2.getRaqueta());
        assertEquals(null, tenista3.getRaqueta());
        assertEquals(null, tenista4.getRaqueta());
        campeonato1.competicion();
        assertNotSame(null, tenista1.getRaqueta());
        assertNotSame(null, tenista2.getRaqueta());
        assertNotSame(null, tenista3.getRaqueta());
        assertNotSame(null, tenista4.getRaqueta());
        assertEquals(1, campeonato1.getListCompetidores().size());
    }
}






