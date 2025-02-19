package main;
/**
 *
 * @author gasto
 */
public class Nomun extends Alien{
    //Atributo
    public int nomun;
    public double autotraslacion;
    //Constructor
    public Nomun(int nomun, String codigoA, String arma, String dificultad, double autotraslacion) {
        super(codigoA, arma, dificultad);
        this.nomun = nomun;
        this.autotraslacion = autotraslacion;
    }
    //Metodo
    public int alienigenasEsperadosNomun(){

            nomun = (int) (Math.random() * 200) + 1;

    return nomun;
    }  

    public int getNomun() {
        return nomun;
    }

    public void setNomun(int nomun) {
        this.nomun = nomun;
    }

    public double getAutotraslacion() {
        return autotraslacion;
    }

    public void setAutotraslacion(double autotraslacion) {
        this.autotraslacion = autotraslacion;
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
    public String toString() {
        return "Nomun{" + '}';
    }
}
