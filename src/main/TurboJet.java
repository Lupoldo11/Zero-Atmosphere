package main;

public class TurboJet {

    private int potencia;
    private int gastoCarburante;
    private Codigo codigo;

    public TurboJet(int potencia, int gastoCarburante, Codigo codigo) {
        this.potencia = potencia;
        this.gastoCarburante = gastoCarburante;
        this.codigo = codigo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGastoCarburante() {
        return gastoCarburante;
    }

    public void setGastoCarburante(int gastoCarburante) {
        this.gastoCarburante = gastoCarburante;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "TurboJet{" + "potencia=" + potencia + ", gastoCarburante=" + gastoCarburante + ", codigo=" + codigo + '}';
    }

}