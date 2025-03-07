package vehiculos;
/**
 *
 * @author Ana
 */
import personas.Persona;
import utils.Text;
public class AeroCar extends Vehiculo {

    private int numMarchas;
    private String modelo;
    private double estado_deposito;
    private  Persona[] personas= new Persona[4]; //capacidad fija
    private static final double capacidadCarburante=50;

    public AeroCar(Persona[] personas) { //Arreglar turboJets
        super(TurboJet.creadorMotor(false));
        this.personas = personas;
        this.numMarchas = 6; //ejemplo
        this.modelo = "Nissan"; //ejemplo
        this.estado_deposito=50; //deposito lleno
    }

    //Atributo - Persona (gente dentro del vehículo)
    public Persona[] getPersonas(){
        return this.personas;
    }
    
    //Atributo - Num Marchas 
    public int getNumMarchas() {
        return numMarchas;
    }

    //Atributo - Marca del vehículo
    public String getModelo() {
        return modelo;
    }

    //Atributo - Deposito
    public double getDeposito(){
        return this.estado_deposito;
    }
    public void llenarDeposito(double gasolina){
        if((gasolina+estado_deposito)<=capacidadCarburante){
            this.estado_deposito+=gasolina;
            System.out.println(Text.deposito_lleno);
        } else {
            System.out.println(Text.demasiada_gasolina +capacidadCarburante+
                    Text.str_estado_deposito +estado_deposito+Text.gasolina_falta+(capacidadCarburante-estado_deposito));
        }
    }
    
    //ARREGLAR
    @Override
    public String toString() {
        String texto=Text.guiones +Text.car+this.codigo+Text.marca+this.modelo +
                Text.tripulantes+
                "\n"+this.personas[0].getNombre() +" "+ this.personas[0].getApellidos()+
                "\n"+this.personas[1].getNombre() +" "+ this.personas[1].getApellidos()+
                "\n"+this.personas[2].getNombre() +" "+ this.personas[2].getApellidos()+
                "\n"+this.personas[3].getNombre() +" "+ this.personas[3].getApellidos();
        return texto;
    }

}