package mascotas;

import utils.Text;

/**
 *
 * @author masar
 */
public class Gato extends Mascota {

    protected String raza;
    protected String color;
    protected String pelo;

    public Gato(String raza, String color, String pelo) {
        super(edadGato()); //añadir metodo para calcular edad de un gato
        this.raza = raza;
        this.color = color;
        this.pelo = pelo;
    }

    public static int edadGato(){
        return (int) (Math.random() * 20) + 1;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    @Override
    public void comer() {
        System.out.println(nombre + Text.mascota_come);
    }

    @Override
    public void dormir() {
        System.out.println(nombre + Text.mascota_duerme);
    }

    public void maullar() {
        System.out.println(Text.maullar);
    }

    public void ronronear() {
        System.out.println(Text.ronronear);
    }

    @Override
    public String toString() {
        return Text.gato_nombre + nombre + Text.str_edad + edad + Text.str_raza
                + raza + Text.str_color + color + Text.str_pelo + pelo + Text.str_amo + 0+ Text.codigo_mascota+super.codigo;
    }

}