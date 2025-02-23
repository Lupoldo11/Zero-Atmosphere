package main;
/**
 *
 * @author Lupoldo
 */
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
public class Text {
    //Contenido String o textual
    protected static String guiones="-----------------------------------------------";
    protected static String separador="||||||||||||||||||||||||||||||||||||||||||||||||||||";
    protected static String menu_seleccion_inicio="Lista de opciones: \n1) IA_Bob (Seleccionable) \n2) IA_Alonso (Automático) \n3) Salir";
    protected static String error_seleccion="Opción no disponible";
    protected static String cierre_sesion="Cerrando sesión";
    
    protected static String directorio_files="C:\\Users\\Lupoldo\\Desktop\\Desarrollo Muti\\Programación\\Archivos programación\\ZeroAtmosphere\\src\\documentacion\\";
    protected static String[] files=new String[]{"Nombres.txt","Apellidos.txt","MascotaN.txt","MascotaR.txt"};
    
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
    
    //LO GUARDO AQUí PORQUE NO SE DONDE PONERLO (Objeto Persona predefinidos)
    final Persona laura = new Persona("Laura","Lopez Gomez",20);
    final Persona carmen = new Persona("Carmen","Lopez Arias",59);
    final Persona federico = new Persona("Federico","Lopez Lopez",19);
    final Persona lopez = new Persona("Lopez","Lopez Lopez",63);
}
