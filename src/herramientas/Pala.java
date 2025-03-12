package herramientas;

import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Pala extends Herramienta {

    //Atributos
    public int longMango;
    public String metal;

    //Constructores
    private Pala() {
        super(Codigo.generarHerramienta());
        this.longMango = randomLongMango();
        this.metal = randomMetal();
    }

    //Metodos
    public static Pala crear() {
        Pala pala = new Pala();
        return pala;
    }

    public int getLongMango() {
        return longMango;
    }

    public String getMetal() {
        return metal;
    }

    //Para dar un valor aleatorio a longitud de mango y metal
    public int randomLongMango() {
        longMango = (int) ((Math.random() * 5) + 1);
        return longMango;
    }

    public String randomMetal() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            metal = Text.metal_puro;
        } else {
            metal = Text.metal_aleacion;
        }
        return metal;
    }

    //Para introducir manualmente los valores
    public void setLongMango(int longMango) {
        if (longMango >= 1 && longMango <= 5) {
            this.longMango = longMango;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setMetal(String metal) {
        if (metal.toLowerCase().equals(Text.metal_puro) || metal.toLowerCase().equals(Text.metal_aleacion)) {
            this.metal = metal;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

}
