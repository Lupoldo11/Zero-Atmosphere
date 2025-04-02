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
    public static ArrayList<Herramienta> listExcavador = new ArrayList<>();
    public static ArrayList<Herramienta> listMartillo = new ArrayList<>();
    public static ArrayList<Herramienta> listPala = new ArrayList<>();
    public static ArrayList<Herramienta> listCompresor = new ArrayList<>();
    //4 filas. 1)Excavadoras, 2)Martillos 3)Palas 4)Compresores
    public static ArrayList<ArrayList<Herramienta>> matrizHerramientas = new ArrayList<ArrayList<Herramienta>>(); 
    

    public static void inicializar_matriz() {
        for (int i = 0; i < 5; i++) {
            matrizHerramientas.add(new ArrayList());
        }
    }

    public static void main(String[] args) {

        inicializar_matriz();

        boolean salir = false;

        //Seleccion Menu
        do {
            System.out.println("1)Crear Herramienta \n2)Mostrar Herramienta \n3)Generar Archivo Binario \n4)Modificar Herramienta \n5)Actualizar Binario \n6)Salir");
            String seleccion = sc.nextLine();
            switch (seleccion) {
                case "1" ->
                    crear_herramienta();
                case "2" ->
                    mostrar_herramienta();
                case "3" ->
                    utils.Binary_file.llenar_binarios();
                case "4" ->
                    modificar_herramienta();
                case "5" ->
                    utils.Binary_file.volcar_binarios();
                case "6" ->
                    salir = true;
                default ->
                    System.out.println("Opcion no disponible");
            }
        } while (!salir);
    }

    public static void crear_herramienta() {
        System.out.println("1)Ciberexcavadora \n2)Martilloa \n3)Pala \n4)Cibercompresor");
        String seleccion = sc.nextLine();

        switch (seleccion) {
            case "1" ->
                listExcavador.add(herramientas.Ciberexcavadora.crear());
            case "2" ->
                listMartillo.add(herramientas.Martillo.crear());
            case "3" ->
                listPala.add(herramientas.Pala.crear());
            case "4" ->
                listCompresor.add(herramientas.Cibercompresor.crear());
            default ->
                System.out.println("Opcion no disponible");
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

    public static void modificar_herramienta() {
        Herramienta mod;
        System.out.println("1)Ciberexcavadora \n2)Martilloa \n3)Pala \n4)Cibercompresor");
        String seleccion = sc.nextLine();

        switch (seleccion) {
            case "1":
                mod = modificar_herramienta(listExcavador);
                herramientas.Ciberexcavadora.modificar(mod);
                break;
            case "2":
                mod = modificar_herramienta(listMartillo);
                herramientas.Martillo.modificar(mod);
                break;
            case "3":
                mod = modificar_herramienta(listPala);
                herramientas.Pala.modificar(mod); 
                break;
            case "4":
                mod = modificar_herramienta(listCompresor);
                herramientas.Cibercompresor.modificar(mod);
                break;
            default:
                System.out.println("Opcion no disponible");
                break;
        }
        //Selecciona la lista - lo pasa a un metodo con el indice para buscar el objeto
        //luego sale el toString y modificar la características que quieras
    }

    public static Herramienta modificar_herramienta(ArrayList<Herramienta> list) {
        for (Herramienta item : list) {
            System.out.println(item.toString());
        }
        System.out.println("Que herramienta deseas modificar?");
        String codigo = sc.nextLine();
        for (Herramienta item : list) {
            if (item.codigo.equals(codigo)) { //llama al atributo codigo del objeto y lo comparamos
                return item;
            }
        }
        return null;
    }

}
