package herramientas;

import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Martillo extends Herramienta {

    //Atributos
    public int consumo;
    public String sujecion;

    //Constructores
    private Martillo() {
        super(Codigo.generarHerramienta());
        this.consumo = randomConsumo();
        this.sujecion = randomSujecion();
    }

    public static Martillo crear() {
        Martillo martillo = new Martillo();
        return martillo;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getSujecion() {
        return sujecion;
    }

    //Para dar un valor aleatorio a consumo y sujecion
    public int randomConsumo() {
        consumo = (int) ((Math.random() * 300) + 200); //Tiene que estar entre 200 y 300
        return consumo;
    }

    public String randomSujecion() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            sujecion = Text.sujecion_manual;
        } else {
            sujecion = Text.sujecion_correa;
        }
        return sujecion;
    }

    //Para introducir manualmente los valores
    public void setConsumo(int consumo) {
        if (consumo >= 200 && consumo <= 300) {
            this.consumo = consumo;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setSujecion(String sujecion) {
        if (sujecion.toLowerCase().equals(Text.sujecion_manual) || sujecion.toLowerCase().equals(Text.sujecion_correa)) {
            this.sujecion = sujecion;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

}
