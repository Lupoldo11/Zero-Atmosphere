/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vehiculos;

import habitaciones.TunelCiclonico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class AeroBikeTest {
    
    public AeroBikeTest() {
    }

    @Test
    public void testGetVelocidadMax() {
        System.out.println("getVelocidadMax");
        int velMax = 10;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        TunelCiclonico tc = new TunelCiclonico();
        AeroBike aeroBike = new AeroBike(velMax,"verde",true,3,6,turboJet);
        int result = aeroBike.getVelocidadMax();
        int expectresult = velMax;
        assertEquals(expectresult, result);
    }

    @Test
    public void testSetVelocidadMax() {
        System.out.println("getVelocidadMax");
        int velMax = 10;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(velMax,"verde",true,3,6,turboJet);
        int velNew = 20;
        aeroBike.setVelocidadMax(velNew);
        int result = aeroBike.getVelocidadMax();
        assertEquals(velNew, result);
    }

    @Test
    public void testGetColor() {
        System.out.println("getColor");
        String color = "Verde";
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(2,color,true,3,6,turboJet);
        String result = aeroBike.getColor();
        assertEquals(color, result);
    }

    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "Verde";
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(2,color,true,3,6,turboJet);
        aeroBike.setColor(color);
    }

    @Test
    public void testIsArrancado() {
        System.out.println("isArrancado");
        Boolean arrancando = true;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(2,"Verde",arrancando,3,6,turboJet);
        boolean result = aeroBike.isArrancado();
        assertEquals(true, result);
    }

    @Test
    public void testSetArrancado() {
        System.out.println("setArrancado");
        boolean arrancando = true;
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(2,"Verde",arrancando,3,6,turboJet);
        aeroBike.setArrancado(arrancando);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        TurboJet turboJet = new TurboJet(1,3,"Hola");
        AeroBike aeroBike = new AeroBike(2,"Verde",true,3,6,turboJet);
        String expResult = "AeroBike{" + "velocidadMax=" + aeroBike.getVelocidadMax()+ ", color=" + aeroBike.getColor() + ", arrancado=" + aeroBike.isArrancado() + '}';
        String result = aeroBike.toString();
        assertEquals(expResult, result);
    }
    
}