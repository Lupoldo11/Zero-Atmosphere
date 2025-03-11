package main;
/**
 *
 * @author Lupoldo
 */
import herramientas.Herramienta;
import java.util.ArrayList;
import java.util.Scanner;
public class IA_GASTON {

    public static Scanner sc = new Scanner(System.in);
    
    //Listas para coger objetos
    public static ArrayList<Herramienta> listPala = new ArrayList<>();
    public static ArrayList<Herramienta> listExcavador = new ArrayList<>();
    public static ArrayList<Herramienta> listMartillo = new ArrayList<>();
    public static ArrayList<Herramienta> listCompresor = new ArrayList<>();
    
    public static void main(String[] args) {
        boolean salir=false;
        
        //Seleccion Menu
        System.out.print("1)Crear Herramienta \n2)Mostrar Herramienta \n3)Generar Archivo Binario \n4)Salir");
        String seleccion=sc.nextLine();
        
        switch(seleccion){
            case "1"->crear_herramienta();
            case "2"->mostrar_herramienta();
            case "3"->utils.Binary_file.generar_archivo(); 
            case "4"->salir=true;
            default -> System.out.println("Opción no disponible");
        }
    }
    
    public static void crear_herramienta(){
        System.out.println("1)Cibercompresor \n2)Ciberexcavadora \n3)Martillo \n4)Pala");
        String seleccion=sc.nextLine();
        
        switch(seleccion){
            case "1"->listCompresor.add(herramientas.Cibercompresor.crear());
            case "2"->listExcavador.add(herramientas.Ciberexcavadora.crear());
            case "3"->listMartillo.add(herramientas.Martillo.crear());
            case "4"->listPala.add(herramientas.Pala.crear());
            default -> System.out.println("Opción no disponible");
        }
    }
    
    public static void mostrar_herramienta(){
        for(Herramienta item:listCompresor){
            System.out.print(item.toString());
        }
        for(Herramienta item:listExcavador){
            System.out.print(item.toString());
        }
        for(Herramienta item:listMartillo){
            System.out.print(item.toString());
        }
        for(Herramienta item:listPala){
            System.out.print(item.toString());
        }
    }
}
