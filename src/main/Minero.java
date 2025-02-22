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
        return Codigo.generarMinero()+"\n"+super.texto_toString() + "\nTrabajo: Minero";
    }
}
