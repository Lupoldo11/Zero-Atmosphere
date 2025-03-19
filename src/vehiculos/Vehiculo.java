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
//METODO PARA GENERAR VEHICULOS
    /*
    public static void generadorVehiculo(int total_vehiculos, int contador_AeroBike, int contador_AeroCar, int contador_Nave, int contador_TurboJet) {
    for (int i = 0; i < total_vehiculos; i++) {
      
        if (contador_AeroBike > 0) {
            
            Vehiculo ejemplo1 = new AeroBike(2456,"rojo",true);  // Crear un AeroBike con personas
            Text.listVehiculos.add(ejemplo1);
            contador_AeroBike--;  // Decrementar el contador de AeroBike
        }
  
        else if (contador_AeroCar > 0) {
     
            Vehiculo ejemplo2 = new AeroCar();  // Crear un AeroCar con personas
            Text.listVehiculos.add(ejemplo2);
            contador_AeroCar--;  // Decrementar el contador de AeroCar
        }
  
        else if (contador_Nave > 0) {
            // Crear una Nave (parámetros pueden ser ajustados según el tipo de nave)
            
            Vehiculo ejemplo3 = new Nave(2, 1000.0, 4, laboratorio, tunelCiclonico, 10, 200, TurboJet.motorNave(), Codigo.generarVehiculo());
            Text.listVehiculos.add(ejemplo3);
            contador_Nave--;  // Decrementar el contador de Naves
        }
      
        else if (contador_TurboJet > 0) {
            Vehiculo ejemplo4 = new TurboJet();
            Text.listVehiculos.add(ejemplo4);
            contador_TurboJet--;  // Decrementar el contador de TurboJets
        }
    }
}*/
}