package main;
/**
 *
 * @author masar
 */
public class Perro extends Mascota{
    protected String raza;
    protected double peso;
    protected String size;
    
    public Perro(String raza,String size){
        super(edadPerro()); //añadir metodo para calcular edad de un perro
        this.raza=raza;
        this.peso= (int) (Math.random() * 110) + 2;
        this.size=size;
    }

    public static int edadPerro(){
        return (int) (Math.random() * 13) + 1;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public void comer(){
        System.out.println(nombre+" esta comiendo");
    }
    
    @Override
    public void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }
    
    public void ladrar(){
        System.out.println("Guau guau");
    }
    
    public void jugar(){
        System.out.println(nombre+" esta jugando");
    }

    @Override
    public String toString() {
        return "Perro cuyo nombre es " +nombre+", de raza " + raza + ", pesa " + peso + "kgs, tamaño: " + size+ ". Propietario: "
                + ""+0+" codigo de mascota: "+super.codigo;
    }
    
    
}