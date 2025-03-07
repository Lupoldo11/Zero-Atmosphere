package personas;
/**
 *
 * @author Lupoldo
 */

import utils.Codigo;
import utils.Text;

public class Soldado extends Persona{
    //Atributos
    private String rango;
    
    //Constructor
    public Soldado() {
        super(Codigo.generarSoldado());
        this.rango= generadorRango();
    }
    
    //Setter y Getter
    public String getRango(){
        return this.rango;
    }
    public void setRango(String cambio_rango){
        this.rango=cambio_rango;
    }
    
    //Metodo generadorRango [Auto-rellenable]
    private static String generadorRango(){
        String nombreRango=null;
        String rango = String.valueOf((int) (Math.random() * 5) + 1);
        switch (rango) {
                case "1" -> nombreRango=Text.rango_general;
                case "2" -> nombreRango=Text.rango_coronel;
                case "3" -> nombreRango=Text.rango_capitan;
                case "4" -> nombreRango=Text.rango_sargento;
                case "5" -> nombreRango=Text.rango_tropa;
                default -> System.out.println(Text.error_seleccion);
        }
        return nombreRango;
    }
    
    @Override
    public String toString(){
        return Text.str_soldado +Codigo.generarSoldado()+"\n"+super.texto_toString() + "\n"+Text.separador; 
    }
}