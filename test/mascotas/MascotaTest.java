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
public class MascotaTest {
    
    public MascotaTest() {
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Mascota instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Mascota instance = null;
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Mascota instance = null;
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Mascota instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGenerarMascota() {
        System.out.println("generarMascota");
        String codigo = "";
        Mascota.generarMascota(codigo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDormir() {
        System.out.println("dormir");
        Mascota instance = null;
        instance.dormir();
        fail("The test case is a prototype.");
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        Mascota instance = null;
        instance.comer();
        fail("The test case is a prototype.");
    }

    public class MascotaImpl extends Mascota {

        public MascotaImpl() {
            super(0);
        }

        public void dormir() {
        }

        public void comer() {
        }
    }
    
}
