/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vehiculos;

import habitaciones.Laboratorio;
import habitaciones.TunelCiclonico;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Codigo;

/**
 *
 * @author gasto
 */
public class NaveTest {
    
    public NaveTest() {
    }

    @Test
    public void testGetNumRampas() {
        System.out.println("getNumRampas");
        int numRampas = 20;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(numRampas,2.00,2,lab,tc,2,2,turboJet,cod);
        int expResult = 20;
        int result = nve.getNumRampas();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNumRampas() {
        System.out.println("setNumRampas");
        int numRampas = 20;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(numRampas,2.00,2,lab,tc,2,2,turboJet,cod);
        nve.setNumRampas(numRampas);
    }

    @Test
    public void testGetPotenciaKwMs() {
        System.out.println("getPotenciaKwMs");
        double PotenciaKwms = 2.00;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,PotenciaKwms,2,lab,tc,2,2,turboJet,cod);
        double expResult = 02.00;
        double result = nve.getPotenciaKwMs();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSetPotenciaKwMs() {
        System.out.println("setPotenciaKwMs");
        double PotenciaKwMs = 20.0;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,PotenciaKwMs,2,lab,tc,2,2,turboJet,cod);
        nve.setPotenciaKwMs(PotenciaKwMs);
    }

    @Test
    public void testGetNumMotores() {
        System.out.println("getNumMotores");
        int numMotores = 5;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,2.00,numMotores,lab,tc,2,2,turboJet,cod);      
        int expResult = numMotores;
        int result = nve.getNumMotores();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNumMotores() {
        System.out.println("setNumMotores");
        int numMotores = 5;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,2.00,numMotores,lab,tc,2,2,turboJet,cod);        
        nve.setNumMotores(numMotores);
    }

    @Test
    public void testGetLaboratorio() {
        System.out.println("getLaboratorio");
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,2.00,3,lab,tc,2,2,turboJet,cod);  
        Laboratorio expResult = null;
        Laboratorio result = nve.getLaboratorio();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLaboratorio() {
        System.out.println("setLaboratorio");
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        Laboratorio lab = new Laboratorio();
        Codigo cod = new Codigo();
        Nave nve = new Nave(2,2.00,3,lab,tc,2,2,turboJet,cod);  
        nve.setLaboratorio(laboratorio);
    }

    @Test
    public void testGetTunelCiclonico() {
        System.out.println("getTunelCiclonico");
        Nave instance = null;
        TunelCiclonico expResult = null;
        TunelCiclonico result = instance.getTunelCiclonico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTunelCiclonico() {
        System.out.println("setTunelCiclonico");
        TunelCiclonico tunelCiclonico = null;
        Nave instance = null;
        instance.setTunelCiclonico(tunelCiclonico);
        fail("The test case is a prototype.");
    }

}
