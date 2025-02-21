package main;

public class AeroCar extends Vehiculo {

    private int numMarchas;
    private String modelo;

    public AeroCar(int numMarchas, String modelo, int numPersonas, int maxPersonas, TurboJet turbojet, Codigo codigo, int capacidadCarburante, int gastoCarburante) {
        super(numPersonas, maxPersonas, turbojet, codigo, capacidadCarburante, gastoCarburante);
        this.numMarchas = numMarchas;
        this.modelo = modelo;
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

    public String metodoTransmision(double distancia) {
        if (distancia < 1) {
            return "economico";
        } else {
            return "estelar";
        }
    }

    @Override
    public String toString() {
        return "AeroCar{" + "numMarchas=" + numMarchas + ", modelo=" + modelo + '}';
    }

}
