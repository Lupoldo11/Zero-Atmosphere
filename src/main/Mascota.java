package main;
/**
 *
 * @author masar
 */
public abstract class Mascota {
    //atributos
    protected String nombre;
    protected int edad;
    protected PropietarioMascota amo;
    protected String code;
    protected static Codigo codigo = new Codigo();

    //Constructor
    public Mascota(String nombre, int edad, PropietarioMascota amo,String code) {
        this.nombre = nombre;
        this.edad = edad;
        this.amo = amo;
        this.code = codigo.generarMascota();

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

    public PropietarioMascota getAmo() {
        return amo;
    }

    public void setAmo(PropietarioMascota amo) {
        this.amo = amo;
    }

    //Metodos static genera listMascota
    public static void generarMascota(){//Cambiar void por tipo Mascota
        String seleccion_mascota= String.valueOf( (int) (Math.random() * 3) + 1);
        switch (seleccion_mascota){
            case "1" -> Text.listMascota.add(new Perro()); //crea perro;
            case "2" -> Text.listMascota.add(new Gato()); //crea gato;
            case "3" -> Text.listMascota.add(new Pajaro()); //crea pajaro;
            default -> System.out.println(Text.error_seleccion);
        }
    }
    
    // Métodos abstractos
    public abstract void dormir();
    public abstract void comer();
}