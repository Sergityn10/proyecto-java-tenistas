

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AmortiguadasTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class AmortiguadasTest
{
    private Zapatillas z1;
    
    /**
     * Default constructor for test class AmortiguadasTest
     */
    public AmortiguadasTest()
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
    public void testCalcularValorSaqueZapatillas()
    {
        assertEquals(10.8, z1.calcularValorSaque());
        assertNotSame(10.2, z1.calcularValorSaque());
    }
}
