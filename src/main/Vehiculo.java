package main;

public abstract class Vehiculo {

    protected int numPersonas;
    protected int maxPersonas;
    protected TurboJet turbojet;
    protected Codigo codigo;
    protected int capacidadCarburante;
    protected int gastoCarburante;

    public Vehiculo(int numPersonas, int maxPersonas, TurboJet turbojet, Codigo codigo, int capacidadCarburante, int gastoCarburante) {
        this.numPersonas = numPersonas;
        this.maxPersonas = maxPersonas;
        this.turbojet = turbojet;
        this.codigo = codigo;
        this.capacidadCarburante = capacidadCarburante;
        this.gastoCarburante = gastoCarburante;
    }
    

    public Vehiculo(int numPersonas, TurboJet turbojet, Codigo codigo) {
        this.numPersonas = numPersonas;
        this.turbojet = turbojet;
        this.codigo = codigo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public TurboJet getTurbojet() {
        return turbojet;
    }

    public void setTurbojet(TurboJet turbojet) {
        this.turbojet = turbojet;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public int getCapacidadCarburante() {
        return capacidadCarburante;
    }

    public void setCapacidadCarburante(int capacidadCarburante) {
        this.capacidadCarburante = capacidadCarburante;
    }

    public int getGastoCarburante() {
        return gastoCarburante;
    }

    public void setGastoCarburante(int gastoCarburante) {
        this.gastoCarburante = gastoCarburante;
    }

    public double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * gastoCarburante;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numPersonas=" + numPersonas + ", maxPersonas=" + maxPersonas + ", turbojet=" + turbojet + ", codigo=" + codigo + ", capacidadCarburante=" + capacidadCarburante + ", gastoCarburante=" + gastoCarburante + '}';
    }

}
