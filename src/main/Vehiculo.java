package main;

public abstract class Vehiculo {

    protected TurboJet turbojet;
    private Codigo codigo;

    public Vehiculo(TurboJet turbojet, Codigo codigo) {

        this.turbojet = turbojet;
        this.codigo = codigo;
    }


}
