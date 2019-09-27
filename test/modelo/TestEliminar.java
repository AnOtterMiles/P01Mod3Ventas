package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Borrar");
        Venta venta = new Venta("Jugo Jumex Pera", 350, 10);
        String codigo = "Jugo Jumex Pera";
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        assertEquals(esperado, obtenido);
    }
}
