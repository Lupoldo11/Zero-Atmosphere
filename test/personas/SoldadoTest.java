/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package personas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class SoldadoTest {
    
    public SoldadoTest() {
    }

    @Test
    public void testGetRango() {
        System.out.println("getRango");
        Soldado instance = new Soldado();
        String expResult = "";
        String result = instance.getRango();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRango() {
        System.out.println("setRango");
        String cambio_rango = "";
        Soldado instance = new Soldado();
        instance.setRango(cambio_rango);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Soldado instance = new Soldado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
