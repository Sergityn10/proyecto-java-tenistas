

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RaquetasPotentesTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class RaquetasPotentesTest
{
    private RaquetasPotentes r1;

    /**
     * Default constructor for test class RaquetasPotentesTest
     */
    public RaquetasPotentesTest()
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
        r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0, TipoEncordado.Abierto);
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
    public void testCalcularPotencia()
    {
        assertEquals(4, r1.calcularPotencia());
        assertNotSame(3, r1.calcularPotencia());
    }

    @Test
    public void testCalcularVelocidad()
    {
        assertEquals(12, r1.calcularVelocidad());
        assertNotSame(10, r1.calcularVelocidad());
    }
}


