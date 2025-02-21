package main;

import java.util.Scanner;
import java.util.Vector;
public class Text {
    protected static String menu_seleccion_inicio="Lista de opciones: \n1) Calculadora \n2) Salir";
    protected static String error_seleccion="Opción no disponible";
    protected static String cierre_sesion="Cerrando sesión";
    
    
    //Herramientas en varias zonas
    public static Scanner intro = new Scanner(System.in);
    
    //Hacer coleccion de personas, aliens, vehículos, mascosas
    public static Vector<Persona> listPersona = new Vector<>();
    public static Vector<Alien> listAlien = new Vector<>();
    public static Vector<Vehiculo> listVehiculo = new Vector<>();
    public static Vector<Mascota> listMascota = new Vector<>();
    
    //LO GUARDO AQUí PORQUE NO SE DONDE PONERLO
    final Persona laura = new Persona("Laura","Lopez Gomez",18);
    final Persona carmen = new Persona("Carmen","Lopez Arias",19);
    final Persona federico = new Persona("Federico","Lopez Lopez",70);
    final Persona lopez = new Persona("Lopez","Lopez Lopez",63);
}