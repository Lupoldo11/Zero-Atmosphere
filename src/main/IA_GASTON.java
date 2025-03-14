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
        boolean salir = false;

        //Seleccion Menu
        do {
            System.out.println("1)Crear Herramienta \n2)Mostrar Herramienta \n3)Generar Archivo Binario \n4)Modificar Herramienta \n5)Salir");
            String seleccion = sc.nextLine();
            switch (seleccion) {
                case "1" ->
                    crear_herramienta();
                case "2" ->
                    mostrar_herramienta();
                case "3" ->
                    utils.Binary_file.generar_archivo();
                case "4" ->
                    modificar_herramienta();
                case "5" ->
                    salir = true;
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
                listCompresor.add(herramientas.Cibercompresor.crear());
            case "2" ->
                listExcavador.add(herramientas.Ciberexcavadora.crear());
            case "3" ->
                listMartillo.add(herramientas.Martillo.crear());
            case "4" ->
                listPala.add(herramientas.Pala.crear());
            default ->
                System.out.println("Opción no disponible");
        }
    }

    public static void mostrar_herramienta() {
        for (Herramienta item : listCompresor) {
            System.out.println(item.toString());
        }
        for (Herramienta item : listExcavador) {
            System.out.println(item.toString());
        }
        for (Herramienta item : listMartillo) {
            System.out.println(item.toString());
        }
        for (Herramienta item : listPala) {
            System.out.println(item.toString());
        }
    }
    
    public static void modificar_herramienta(){
        Herramienta mod;
        System.out.println("1)Cibercompresor \n2)Ciberexcavadora \n3)Martillo \n4)Pala");
        String seleccion = sc.nextLine();

        switch (seleccion) {
            case "1" :
                mod= modificar_herramienta(listCompresor);
                herramientas.Cibercompresor.modificar(mod);
                break;
            case "2" :
                mod= modificar_herramienta(listExcavador);
                herramientas.Ciberexcavadora.modificar(mod);
                break;
            case "3" :
                mod= modificar_herramienta(listMartillo);
                herramientas.Martillo.modificar(mod);
                break;
            case "4" :
                mod=  modificar_herramienta(listPala);
                herramientas.Pala.modificar(mod);
                break;
            default :
                System.out.println("Opción no disponible");
                break;
        }
        //Selecciona la lista - lo pasa a un metodo con el indice para buscar el objeto
        //luego sale el toString y modificar la características que quieras
    }
    
    public static Herramienta modificar_herramienta(ArrayList<Herramienta> list){
        for (Herramienta item : list) {
            System.out.println(item.toString());
        }
        System.out.println("Qué herramienta deseas modificar?");
        String codigo=sc.nextLine();
        for(Herramienta item:list){
            if(item.codigo.equals(codigo)){ //llama al atributo codigo del objeto y lo comparamos
                return item;
            }
        }
        return null;
    }
}
