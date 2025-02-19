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
    
    //Genera los aliens que y los añade a la array 
    public static void generadorAlien (int total_alien, int contador_Raiser){
        for (int i=0;i<total_alien;i++){
                    if (contador_Raiser!=0){
                        Alien ejemplo1 = new Raiser(1,"prueba","prueba","prueba",2);
                        listAlien.add(ejemplo1); 
                    } else {
                        Alien ejemplo2 = new Nomun(1,"prueba","prueba","prueba",2);
                        listAlien.add(ejemplo2); 
                    }
        }
    }
    
    //Funcionamiento principal código (MAIN)
    public static void calculador(){
        //*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
        //1)Num aliens (puede ser aleatorio o seleccion)
        String seleccion_num_alien = intro.next();
        int contador_Raiser=0, contador_Nomun=0, total_alien=0;

        switch (seleccion_num_alien) {
            case "1":
                contador_Raiser= (int) (Math.random() * 200) + 1; //Gaston funcion random (debe de modular)
                contador_Nomun= (int) (Math.random() * 200) + 1; //Gastor funcion random (debe de modular)
                total_alien = contador_Raiser + contador_Nomun;
                break;
            case "2":
                total_alien = intro.nextInt();
                intro.nextLine();
                contador_Raiser= (int) (Math.random() * total_alien) + 1; //Gaston funcion random (debe de modular)
                contador_Nomun= (int) (Math.random() * total_alien) + 1; //Gastor funcion random (debe de modular)
                break;
            default:
                System.out.println("Opción no disponible");
                break;
        }
        //enlaza a la funcion de generarAlien
        generadorAlien(total_alien,contador_Raiser);
        
        //2)Distancia nave
        double distancia = intro.nextDouble();
        intro.nextLine();
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        //7)Vehiculos utilizados  (formula antia)
        //8) Coste Total Operación (formula ana)
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
