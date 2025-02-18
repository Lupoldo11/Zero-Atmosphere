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
    
    public Mascota(String nombre, int edad, PropietarioMascota amo) {
        this.nombre = nombre;
        this.edad = edad;
        this.amo = amo;
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

    // Métodos abstractos dentro de la clase Mascota
    public abstract void dormir();
    public abstract void comer();
}
