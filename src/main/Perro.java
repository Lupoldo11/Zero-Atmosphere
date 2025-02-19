package main;
/**
 *
 * @author masar
 */
public class Perro extends Mascota{
    protected String raza;
    protected double peso;
    protected String size;
    
    public Perro(String nombre, int edad, PropietarioMascota amo,String code,String raza,double peso,String size){
        super(nombre,edad,amo,code);
        this.raza=raza;
        this.peso=peso;
        this.size=size;
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
                + ""+amo+" codigo de mascota: "+code;
    }
    
    
}