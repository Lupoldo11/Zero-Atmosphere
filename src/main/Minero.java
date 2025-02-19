package main;
/**
 *
 * @author Lupoldo
 */
public class Minero extends Persona {
    //Atributos
    //Constructor
    public Minero(String nombre, String apellidos, int edad, double peso) {
        super(nombre, apellidos, edad);
    }
    //Metodos
    @Override
    public String toString(){
        return Codigo.generarMinero()+"\n"+super.texto_toString() + "\nTrabajo: Minero";
    }
}
