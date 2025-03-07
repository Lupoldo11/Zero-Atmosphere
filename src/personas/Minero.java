package personas;
/**
 *
 * @author Lupoldo
 */

import utils.Codigo;
import utils.Text;

public class Minero extends Persona {
    //Atributos
    //Constructor
    public Minero() {
        super(Codigo.generarMinero());
    }
    //Metodos
    @Override
    public String toString(){
        return Text.str_minero +Codigo.generarMinero()+"\n"+super.texto_toString() + "\n"+Text.separador;
    }
}