package main;
/**
 *
 * @author masar
 */
public class Gato extends Mascota {

    protected String raza;
    protected String color;
    protected String pelo;

    public Gato(String raza, String color, String pelo) {
        super(edadGato()); //añadir metodo para calcular edad de un gato
        this.raza = raza;
        this.color = color;
        this.pelo = pelo;
    }

    public static int edadGato(){
        return (int) (Math.random() * 20) + 1;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }

    public void maullar() {
        System.out.println("Miauuu");
    }

    public void ronronear() {
        System.out.println("Prrrrr");
    }

    @Override
    public String toString() {
        return "Gato cuyo nombre es " + nombre + " edad " + edad + " de raza "
                + raza + " color " + color + " tipo de pelo " + pelo + " amo:" + 0+ " codigo de mascota: "+super.codigo;
    }

}