package main;
/**
 *
 * @author gasto
 */
public class Raiser extends Alien {

   public int raiser;
   public double invisibilidad;
   
    public Raiser(int raiser, String codigoA, String arma, String dificultad,double invisibilidad) {
        super(codigoA, arma, dificultad);
        this.raiser = raiser;
        this.invisibilidad = invisibilidad;
    }
    public int alienigenasEsperadosRaisers(){

            raiser = (int) (Math.random() * 200) + 1;

    return raiser;
    }   

    public int getRaiser() {
        return raiser;
    }

    public void setRaiser(int raiser) {
        this.raiser = raiser;
    }

    public double getInvisibilidad() {
        return invisibilidad;
    }

    public void setInvisibilidad(double invisibilidad) {
        this.invisibilidad = invisibilidad;
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   @Override
    public String toString(){
    return "raisers";
    }
}
