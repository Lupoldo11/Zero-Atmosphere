package main;

/**
 *
 * @author Lupoldo
 */
import herramientas.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IA_GASTON {

    public static Scanner sc = new Scanner(System.in);

    //Listas para coger objetos
    public static ArrayList<Herramienta> listHerramientas = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;

        //Seleccion Menu
        do {
            System.out.println("1)Crear Herramienta \n2)Mostrar Herramienta \n3)Modificar Herramienta \n4)Salir");
            String seleccion = sc.nextLine();
            switch (seleccion) {
                case "1" ->
                    crear_herramienta();
                case "2" ->
                    mostrar_herramienta();
                case "3" ->
                    modificar_herramienta();
                case "4" ->{
                    utils.Binary_file.volcar_binarios();
                    utils.SQL.datos("volcar");
                    salir = true;
                }
                case "delete" ->{
                    System.out.println("(Opcion Oculta) Se van a borrar los registros de la Base de Datos");
                    utils.SQL.datos("borrar");
                }
                default ->
                    System.out.println("Opción no disponible");
            }
        } while (!salir);
    }

    public static void crear_herramienta() {
        System.out.println("1)Cibercompresor \n2)Ciberexcavadora \n3)Martillo \n4)Pala");
        String seleccion = sc.nextLine(); 

        switch (seleccion) {
            case "1" ->
                listHerramientas.add(herramientas.Cibercompresor.crear());
            case "2" ->
                listHerramientas.add(herramientas.Ciberexcavadora.crear());
            case "3" ->
                listHerramientas.add(herramientas.Martillo.crear());
            case "4" ->
                listHerramientas.add(herramientas.Pala.crear());
            default ->
                System.out.println("Opción no disponible");
        }
    }

    public static void mostrar_herramienta() {
        for (Herramienta item : listHerramientas) {
            if (item instanceof Pala) {
                System.out.println(item.toString());
            }
            if (item instanceof Cibercompresor) {
                System.out.println(item.toString());
            }
            if (item instanceof Ciberexcavadora) {
                System.out.println(item.toString());
            }
            if (item instanceof Martillo) {
                System.out.println(item.toString());
            }
        }
    }
    
    public static void modificar_herramienta(){
        Herramienta mod;
        System.out.println("1)Cibercompresor \n2)Ciberexcavadora \n3)Martillo \n4)Pala");
        String seleccion = sc.nextLine();

        switch (seleccion) {
            case "1" :
                mod= modificar_herramienta(1);
                herramientas.Cibercompresor.modificar(mod);
                break;
            case "2" :
                mod= modificar_herramienta(2);
                herramientas.Ciberexcavadora.modificar(mod);
                break;
            case "3" :
                mod= modificar_herramienta(3);
                herramientas.Martillo.modificar(mod);
                break;
            case "4" :
                mod=  modificar_herramienta(4);
                herramientas.Pala.modificar(mod);
                break;
            default :
                System.out.println("Opción no disponible");
                break;
        }
        //Selecciona la lista - lo pasa a un metodo con el indice para buscar el objeto
        //luego sale el toString y modificar la características que quieras
    }
    
    public static Herramienta modificar_herramienta(int seleccion){
        for (Herramienta item : listHerramientas) {
            if (item instanceof Cibercompresor && seleccion==1) {
                System.out.println(item.toString());
            }
            if (item instanceof Ciberexcavadora && seleccion==2) {
                System.out.println(item.toString());
            }
            if (item instanceof Martillo && seleccion==3) {
                System.out.println(item.toString());
            }
            if (item instanceof Pala && seleccion==4) {
                System.out.println(item.toString());
            }
        }
        System.out.println("Qué herramienta deseas modificar?");
        String codigo=sc.nextLine();
        for(Herramienta item:listHerramientas){
            if(item.codigo.equals(codigo)){ //llama al atributo codigo del objeto y lo comparamos
                return item;
            }
        }
        return null;
    }
}
