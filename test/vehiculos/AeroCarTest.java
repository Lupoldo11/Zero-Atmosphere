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
public class AeroCarTest {
    
    public AeroCarTest() {
    }

    @Test
    public void testGetNumMarchas() {
        System.out.println("getNumMarchas");
        int numMarchas = 10;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(numMarchas,"verde",2.00,3,turboJet);
        int result = aeroCar.getNumMarchas();
        assertEquals(numMarchas, result);
    }

    @Test
    public void testSetNumMarchas() {
        System.out.println("setNumMarchas");
        int numMarchas = 0;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(numMarchas,"verde",2.00,3,turboJet);
        aeroCar.setNumMarchas(numMarchas);
    }

    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        String modelo = "Kawazaki";
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(20,modelo,2.00,3,turboJet);
        String result = aeroCar.getModelo();
        assertEquals(modelo, result);
    }

    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "Kawazaki";
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(20,modelo,2.00,3,turboJet);
        aeroCar.setModelo(modelo);
    }

    @Test
    public void testCalculaCarburante() {
        System.out.println("calculaCarburante");
        double distancia = 2.0;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(20,"Kawazaki",distancia,3,turboJet);
        double result = aeroCar.calculaCarburante(distancia);
        double expected = Math.sqrt(distancia) * 12;
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        double capacidadCarburante = 50;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroCar aeroCar = new AeroCar(20,"Kawazaki",12.00,3,turboJet);
        String expResult = "AeroCar{" + "numMarchas=" + aeroCar.getNumMarchas() + ", modelo=" + aeroCar.getModelo()+ ", capacidadCarburante=" + capacidadCarburante + '}';
        String result = aeroCar.toString();
        assertEquals(expResult, result);
    }
    
}