/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vehiculos;

import habitaciones.Laboratorio;
import habitaciones.TunelCiclonico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class NaveTest {
    
    public NaveTest() {
    }

    @Test
    public void testGetNumRampas() {
        System.out.println("getNumRampas");
        Nave instance = null;
        int expResult = 0;
        int result = instance.getNumRampas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumRampas() {
        System.out.println("setNumRampas");
        int numRampas = 0;
        Nave instance = null;
        instance.setNumRampas(numRampas);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPotenciaKwMs() {
        System.out.println("getPotenciaKwMs");
        Nave instance = null;
        double expResult = 0.0;
        double result = instance.getPotenciaKwMs();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPotenciaKwMs() {
        System.out.println("setPotenciaKwMs");
        double potenciaKwMs = 0.0;
        Nave instance = null;
        instance.setPotenciaKwMs(potenciaKwMs);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumMotores() {
        System.out.println("getNumMotores");
        Nave instance = null;
        int expResult = 0;
        int result = instance.getNumMotores();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumMotores() {
        System.out.println("setNumMotores");
        int numMotores = 0;
        Nave instance = null;
        instance.setNumMotores(numMotores);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLaboratorio() {
        System.out.println("getLaboratorio");
        Nave instance = null;
        Laboratorio expResult = null;
        Laboratorio result = instance.getLaboratorio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLaboratorio() {
        System.out.println("setLaboratorio");
        Laboratorio laboratorio = null;
        Nave instance = null;
        instance.setLaboratorio(laboratorio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTunelCiclonico() {
        System.out.println("getTunelCiclonico");
        Nave instance = null;
        TunelCiclonico expResult = null;
        TunelCiclonico result = instance.getTunelCiclonico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTunelCiclonico() {
        System.out.println("setTunelCiclonico");
        TunelCiclonico tunelCiclonico = null;
        Nave instance = null;
        instance.setTunelCiclonico(tunelCiclonico);
        fail("The test case is a prototype.");
    }
    
}
