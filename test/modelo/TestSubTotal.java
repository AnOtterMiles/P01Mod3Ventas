package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSubTotal {
    @Test
    public void testSubVentas() {
        System.out.println("SubVentas");
        int p = 150;
        int c = 10;
        ColeccionVentas instance = new ColeccionVentas();
        int expResult = 1500;
        int result = instance.SubVentas(p, c);
        assertEquals(expResult, result);
    }
}
