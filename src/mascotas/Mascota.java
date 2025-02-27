package mascotas;
/**
 *
 * @author masar
 */

import utils.Codigo;
import utils.Text;
import personas.Persona;

public abstract class Mascota {
    //atributos
    protected String nombre;
    protected int edad;
    protected String codigo ;

    //Constructor
    public Mascota(int edad) {
        this.nombre = Text.fileMascotaN.get((int) (Math.random() * (Text.fileMascotaN.size()-1))); //Selecciona un nombre al azar
        this.codigo = Codigo.generarMascota();
        this.edad=edad;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getCodigo(){
        return this.codigo;
    }

    //Metodos static genera listMascota
    public static void generarMascota(String codigo){//Cambiar void por tipo Mascota
        String seleccion_mascota= String.valueOf( (int) (Math.random() * 3) + 1);
        switch (seleccion_mascota){
            case "1" -> Text.listMascota.add(new Perro("raza","pequeño"));//crea perro;
            case "2" -> Text.listMascota.add(new Gato("raza","color","pelo")); //crea gato;
            case "3" -> Text.listMascota.add(new Pajaro("color","especie",true)); //crea pajaro;
            default -> System.out.println(Text.error_seleccion);
        }
        Text.mascota_dueño.put(Text.listMascota.get(Text.listMascota.size()-1).getCodigo(),codigo);
    }
    
    // Métodos abstractos
    public abstract void dormir();
    public abstract void comer();
}