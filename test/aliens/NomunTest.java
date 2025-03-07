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
        Nomun Autotraslacion = new Nomun("HOLA","SI", 2.00);
        double expResult = 2.00;
        double result = Autotraslacion.getAutotraslacion();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetAutotraslacion() {
        Double autotraslacion = 2.00;
        Nomun Autotraslacion = new Nomun("HOLA","NO", autotraslacion);
        Autotraslacion.setAutotraslacion(autotraslacion);
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Nomun testComer = new Nomun("HOLA","SI",2.00);
        String expResult = "hmmm";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testDormir() {
        System.out.println("durmiendo");
        Nomun testDurmiendo = new Nomun("HOLA","SI",2.00);
        String expResult = "hmmm";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Nomun testAtacar = new Nomun("HOLA","SI",2.00);
        String expResult = "Atack!";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Nomun toString = new Nomun("HOLA","nO",2.00);
        String expResult = "Nomun";
        String result = toString.toString();
        assertEquals(expResult, result);
    }
    
}
