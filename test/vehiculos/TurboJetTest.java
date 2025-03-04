/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vehiculos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class TurboJetTest {
    
    public TurboJetTest() {
    }

    @Test
    public void testGetPotencia() {
        System.out.println("getPotencia");
        TurboJet instance = null;
        int expResult = 0;
        int result = instance.getPotencia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPotencia() {
        System.out.println("setPotencia");
        int potencia = 0;
        TurboJet instance = null;
        instance.setPotencia(potencia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGastoCarburante() {
        System.out.println("getGastoCarburante");
        TurboJet instance = null;
        int expResult = 0;
        int result = instance.getGastoCarburante();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGastoCarburante() {
        System.out.println("setGastoCarburante");
        int gastoCarburante = 0;
        TurboJet instance = null;
        instance.setGastoCarburante(gastoCarburante);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        TurboJet instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        TurboJet instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
