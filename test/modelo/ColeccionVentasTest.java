/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDROID
 */
public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Listar method, of class ColeccionVentas.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<>();
        ArrayList<Venta> obtenido = instance.Listar();
        assertEquals(esperado, obtenido);
    }

    /**
     * Test of Agregar method, of class ColeccionVentas.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("Helado paleta Trululu", 350, 12);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        assertEquals(esperado, obtenido);
    }

    /**
     * Test of Modificar method, of class ColeccionVentas.
     */
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

    /**
     * Test of Eliminar method, of class ColeccionVentas.
     */
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

    /**
     * Test of SubVentas method, of class ColeccionVentas.
     */
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
