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

    //Cargar contenido String español
    static Properties propsEsp = new Properties(); //Crear properties
    
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

    public static void cargarEspanol() {
        System.out.println("Idioma cambiado a Espanol");
        
        menu_seleccion_inicio = propsEsp.getProperty("menu_seleccion_inicio");
        error_seleccion = propsEsp.getProperty("error_seleccion");
        cierre_sesion = propsEsp.getProperty("cierre_sesion");
        menu_ajustes = propsEsp.getProperty("menu_ajustes");
    }
    //Cargar contenido String ingles
    static Properties propsEng = new Properties(); //Crear properties

    public static void cargarEnglish() {

        System.out.println("Language changed to English");
        menu_seleccion_inicio = propsEng.getProperty("menu_seleccion_inicio");
        error_seleccion = propsEng.getProperty("error_seleccion");
        cierre_sesion = propsEng.getProperty("cierre_sesion");
        menu_ajustes = propsEng.getProperty("menu_ajustes");
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
