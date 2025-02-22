package main;
/**
 *
 * @author Lupoldo
 */
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
                case "1" -> nombreRango="General";
                case "2" -> nombreRango="Coronel";
                case "3" -> nombreRango="Capitán";
                case "4" -> nombreRango="Sargento";
                case "5" -> nombreRango="Tropa";
                default -> System.out.println(Text.error_seleccion);
        }
        return nombreRango;
    }
    
    @Override
    public String toString(){
        return Codigo.generarSoldado()+"\n"+super.texto_toString() + "\nTrabajo: Soldado"; 
    }
}
