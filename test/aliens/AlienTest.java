/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package aliens;

import aliens.Raiser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gasto
 */
public class AlienTest {
    
    public AlienTest() {
    }

    @Test
    public void testGetArma() {
        String arma = "Escopeta";
        Raiser Alien = new Raiser(arma,"hola",2);
        String expResult = arma;
        String result = Alien.getArma();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetArma() {
        String arma = "Escopeta";
        Raiser Alien = new Raiser(arma,"hola",2);
        Alien.setArma(arma);
    }

    @Test
    public void testGetDificultad() {
        String dificultad = "Dificil";
        Raiser Alien = new Raiser("pija",dificultad,2);
        String expResult = dificultad;
        String result = Alien.getDificultad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDificultad() {
        String dificultad = "Dificil";
        Raiser Alien = new Raiser("pija",dificultad,2);
        String expResult = dificultad;
        Alien.setDificultad(dificultad);
    }

    @Test
    public void testComer() {
        Raiser Alien = new Raiser("pija","dificil",2);
        Alien.comer();
    }

    @Test
    public void testDormir() {
        Raiser Alien = new Raiser("pija","dificil",2);
        Alien.dormir();
    }

    @Test
    public void testAtacar() {
        Raiser Alien = new Raiser("pija","dificil",2);
        Alien.atacar();
    }

    @Test
    public void testGeneradorAlien() {
        Raiser Alien = new Raiser("pija","dificil",2);
        int total_alien = 20;
        int contador_Raiser = 10;
        Alien.generadorAlien(total_alien, contador_Raiser);
    }
    
}