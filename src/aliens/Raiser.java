package aliens;
/**
 *
 * @author gasto
 */
public class Raiser extends Alien {
    //Atributos
    public double invisibilidad;
   
   //Constructores
    public Raiser(String arma, String dificultad,double invisibilidad) {
        super(arma, dificultad);
        this.invisibilidad = invisibilidad;
    }

    //Metodo toString
   @Override
    public String toString(){
    return "raisers";
    }
}
