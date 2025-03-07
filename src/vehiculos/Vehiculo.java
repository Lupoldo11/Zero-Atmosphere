package vehiculos;
/**
 *
 * @author Ana
 */
import utils.Codigo;
import utils.Text;

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
            return Text.economico;
        } else {
            return Text.estelar;
        }
    }
        
    //Metodo toString
    @Override
    public String toString() {
        return Text.vehiculo_tj + turbojet + Text.str_codigo + codigo + '}';
    }

}