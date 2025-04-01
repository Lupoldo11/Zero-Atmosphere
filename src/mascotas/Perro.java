package mascotas;

import utils.Text;

/**
 *
 * @author masar
 */
public class Perro extends Mascota{
    protected String raza;
    protected double peso;
    protected String size;
    
    public Perro(String raza,String size){
        super(edadPerro()); //añadir metodo para calcular edad de un perro
        this.raza=raza;
        this.peso= (int) (Math.random() * 110) + 2;
        this.size=size;
    }

    public static int edadPerro(){
        return (int) (Math.random() * 13) + 1;
    }

    @Override
    public String toString() {
        return Text.perro_nombre +nombre+ Text.str_raza + raza + Text.str_peso + peso + Text.str_tamanio + size+ Text.str_amo
                + ""+0+Text.codigo_mascota+super.codigo;
    }
}