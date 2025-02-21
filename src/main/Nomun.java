package main;
/**
 *
 * @author gasto
 */
public class Nomun extends Alien{
    //Atributo
    public double autotraslacion;
    
    //Constructor
    public Nomun(String arma, String dificultad, double autotraslacion) {
        super(arma, dificultad);
        this.autotraslacion = autotraslacion;
    }
    
    //Metodo de la clase
    public double getAutotraslacion() {
        return autotraslacion;
    }

    public void setAutotraslacion(double autotraslacion) {
        this.autotraslacion = autotraslacion;
    }

    //Metodos abstractos del padre
    @Override
    public void comer() {
        System.out.println("Hmmm");
    }

    @Override
    public void dormir() {
        System.out.println("Duermiendo");
    }

    @Override
    public void atacar() {
        System.out.println("Atack!");
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Nomun";
    }
}
