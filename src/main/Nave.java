package main;

public class Nave extends Vehiculo {

    private int numRampas;
    private double potenciaKwMs;
    private int numMotores;
    private Laboratorio laboratorio;
    private TunelCiclonico tunelCiclonico;

    public Nave(int numRampas, double potenciaKwMs, int numMotores, Laboratorio laboratorio, TunelCiclonico tunelCiclonico, TurboJet turbojet, Codigo codigo) {
        super(turbojet, codigo);
        this.numRampas = numRampas;
        this.potenciaKwMs = potenciaKwMs;
        this.numMotores = numMotores;
        this.laboratorio = laboratorio;
        this.tunelCiclonico = tunelCiclonico;
    }


}
