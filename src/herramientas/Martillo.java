package herramientas;

import java.io.Serializable;
import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Martillo extends Herramienta implements Serializable{
    //Atributos
    public int consumo;
    public String sujecion;

    //Constructores
    private Martillo() {
        super(Codigo.generarHerramienta());
        this.consumo = randomConsumo();
        this.sujecion = randomSujecion();
    }

    //Metodo static crear objeto
    public static Martillo crear() {
        Martillo martillo = new Martillo();
        return martillo;
    }

    //Metodos Getter
    public int getConsumo() {
        return consumo;
    }

    public String getSujecion() {
        return sujecion;
    }

    //Para dar un valor aleatorio a consumo y sujecion
    public int randomConsumo() {
        consumo = (int) ((Math.random() * 300) + 200); //Tiene que estar entre 200 y 300
        return consumo;
    }

    public String randomSujecion() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            sujecion = Text.sujecion_manual;
        } else {
            sujecion = Text.sujecion_correa;
        }
        return sujecion;
    }

    //Para introducir manualmente los valores
    public void setConsumo(int consumo) {
        if (consumo >= 200 && consumo <= 300) {
            this.consumo = consumo;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setSujecion(String sujecion) {
        if (sujecion.toLowerCase().equals(Text.sujecion_manual) || sujecion.toLowerCase().equals(Text.sujecion_correa)) {
            this.sujecion = sujecion;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public static void modificar(Herramienta item){
        Martillo martillo= (Martillo) item;
        System.out.println(martillo.toString());
        System.out.println("Qué atributo quieres modificar?");
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println("El código no se puede cambiar");
            case"2"-> martillo.setProteccion(); //Modificar para entrada de valores
            case"3"-> martillo.setConsumo(0); //Modificar para entrada de valores
            case"4"-> martillo.setSujecion(posicion); //Modificar para entrada de valores
            default->System.out.println("Opcion no disponible");
        }
    }
    
    //toString
    @Override
    public String toString(){
        String texto="Martillo \n1.Codigo: "+super.codigo+"\n2.Protección: "+super.proteccion+
                "\n3.Consumo: "+this.consumo+"\n4.Sujección: "+this.sujecion;
        return texto;
    }
}
/*
public static void modificar(Herramienta item){
        Martillo martillo= (Martillo) item;
        System.out.println(martillo.toString());
        System.out.println(Text.modificar_atributo);
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println("El código no se puede cambiar");
            case"2"-> martillo.setProteccion(); //Modificar para entrada de valores
            case"3"-> martillo.setConsumo(0); //Modificar para entrada de valores
            case"4"-> martillo.setSujecion(posicion); //Modificar para entrada de valores
            default->System.out.println(Text.error_seleccion);
        }
    }

   public String toString(){
        String texto= Text.martillo +" \n1." + Text.str_codigo+": "+super.codigo+"\n2."+Text.proteccion+": "+super.proteccion+"\n3."+Text.consumo+": "+this.consumo+"\n4."+Text.sujecion+": "+this.sujecion;
        return texto;
    }
*/
