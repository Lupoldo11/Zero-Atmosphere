package main;

public class AeroCar extends Vehiculo {

    public AeroCar(TurboJet turbojet, Codigo codigo) {
        super(turbojet, codigo);
    }

    public double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * 12;
    }

    public String metodoTransmision(double distancia) {
        if (distancia < 1) {
            return "economico";
        } else {
            return "estelar";
        }
    }
}
