package main;

public class Nave extends Vehiculo {

    private int numRampas;
    private double potenciaKwMs;
    private int numMotores;
    private Laboratorio laboratorio;
    private TunelCiclonico tunelCiclonico;

    public Nave(int numRampas, double potenciaKwMs, int numMotores, Laboratorio laboratorio, TunelCiclonico tunelCiclonico, int numPersonas, int maxPersonas, TurboJet turbojet, Codigo codigo) {
        super(numPersonas, maxPersonas, turbojet, codigo);
        this.numRampas = numRampas;
        this.potenciaKwMs = potenciaKwMs;
        this.numMotores = numMotores;
        this.laboratorio = laboratorio;
        this.tunelCiclonico = tunelCiclonico;
    }

    public int getNumRampas() {
        return numRampas;
    }

    public void setNumRampas(int numRampas) {
        this.numRampas = numRampas;
    }

    public double getPotenciaKwMs() {
        return potenciaKwMs;
    }

    public void setPotenciaKwMs(double potenciaKwMs) {
        this.potenciaKwMs = potenciaKwMs;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public TunelCiclonico getTunelCiclonico() {
        return tunelCiclonico;
    }

    public void setTunelCiclonico(TunelCiclonico tunelCiclonico) {
        this.tunelCiclonico = tunelCiclonico;
    }

}
