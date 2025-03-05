package vehiculos;
/**
 *
 * @author Ana
 */
import utils.Codigo;

public abstract class Vehiculo {
    //Atributo
    protected TurboJet turbojet;
    protected String codigo;
    public static int gastoCarburante=12;

    //Constructor
    public Vehiculo(TurboJet turbojet) {
        this.turbojet = turbojet;
        this.codigo = Codigo.generarVehiculo();
    }

    //Getter y Setter
    public TurboJet getTurbojet() {
        return turbojet;
    }

    public void setTurbojet(TurboJet turbojet) {
        this.turbojet = turbojet;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * gastoCarburante;
    }

    //Metodo de Economia de distancia
    public static String metodoTransmision(double distancia) {
        if (distancia < 1) {
            return "economico";
        } else {
            return "estelar";
        }
    }
        
    //Metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" + " turbojet=" + turbojet + ", codigo=" + codigo + '}';
    }

}