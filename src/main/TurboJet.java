package main;

public class TurboJet {

    private int potencia;
    private int gastoCarburante;
    private String codigo;

    public TurboJet(int potencia, int gastoCarburante, String codigo) {
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

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "TurboJet{" + "potencia=" + potencia + ", gastoCarburante=" + gastoCarburante + ", codigo=" + codigo + '}';
    }

}