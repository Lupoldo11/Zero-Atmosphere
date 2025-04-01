package herramientas;

import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Ciberexcavadora extends Herramienta {

    //Atributos
    public int consumo;
    public String traccion;

    //Constructores
    private Ciberexcavadora() {
        super(Codigo.generarHerramienta());
        this.consumo = randomConsumo();
        this.traccion = randomTraccion();
    }

    //Metodo static crear objeto
    public static Ciberexcavadora crear() {
        Ciberexcavadora excavadora = new Ciberexcavadora();
        return excavadora;
    }

    //Metodo Getter
    public int getConsumo() {
        return consumo;
    }

    public String getTraccion() {
        return traccion;
    }

    //Para dar un valor aleatorio a consumo y traccion
    public int randomConsumo() {
        consumo = (int) ((Math.random() * 5) + 1); //Tiene que estar entre 1 y 5
        return consumo;
    }

    public String randomTraccion() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            traccion = Text.traccion_oruga;
        } else {
            traccion = Text.traccion_ruedas;
        }
        return traccion;
    }

    //Para introducir manualmente los valores
    public void setConsumo() {
        System.out.println("Cuanto consumo va a tener?");
        int consum = Text.intro.nextInt();
        Text.intro.nextLine();
        
        if (consum >= 1 && consum <= 5) {
            this.consumo = consum;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setTraccion() {
        System.out.println("Tipo de tracción: 1)Oruga o 2)Rueda");
        String trac= Text.intro.nextLine();
        trac = trac.toLowerCase();
        
        switch(trac){
            case "oruga"->this.traccion= "oruga";
            case "ruedas"->this.traccion= "ruedas";
            default ->  System.out.println(Text.error_valor_invalido);
        }
    }

    public static void modificar(Herramienta item){
        Ciberexcavadora excavadora= (Ciberexcavadora) item;
        System.out.println(excavadora.toString());
        System.out.println("Qué atributo quieres modificar?");
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println("El código no se puede cambiar");
            case"2"-> excavadora.setProteccion(); //Modificar para entrada de valores
            case"3"-> excavadora.setConsumo(); //Modificar para entrada de valores
            case"4"-> excavadora.setTraccion(); //Modificar para entrada de valores
            default->System.out.println("Opcion no disponible");
        }
    }
    
    //toString
    @Override
    public String toString(){
        String texto="Ciberexcavadora \n1.Codigo: "+super.codigo+"\n2.Protección: "+super.proteccion+
                "\n3.Consumo: "+this.consumo+"\n4.Tracción: "+this.traccion;
        return texto;
    }
}
