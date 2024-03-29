

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RaquetasControladasTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class RaquetasControladasTest
{
    private RaquetasControladas r5;

    /**
     * Default constructor for test class RaquetasControladasTest
     */
    public RaquetasControladasTest()
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
        r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        
    }

    @Test
    public void testCalcularControl()
    {
        assertEquals(25, r5.calcularControl());
        assertNotSame(24, r5.calcularControl());
    }

    @Test
    public void testCalcularVelocidad()
    {
        assertEquals(2.4, r5.calcularVelocidad());
        assertNotSame(2, r5.calcularVelocidad());
    }
}


