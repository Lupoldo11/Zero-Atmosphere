package main;

public class Soldado extends Persona{
    //Atributos
    private String rango;
    
    //Constructor
    public Soldado(String nombre, String apellidos, int edad, double peso, String rango) {
        super(nombre, apellidos, edad);
        this.rango= nivelRango(rango);
    }
    //Metodos
    private static String nivelRango(String rango){
        String nombreRango=null;
        do {
            switch (rango) {
                case "1": 
                    nombreRango="General";
                    break;
                case "2": 
                    nombreRango="Coronel";
                    break;
                case "3": 
                    nombreRango="Capitán";
                    break;
                case "4": 
                    nombreRango="Sargento";
                    break;
                case "5": 
                    nombreRango="Tropa";
                    break;
                default: 
                    System.out.println("Rango no disponible");
                    break;
            }
        } while (nombreRango==null);
        return nombreRango;
    }
    
//    @Override
//    public String toString(){
//        return Codigo.generarSoldado()+"\n"+super.texto_toString() + "\nTrabajo: Soldado"; 
//    }
}