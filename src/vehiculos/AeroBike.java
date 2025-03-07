package vehiculos;
/**
 *
 * @author Ana
 */
import personas.Persona;
import utils.Text;
public class AeroBike extends Vehiculo {

    private int velocidadMax;
    private String color;
    private boolean arrancado;
    private Persona[] personas= new Persona[2]; //capacidad fija

    public AeroBike(Persona[] personas) { //Arreglar TurboJet
        super(TurboJet.creadorMotor(true));
        this.personas= personas;
        this.velocidadMax = 100; //ejemplo
    }

    //Atributo - Persona (gente dentro del vehículo)
    public Persona[] getPersonas(){
        return this.personas;
    }
    
    //Atributo - Velocidad Máxima
    public int getVelocidadMax() {
        return velocidadMax;
    }

    //Atributo Color vehículo
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Atributo Arrancado y apagado del vehiculo
    public boolean isArrancado() {
        return arrancado;
    }
    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    public void arrancar(){
        if (arrancado){
            System.out.println(Text.arranca);
        }
        else {
            System.out.println(Text.apagado);
        }
    }

    //ARREGLAR
    @Override
    public String toString() {
        String texto=Text.guiones +Text.bike+this.codigo+Text.str_color+this.color +
                Text.tripulantes +
                "\n"+this.personas[0].getNombre() +" "+ this.personas[0].getApellidos()+
                "\n"+this.personas[1].getNombre() +" "+ this.personas[1].getApellidos();
        return texto;
    }

}