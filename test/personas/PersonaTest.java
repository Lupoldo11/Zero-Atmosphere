/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package personas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Persona instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String cambio_nombre = "";
        Persona instance = null;
        instance.setNombre(cambio_nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Persona instance = null;
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Persona instance = null;
        instance.setApellidos(apellidos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = null;
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMascotas() {
        System.out.println("getMascotas");
        Persona persona = null;
        Persona instance = null;
        instance.getMascotas(persona);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTexto_toString() {
        System.out.println("texto_toString");
        Persona instance = null;
        String expResult = "";
        String result = instance.texto_toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGeneradorPersona() {
        System.out.println("generadorPersona");
        int total_humanos = 0;
        int num_soldados = 0;
        Persona.generadorPersona(total_humanos, num_soldados);
        fail("The test case is a prototype.");
    }
    
}
