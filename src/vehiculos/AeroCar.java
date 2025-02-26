package vehiculos;
/**
 *
 * @author Ana
 */
public class AeroCar extends Vehiculo {

    private int numMarchas;
    private String modelo;
    private double estado_deposito;
    private static final int maxPersona=4;
    private static final double capacidadCarburante=50;

    public AeroCar(int numMarchas, String modelo, double estado_deposito, int numPersonas,TurboJet turbojet) {
        super(numPersonas, AeroCar.maxPersona, turbojet);
        this.numMarchas = numMarchas;
        this.modelo = modelo;
        this.estado_deposito = estado_deposito;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * 12;
    }

    @Override
    public String toString() {
        return "AeroCar{" + "numMarchas=" + numMarchas + ", modelo=" + modelo + ", capacidadCarburante=" + capacidadCarburante + '}';
    }

}