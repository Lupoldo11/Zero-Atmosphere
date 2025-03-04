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
public class GatoTest {
    
    public GatoTest() {
    }

    @Test
    public void testEdadGato() {
        System.out.println("edadGato");
        Gato gto = new Gato("a","b","c");
        int expResult = gto.getEdad();
        int result = Gato.edadGato();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRaza() {
        System.out.println("getRaza");
        Gato instance = null;
        String expResult = "";
        String result = instance.getRaza();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRaza() {
        System.out.println("setRaza");
        String raza = "";
        Gato instance = null;
        instance.setRaza(raza);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Gato instance = null;
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Gato instance = null;
        instance.setColor(color);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPelo() {
        System.out.println("getPelo");
        Gato instance = null;
        String expResult = "";
        String result = instance.getPelo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPelo() {
        System.out.println("setPelo");
        String pelo = "";
        Gato instance = null;
        instance.setPelo(pelo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Gato instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Gato instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaullar() {
        System.out.println("maullar");
        Gato instance = null;
        instance.maullar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRonronear() {
        System.out.println("ronronear");
        Gato instance = null;
        instance.ronronear();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Gato instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}