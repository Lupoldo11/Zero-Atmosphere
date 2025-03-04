/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package aliens;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class NomunTest {
    
    public NomunTest() {
    }

    @Test
    public void testGetAutotraslacion() {
        System.out.println("getAutotraslacion");
        Nomun instance = null;
        double expResult = 0.0;
        double result = instance.getAutotraslacion();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAutotraslacion() {
        System.out.println("setAutotraslacion");
        double autotraslacion = 0.0;
        Nomun instance = null;
        instance.setAutotraslacion(autotraslacion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Nomun instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Nomun instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Nomun instance = null;
        instance.atacar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Nomun instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
