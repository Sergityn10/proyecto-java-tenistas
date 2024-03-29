

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RaquetasEquilibradasTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class RaquetasEquilibradasTest
{
    private RaquetasEquilibradas r9;

    /**
     * Default constructor for test class RaquetasEquilibradasTest
     */
    public RaquetasEquilibradasTest()
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
        r9 = new RaquetasEquilibradas("Prince Hornet 100", 220.0, 690.0, 600.0, TipoEncordado.Cerrado, 2.5, 4.0);
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
        assertEquals(10, r9.calcularPotencia());
        assertNotSame(9, r9.calcularPotencia());
    }

    @Test
    public void testCalcularControl()
    {
        assertEquals(40, r9.calcularControl());
        assertNotSame(30, r9.calcularControl());
    }
}


