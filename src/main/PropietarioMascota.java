package main;
/**
 *
 * @author masar
 */
public class PropietarioMascota {
    String nombre;
    
    public PropietarioMascota(){
        
    }
    public PropietarioMascota(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
