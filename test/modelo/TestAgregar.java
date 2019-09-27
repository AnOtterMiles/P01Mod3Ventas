package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAgregar {
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("Helado paleta Trululu", 350, 12);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        assertEquals(esperado, obtenido);
    }
}
