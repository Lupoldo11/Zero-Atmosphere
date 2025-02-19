package main;
import java.util.Scanner;
/**
 *
 * @author gasto
 */
public abstract class Alien {
    public String codigoA;
    public String arma;
    public String dificultad;

    public Alien(String codigoA,String arma, String dificultad) {
    }

    public String getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(String codigoA) {
        this.codigoA = codigoA;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    
    public abstract void comer();
    
    public abstract void dormir();
    
    
    public abstract void atacar();

    @Override
    public abstract String toString();   
}
