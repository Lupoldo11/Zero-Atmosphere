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
public class RaiserTest {
    
    public RaiserTest() {
    }

    @Test
    public void testGetInvisibilidad() {
        System.out.println("getInvisibilidad");
        Raiser instance = null;
        double expResult = 0.0;
        double result = instance.getInvisibilidad();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetInvisibilidad() {
        System.out.println("setInvisibilidad");
        double invisibilidad = 0.0;
        Raiser instance = null;
        instance.setInvisibilidad(invisibilidad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Raiser instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Raiser instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Raiser instance = null;
        instance.atacar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Raiser instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
