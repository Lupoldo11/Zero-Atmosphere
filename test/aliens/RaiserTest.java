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
        Raiser getInvisibilidad = new Raiser ("CHAU","DD",32.00);
        double expResult = 32.00;
        double result = getInvisibilidad.getInvisibilidad();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetInvisibilidad() {
        System.out.println("setInvisibilidad");
        double invisibilidad = 32.00;
        Raiser invis = new Raiser("AA","BB",32.00);
        invis.setInvisibilidad(invisibilidad);
    }
    @Test
    public void testComer() {
        System.out.println("comer");
        Raiser testComer = new Raiser("HOLA","SI",2.00);
        String expResult = "hmmm";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testDormir() {
        System.out.println("durmiendo");
        Raiser testDurmiendo = new Raiser("HOLA","SI",2.00);
        String expResult = "hmmm";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Raiser testAtacar = new Raiser("HOLA","SI",2.00);
        String expResult = "Atack!";
        assertEquals(expResult,expResult);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Raiser toString = new Raiser("HOLA","nO",2.00);
        String expResult = "raisers";
        String result = toString.toString();
        assertEquals(expResult, result);
    }
    
}
