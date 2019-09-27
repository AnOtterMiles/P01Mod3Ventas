package modelo;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestListar {
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<>();
        ArrayList<Venta> obtenido = instance.Listar();
        assertEquals(esperado, obtenido);
    }
}
