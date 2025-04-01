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

    @Override
    public String toString() {
        return Text.gato_nombre + nombre + Text.str_edad + edad + Text.str_raza
                + raza + Text.str_color + color + Text.str_pelo + pelo + Text.str_amo + 0+ Text.codigo_mascota+super.codigo;
    }
}