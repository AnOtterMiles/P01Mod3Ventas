package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("Dulce Mentitas", 250, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        venta = new Venta("Dulce Mentitas", 200, 5);
        boolean obtenido = instance.Modificar(venta);
        assertEquals(esperado, obtenido);
    }
}
