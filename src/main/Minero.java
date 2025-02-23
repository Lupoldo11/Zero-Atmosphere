package main;
/**
 *
 * @author Lupoldo
 */
public class Minero extends Persona {
    //Atributos
    //Constructor
    public Minero() {
        super(Codigo.generarMinero());
    }
    //Metodos
    @Override
    public String toString(){
        return "Trabajo: Minero: "+Codigo.generarMinero()+"\n"+super.texto_toString() + "\n"+Text.separador;
    }
}
