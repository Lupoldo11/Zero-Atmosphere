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

    public Mascota(String nombre, int edad, PropietarioMascota amo) {
        this.nombre = nombre;
        this.edad = edad;
        this.amo = amo;
        this.code = codigo.generarMascota();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PropietarioMascota getAmo() {
        return amo;
    }

    public void setAmo(PropietarioMascota amo) {
        this.amo = amo;
    }

    // Métodos abstractos
    public abstract void dormir();

    public abstract void comer();
}
