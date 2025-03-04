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
public class PerroTest {
    
    public PerroTest() {
    }

    @Test
    public void testEdadPerro() {
        System.out.println("edadPerro");
        int expResult = 0;
        int result = Perro.edadPerro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRaza() {
        System.out.println("getRaza");
        Perro instance = null;
        String expResult = "";
        String result = instance.getRaza();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRaza() {
        System.out.println("setRaza");
        String raza = "";
        Perro instance = null;
        instance.setRaza(raza);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Perro instance = null;
        double expResult = 0.0;
        double result = instance.getPeso();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        double peso = 0.0;
        Perro instance = null;
        instance.setPeso(peso);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Perro instance = null;
        String expResult = "";
        String result = instance.getSize();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "";
        Perro instance = null;
        instance.setSize(size);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Perro instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Perro instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLadrar() {
        System.out.println("ladrar");
        Perro instance = null;
        instance.ladrar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testJugar() {
        System.out.println("jugar");
        Perro instance = null;
        instance.jugar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Perro instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
