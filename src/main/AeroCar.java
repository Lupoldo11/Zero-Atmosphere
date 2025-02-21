package main;

public class AeroCar extends Vehiculo {

    private int numMarchas;
    private String modelo;
    private int capacidadCarburante;

    public AeroCar(int numMarchas, String modelo, int capacidadCarburante, int numPersonas, int maxPersonas, TurboJet turbojet, Codigo codigo) {
        super(numPersonas, maxPersonas, turbojet, codigo);
        this.numMarchas = numMarchas;
        this.modelo = modelo;
        this.capacidadCarburante = capacidadCarburante;
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

    public int getCapacidadCarburante() {
        return capacidadCarburante;
    }

    public void setCapacidadCarburante(int capacidadCarburante) {
        this.capacidadCarburante = capacidadCarburante;
    }

    public double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * 12;
    }

    @Override
    public String toString() {
        return "AeroCar{" + "numMarchas=" + numMarchas + ", modelo=" + modelo + ", capacidadCarburante=" + capacidadCarburante + '}';
    }

}