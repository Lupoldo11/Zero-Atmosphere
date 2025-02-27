package main;

public abstract class Vehiculo {
    //Atributo
    protected int numPersonas;
    protected int maxPersonas;
    protected TurboJet turbojet;
    protected String codigo;
    protected static int gastoCarburante=12;

    //Constructor
    public Vehiculo(int numPersonas, int maxPersonas, TurboJet turbojet) {
        this.numPersonas = numPersonas;
        this.maxPersonas = maxPersonas;
        this.turbojet = turbojet;
        this.codigo = Codigo.generarAerocar();
    }

    //Getter y Setter
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

    public String getCodigo() {
        return codigo;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }
    
    public static double calculaCarburante(double distancia) {
        return Math.sqrt(distancia) * gastoCarburante;
    }

    //Metodo de Economia de distancia
    public static String metodoTransmision(double distancia) {
        if (distancia < 1) {
            return "economico";
        } else {
            return "estelar";
        }
    }
        
    //Metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" + "numPersonas=" + numPersonas + ", maxPersonas=" + maxPersonas + ", turbojet=" + turbojet + ", codigo=" + codigo + '}';
    }

}
