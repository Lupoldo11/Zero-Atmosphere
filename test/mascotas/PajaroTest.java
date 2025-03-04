/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mascotas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class PajaroTest {
    
    public PajaroTest() {
    }

    @Test
    public void testEdadPajaro() {
        System.out.println("edadPajaro");
        int expResult = 0;
        int result = Pajaro.edadPajaro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Pajaro instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Pajaro instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPiar() {
        System.out.println("piar");
        Pajaro instance = null;
        instance.piar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testVolar() {
        System.out.println("volar");
        Pajaro instance = null;
        instance.volar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Pajaro instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
