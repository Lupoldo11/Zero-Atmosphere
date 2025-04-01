package aliens;
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

    //Metodo toString
    @Override
    public String toString() {
        return "Nomun";
    }
}