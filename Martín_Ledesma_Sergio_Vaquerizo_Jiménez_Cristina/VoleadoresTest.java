

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

/**
 * The test class VoleadoresTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class VoleadoresTest
{
    private Zapatillas z7;
    private Zapatillas z5;
    private Zapatillas z1;
    private Zapatillas z2;
    private Zapatillas z9;
    private Zapatillas z10;
    private Raqueta r1;
    private Raqueta r5;
    private Raqueta r16;
    private Raqueta r15;
    private Tenista tenista3;
    private Tenista tenista4;
    private Campeonato campeonato1;
    
    /**
     * Default constructor for test class VoleadoresTest
     */
    public VoleadoresTest()
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
        z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);
        z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        z9 = new ZapatillasAmortiguadas("Lotto Space", 39.0, 5.0);
        z10 = new ZapatillasConAgarre("Adidas Gamecourt", 43.0, 5.0);
        r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0, TipoEncordado.Abierto); //12
        r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado); //2.4
        r16 = new RaquetasPotentes("Babolat Boost Drive", 220.0, 680.0,600.0, TipoEncordado.Cerrado); //15
        r15 = new RaquetasPotentes("Wilson Pro Open", 340.0, 740.0, 720.0, TipoEncordado.Abierto); //3
        tenista3 = new Voleadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0, r1);
        tenista4 = new Voleadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0, r5);
        campeonato1 = Campeonato.getInstance();
        tenista3.realizarInscripcion();
        tenista4.realizarInscripcion();
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
    public void testCalcularSaqueTenistaVoleador()
    {
        assertEquals(19958.4, tenista3.calcularSaque());
        assertNotSame(20, tenista3.calcularSaque());
    }
    
    @Test
    public void testCalcularRestoTenistaVoleador()
    {
        assertEquals(27249.3, tenista4.calcularResto());
        assertNotSame(25, tenista4.calcularResto());
    }
    
    @Test
    public void testSacarVoleador()
    {
        tenista3.sacar();
        assertEquals(19958.4, tenista3.getPuntosAcumulados());
    }
    
    @Test
    public void testRestarVoleador()
    {
        tenista4.restar(tenista3);
        assertEquals(27249.3, tenista4.getPuntosAcumulados());
    }

    @Test
    public void testCambiarRaquetaTenistaVoleador()
    {
        tenista3.cambiarRaqueta();
        tenista4.cambiarRaqueta();
        assertEquals(r1, tenista3.getRaqueta());
        assertEquals(r5, tenista4.getRaqueta());
        campeonato1.rellenarRaquetasCampeonato(r16);
        campeonato1.rellenarRaquetasCampeonato(r15);
        tenista3.cambiarRaqueta();
        tenista4.cambiarRaqueta();
        assertEquals(r16, tenista3.getRaqueta());
        assertEquals(r15, tenista4.getRaqueta());
    }
    
    @Test
    public void testJugar()
    {
        tenista3.jugar(tenista4);
        assertEquals(19959.0, tenista3.getPuntosAcumulados());
        assertEquals(27249.3, tenista4.getPuntosAcumulados());
    }
    
    @Test
    public void testElegirZapatillasVoleador()
    {
        campeonato1.rellenarZapatillasCampeonato(z1);
        campeonato1.rellenarZapatillasCampeonato(z2);
        campeonato1.rellenarZapatillasCampeonato(z9);
        campeonato1.rellenarZapatillasCampeonato(z10);
        tenista3.elegirZapatillas();
        tenista4.elegirZapatillas();
        assertEquals(z10, tenista3.getZapatillas());
        assertEquals(z9, tenista4.getZapatillas());
        assertNotSame(z7, tenista3.getZapatillas());
        assertNotSame(z5, tenista4.getZapatillas());
    }
}


