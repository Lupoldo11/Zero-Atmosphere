
package aliens;

import utils.Text;

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

    //Metodos de la clase
    public double getInvisibilidad() {
        return invisibilidad;
    }

    public void setInvisibilidad(double invisibilidad) {
        this.invisibilidad = invisibilidad;
    }

    //Metodos abstractos del padre
    @Override
    public void comer() {
        System.out.println(Text.alien_come);
    }

    @Override
    public void dormir() {
        System.out.println(Text.alien_duerme);
    }

    @Override
    public void atacar() {
        System.out.println(Text.alien_ataca);
    }

    //Metodo toString
   @Override
    public String toString(){
    return "raisers";
    }
}
