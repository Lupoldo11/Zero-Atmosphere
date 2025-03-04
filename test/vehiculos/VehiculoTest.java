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
public class VehiculoTest {
    
    public VehiculoTest() {
    }

    @Test
    public void testGetNumPersonas() {
        System.out.println("getNumPersonas");
        Vehiculo instance = null;
        int expResult = 0;
        int result = instance.getNumPersonas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumPersonas() {
        System.out.println("setNumPersonas");
        int numPersonas = 0;
        Vehiculo instance = null;
        instance.setNumPersonas(numPersonas);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTurbojet() {
        System.out.println("getTurbojet");
        Vehiculo instance = null;
        TurboJet expResult = null;
        TurboJet result = instance.getTurbojet();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTurbojet() {
        System.out.println("setTurbojet");
        TurboJet turbojet = null;
        Vehiculo instance = null;
        instance.setTurbojet(turbojet);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaxPersonas() {
        System.out.println("getMaxPersonas");
        Vehiculo instance = null;
        int expResult = 0;
        int result = instance.getMaxPersonas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaxPersonas() {
        System.out.println("setMaxPersonas");
        int maxPersonas = 0;
        Vehiculo instance = null;
        instance.setMaxPersonas(maxPersonas);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaCarburante() {
        System.out.println("calculaCarburante");
        double distancia = 0.0;
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.calculaCarburante(distancia);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMetodoTransmision() {
        System.out.println("metodoTransmision");
        double distancia = 0.0;
        String expResult = "";
        String result = Vehiculo.metodoTransmision(distancia);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class VehiculoImpl extends Vehiculo {

        public VehiculoImpl() {
            super(0, 0, null);
        }
    }
    
}
