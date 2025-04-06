/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import herramientas.Herramienta;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class IA_GASTONTest {
    
    public IA_GASTONTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        IA_GASTON.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCrear_herramienta() {
        System.out.println("crear_herramienta");
        IA_GASTON.crear_herramienta();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMostrar_herramienta() {
        System.out.println("mostrar_herramienta");
        IA_GASTON.mostrar_herramienta();
        fail("The test case is a prototype.");
    }

    @Test
    public void testModificar_herramienta_0args() {
        System.out.println("modificar_herramienta");
        IA_GASTON.modificar_herramienta();
        fail("The test case is a prototype.");
    }

    @Test
    public void testModificar_herramienta_ArrayList() {
        System.out.println("modificar_herramienta");
        ArrayList<Herramienta> list = null;
        Herramienta expResult = null;
        Herramienta result = IA_GASTON.modificar_herramienta(list);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
