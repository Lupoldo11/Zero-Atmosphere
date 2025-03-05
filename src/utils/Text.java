package utils;

/**
 *
 * @author Lupoldo
 */
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.Properties;
import aliens.Alien;
import java.io.FileInputStream;
import java.io.InputStream;
import mascotas.Mascota;
import personas.Persona;
import vehiculos.Vehiculo;

public class Text {

    //Contenido String o textual (por defecto)
    public static String menu_seleccion_inicio = "Lista de opciones: \n1) IA_Bob (Seleccionable) \n2) IA_Alonso (Automático) \n3) Ajustes \n4) Salir";
    public static String error_seleccion = "Opción no disponible";
    public static String cierre_sesion = "";
    public static String menu_ajustes = "1) Cambiar directorio \n2) Cambiar idioma \n3) Salir"; 
    public static String accion = "Accion";
    public static String listado_de = "Listado de";
    public static String numero_de = "Numero de";
    public static String pregunta_distancia = "¿Cual es la distancia hacia la otra nave?";
    public static String respuesta_distancia = "La distancia con la nave es de: ";
    public static String anios_luz = " año/luz. \nPor tanto es: ";
    public static String duracion_mision = "La misión durará ";
    public static String dias = " días";
    public static String coste_mision = "El coste total del operativo es de: " ;
    public static String intro_directorio = "Introduce directorio: ";
    public static String error_cambio_dir = "No se ha podido cambiar";
    public static String dir_no_existe = "Esta ruta no existe";
    public static String dir_enlazado = "Directorio enlazado y con el contenido requerido";
    public static String dir_no_archivos = "En este directorio no se encuentran todos archivos necesarios";
    public static String dir_no_ajustado = " directorio no ajustado";
    public static String menu_factura = "1.Ver factura en pantalla \n 2.Guardar factura\n 3.Salir";
    
    
 
    //Idiomas
    //Crear y cargar properties
    static Properties propsEng = new Properties(); //Crear propertie
    static Properties propsEsp = new Properties(); 
    
    public static void cargarProperties(){
        try (InputStream urlPropsEsp = new FileInputStream("src/utils/espanol.properties")) {
            propsEsp.load(urlPropsEsp);
            
        } catch (Exception e) {
            System.out.println("Error al cargar properties");
        }
        try (InputStream urlPropsEng = new FileInputStream("src/utils/english.properties")) {
            propsEng.load(urlPropsEng);
            
            System.out.println(cierre_sesion);

        } catch (Exception e) {
            System.out.println("Error al cargar properties");
        }
    }
    
    //Seleccionar properties
    public static void seleccion_properties(Properties props){
        menu_seleccion_inicio = props.getProperty("menu_seleccion_inicio");
        error_seleccion = props.getProperty("error_seleccion");
        cierre_sesion = props.getProperty("cierre_sesion");
        menu_ajustes = props.getProperty("menu_ajustes");
        intro_directorio = props.getProperty("intro_directorio");
        error_cambio_dir = props.getProperty("error_cambio_dir");
        dir_no_existe = props.getProperty("dir_no_existe");
        dir_enlazado = props.getProperty("dir_enlazado");
        dir_no_archivos = props.getProperty("dir_no_archivos");
        dir_no_ajustado = props.getProperty("dir_no_ajustado");
        menu_factura = props.getProperty("menu_factura");
    }
    
    //Menu cambio de idioma
    public static void cambiar_idioma() {
        cargarProperties();
        System.out.println("Elige un idioma:\n 1.Espanol\n 2.English");
        String seleccion = intro.nextLine();
        switch (seleccion) {
            case "1" -> {
                System.out.println("Idioma cambiado a Espanol");
                seleccion_properties(propsEsp);

            }
            case "2" -> {
                System.out.println("Language changed to English");
                seleccion_properties(propsEng);
            }
            default -> System.out.println(error_seleccion);
        }
    }
    
    //String para funciones
    public static String guiones = "-----------------------------------------------";
    public static String separador = "||||||||||||||||||||||||||||||||||||||||||||||||||||";
    public static String directorio_files = "C:\\Users\\Lupoldo\\Desktop\\Desarrollo Muti\\Programación\\Archivos programación\\ZeroAtmosphere\\src\\documentacion\\";
    protected static String[] files = new String[]{"Nombres.txt", "Apellidos.txt", "MascotaN.txt", "MascotaR.txt"};

    //Herramientas de introducción de datos
    public static Scanner intro = new Scanner(System.in);

    //Hacer coleccion de personas, aliens, vehículos, mascosas
    public static Vector<Persona> listPersona = new Vector<>();
    public static Vector<Alien> listAlien = new Vector<>();
    public static Vector<Vehiculo> listVehiculo = new Vector<>();
    public static Vector<Mascota> listMascota = new Vector<>();

    //Hacer lista de nombre, apellido, nombre_mascota, raza_mascota
    public static List<String> fileNombres;
    public static List<String> fileApellidos;
    public static List<String> fileMascotaN;
    public static List<String> fileMascotaR;

    //HashMap para asociacion mascota-dueño
    public static HashMap<String, String> mascota_dueño = new HashMap<>();

    //Variables usados en varias class
    public static int num_soldados, num_mineros;
    public static int motos, coches;
    public static double distancia;

    //LO GUARDO AQUí PORQUE NO SE DONDE PONERLO (Objeto Persona predefinidos)
    final Persona laura = new Persona("Laura", "Lopez Gomez", 20);
    final Persona carmen = new Persona("Carmen", "Lopez Arias", 59);
    final Persona federico = new Persona("Federico", "Lopez Lopez", 19);
    final Persona lopez = new Persona("Lopez", "Lopez Lopez", 63);
}
