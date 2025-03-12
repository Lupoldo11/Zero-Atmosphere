package herramientas;

import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Ciberexcavadora extends Herramienta {

    //Atributos
    public int consumo;
    public String traccion;

    //Constructores
    private Ciberexcavadora() {
        super(Codigo.generarHerramienta());
        this.consumo = randomConsumo();
        this.traccion = randomTraccion();
    }

    //Metodos
    public static Ciberexcavadora crear() {
        Ciberexcavadora excavadora = new Ciberexcavadora();
        return excavadora;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getTraccion() {
        return traccion;
    }

    //Para dar un valor aleatorio a consumo y traccion
    public int randomConsumo() {
        consumo = (int) ((Math.random() * 5) + 1); //Tiene que estar entre 1 y 5
        return consumo;
    }

    public String randomTraccion() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            traccion = Text.traccion_oruga;
        } else {
            traccion = Text.traccion_ruedas;
        }
        return traccion;
    }

    //Para introducir manualmente los valores
    public void setConsumo(int consumo) {
        if (consumo >= 1 && consumo <= 5) {
            this.consumo = consumo;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setTraccion(String traccion) {
        if (traccion.toLowerCase().equals(Text.traccion_oruga) || traccion.toLowerCase().equals(Text.traccion_ruedas)) {
            this.traccion = traccion;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

}
