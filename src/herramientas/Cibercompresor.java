package herramientas;

import java.io.Serializable;
import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Cibercompresor extends Herramienta implements Serializable{

    //Atributos
    public int consumo;
    public String traccion;

    //Constructores
    private Cibercompresor() {
        super(Codigo.generarHerramienta());
        this.consumo = randomConsumo();
        this.traccion = randomTraccion();
    }

    //Metodo static crear objeto
    public static Cibercompresor crear() {
        Cibercompresor compresor = new Cibercompresor();
        return compresor;
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
        System.out.println("Tipo de tracción: 1)Oruga o 2)Ruedas");
        String trac= Text.intro.nextLine();
        trac = trac.toLowerCase();
        
        switch(trac){
            case "oruga"->this.traccion= "oruga";
            case "ruedas"->this.traccion= "ruedas";
            default ->  System.out.println(Text.error_valor_invalido);
        }
    }

    public static void modificar(Herramienta item){
        Cibercompresor compresor= (Cibercompresor) item;
        System.out.println(compresor.toString());
        System.out.println("Qué atributo quieres modificar?");
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println("El código no se puede cambiar");
            case"2"-> compresor.setProteccion(); //Modificar para entrada de valores
            case"3"-> compresor.setConsumo(); //Modificar para entrada de valores
            case"4"-> compresor.setTraccion(); //Modificar para entrada de valores
            default->System.out.println("Opcion no disponible");
        }
    }
    
    //toString
    @Override
    public String toString(){
        String texto="Cibercompresor \n1.Codigo: "+super.codigo+"\n2.Protección: "+super.proteccion+
                "\n3.Consumo: "+this.consumo+"\n4.Tracción: "+this.traccion;
        return texto;
    }
    
}
/*
public void setConsumo() {
        System.out.println(Text.pregunta_consumo);
        int consum = Text.intro.nextInt();
        Text.intro.nextLine();


public void setTraccion() {
        System.out.println(Text.menu_traccion);
        String trac= Text.intro.nextLine();
        trac = trac.toLowerCase();


public static void modificar(Herramienta item){
        Cibercompresor compresor= (Cibercompresor) item;
        System.out.println(compresor.toString());
        System.out.println(Text.modificar_atributo);
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println(Text.error_cambiar_codigo);
            case"2"-> compresor.setProteccion(); //Modificar para entrada de valores
            case"3"-> compresor.setConsumo(); //Modificar para entrada de valores
            case"4"-> compresor.setTraccion(); //Modificar para entrada de valores
            default->System.out.println(Text.error_seleccion);
        }
    }

    public String toString(){
        String texto= Text.compresor +" \n1." + Text.str_codigo+": "+super.codigo+"\n2."+Text.proteccion+": "+super.proteccion+"\n3."+Text.consumo+": "+this.consumo+"\n4."+Text.traccion+": "+this.traccion;
        return texto;
    }
*/