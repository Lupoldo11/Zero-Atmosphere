package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Scanner;
import java.util.Vector;
public class IA_EVA {

    public static Scanner intro = new Scanner(System.in);
    //Hacer coleccion de personas, aliens, vehículos, mascosas
    public static Vector<Persona> listPersona = new Vector<>();
    public static Vector<Alien> listAlien = new Vector<>();
    public static Vector<Vehiculo> listVehiculo = new Vector<>();
    public static Vector<Mascota> listMascota = new Vector<>();
    
    public static void generadorAlien (){}
    //Funcionamiento principal código
    public static void calculador(){
        //*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
        //1)Num aliens (puede ser aleatorio o seleccion)
        String seleccion_num_alien = intro.next();
        switch (seleccion_num_alien) {
            case "1":
                //funcion num aleatorio
                //enlaza a la funcion de generarAlien
                break;
            case "2":
                int num_alien = intro.nextInt();
                intro.nextLine();
                int contador_Raiser=; //Gaston funcion random
                int contador_Nomun=; //Gastor funcion random
                for (int i=0; i<num_alien; i++) {
                    if (contador_Raiser!=0){
                        listAlien.add(i) = new Raiser();
                    } else {
                        listAlien.add(i) = new Nomun();
                    }
                }
                break;
            default:
                System.out.println("Opción no disponible");
                break;
        }
        
        //2)Distancia nave
        double distancia = intro.nextDouble();
        intro.nextLine();
        
        //3)Lista soldados (nombres - toString) a intervenir
        //4)Lista mineros (nombres - toString) a intervenir
        //5)Lista mecanico (nombres - toString) a intervenir
        //6)Lista de aliens por tipos encontrados
        //7)Vehiculos utilizados 
        //8) Coste Total Operación
    }
    
    public static void main(String[] args) {
        boolean salida=false;

        do {
            String seleccion = intro.next();
            
            switch (seleccion) {
                case "1": 
                    calculador();
                    break;
                case "2": 
                    salida=true;
                    break;
                default: 
                    System.out.println("Opción no disponible");
                    break;
            }
        } while (salida==true);
        
        System.out.println("Cerrando Sesión");
    }
    
}
