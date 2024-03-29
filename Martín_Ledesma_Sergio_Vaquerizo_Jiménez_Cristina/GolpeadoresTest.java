

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class GolpeadoresTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class GolpeadoresTest
{
    private Zapatillas z1;
    private Zapatillas z2;
    private Zapatillas z5;
    private Zapatillas z7;
    private Zapatillas z3;
    private Zapatillas z4;
    private Raqueta r1;
    private Raqueta r5;
    private Raqueta r16;
    private Raqueta r20;
    private Tenista tenista1;
    private Tenista tenista2;
    private Campeonato campeonato1;
    
    /**
     * Default constructor for test class GolpeadoresTest
     */
    public GolpeadoresTest()
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
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);
        z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
        z4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
        r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0, TipoEncordado.Abierto); 
        r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
        r16 = new RaquetasPotentes("Babolat Boost Drive", 220.0, 680.0,600.0, TipoEncordado.Cerrado);
        r20 = new RaquetasControladas("Head Instinct", 220.0, 680.0,600.0, TipoEncordado.Abierto);
        tenista1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0, r1);
        tenista2 = new Golpeadores("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40.0, r5);
        campeonato1 = Campeonato.getInstance();
        tenista1.realizarInscripcion();
        tenista2.realizarInscripcion();
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
    public void testCalcularSaqueTenistaGolpeador()
    {
        assertEquals(46656.00000000001, tenista1.calcularSaque());
        assertNotSame(40.120, tenista1.calcularSaque());
    }
    
    @Test
    public void testCalcularRestoTenistaGolpeador()
    {
        assertEquals(53039.99999999999, tenista2.calcularResto());
        assertNotSame(50000, tenista2.calcularResto());
    }
    
    @Test
    public void testSacarGolpeador()
    {
        tenista1.sacar();
        assertEquals(46656.00000000001, tenista1.getPuntosAcumulados());
    }

    @Test
    public void testRestarGolpeador()
    {
        tenista2.restar(tenista2);
        assertEquals(53039.99999999999, tenista2.getPuntosAcumulados());
    }
    
    @Test
    public void testGolpearTenistaGolpeador()
    {
        tenista1.golpear();
        tenista2.golpear();
        assertEquals(1.2000000000000002, tenista1.getPuntosAcumulados());
        assertEquals(0.24, tenista2.getPuntosAcumulados());
    }
    
    @Test
    public void testCambiarRaquetaTenistaGolpeador()
    {
        tenista1.cambiarRaqueta();
        tenista2.cambiarRaqueta();
        assertEquals(r1, tenista1.getRaqueta());
        assertEquals(r5, tenista2.getRaqueta());
        campeonato1.rellenarRaquetasCampeonato(r16);
        campeonato1.rellenarRaquetasCampeonato(r20);
        tenista1.cambiarRaqueta();
        tenista2.cambiarRaqueta();
        assertEquals(r16, tenista1.getRaqueta());
        assertEquals(r20, tenista2.getRaqueta());
    }
    
    @Test
    public void testJugar()
    {
        tenista1.jugar(tenista2);
        assertEquals(46657.200000000004, tenista1.getPuntosAcumulados());
        assertEquals(53039.99999999999, tenista2.getPuntosAcumulados());
    }
    
    @Test
    public void testElegirZapatillasGolpeador()
    {
        campeonato1.rellenarZapatillasCampeonato(z5);
        campeonato1.rellenarZapatillasCampeonato(z7);
        campeonato1.rellenarZapatillasCampeonato(z3);
        campeonato1.rellenarZapatillasCampeonato(z4);
        tenista1.elegirZapatillas();
        tenista2.elegirZapatillas();
        assertEquals(z4, tenista1.getZapatillas());
        assertEquals(z3, tenista2.getZapatillas());
        assertNotSame(z5, tenista1.getZapatillas());
        assertNotSame(z7, tenista2.getZapatillas());
    }
}

