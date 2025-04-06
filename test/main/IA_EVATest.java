/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import java.util.Vector;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class IA_EVATest {
    
    public IA_EVATest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        IA_EVA.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testConfig() {
        System.out.println("config");
        IA_EVA.config();
        fail("The test case is a prototype.");
    }

    @Test
    public void testReset() {
        System.out.println("reset");
        IA_EVA.reset();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMetodo_toString() {
        System.out.println("metodo_toString");
        Vector ejemplo = null;
        IA_EVA.metodo_toString(ejemplo);
        fail("The test case is a prototype.");
    }
    
}
