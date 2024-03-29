

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ConAgarreTest.
 *
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * @Version: 3.0
 */
public class ConAgarreTest
{
    private Zapatillas z2;
    
    /**
     * Default constructor for test class ConAgarreTest
     */
    public ConAgarreTest()
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
        z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
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
    public void testCalcularValorRestoZapatillas()
    {
        assertEquals(11.049999999999999, z2.calcularValorResto());
        assertNotSame(10.9, z2.calcularValorResto());
    }
}
