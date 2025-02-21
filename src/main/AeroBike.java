package main;

public class AeroBike extends Vehiculo {

    private int velocidadMax;
    private String color;
    private boolean arrancado;

    public AeroBike(int velocidadMax, String color, boolean arrancado, int numPersonas, int maxPersonas, TurboJet turbojet, Codigo codigo, int capacidadCarburante, int gastoCarburante) {
        super(numPersonas, maxPersonas, turbojet, codigo, capacidadCarburante, gastoCarburante);
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.arrancado = arrancado;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    @Override
    public String toString() {
        return "AeroBike{" + "velocidadMax=" + velocidadMax + ", color=" + color + ", arrancado=" + arrancado + '}';
    }

}
