/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vehiculos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class TurboJetTest {
    
    public TurboJetTest() {
    }

    @Test
    public void testGetPotencia() {
        System.out.println("getPotencia");
        int potencia = 3;
        TurboJet turboJet = new TurboJet(potencia,3,"Hola");
        int expResult = potencia;
        int result = turboJet.getPotencia();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPotencia() {
        System.out.println("setPotencia");
        int potencia = 3;
        TurboJet turboJet = new TurboJet(potencia,3,"Hola");
        turboJet.setPotencia(potencia);
    }

    @Test
    public void testGetGastoCarburante() {
        System.out.println("getGastoCarburante");
        int gastoC = 3;
        TurboJet turboJet = new TurboJet(2,gastoC,"Hola");
        int expResult = gastoC;
        int result = turboJet.getGastoCarburante();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetGastoCarburante() {
        System.out.println("setGastoCarburante");
        int gastoC = 3;
        TurboJet turboJet = new TurboJet(2,gastoC,"Hola");
        turboJet.setGastoCarburante(gastoC);
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int gastoC = 3;
        String codigo = "1234";
        TurboJet turboJet = new TurboJet(2,gastoC,codigo);
        String expResult = codigo;
        String result = turboJet.getCodigo();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        int gastoC = 3;
        int potencia = 2;
        String codigo = "1234";
        TurboJet turboJet = new TurboJet(potencia,gastoC,codigo);
        String expResult = "TurboJet{" + "potencia=" + potencia + ", gastoCarburante=" + gastoC + ", codigo=" + codigo + '}';;
        String result = turboJet.toString();
        assertEquals(expResult, result);
    }
    
}
