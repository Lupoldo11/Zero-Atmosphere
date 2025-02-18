package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Scanner;
public class IA_EVA {

    public static Scanner intro = new Scanner(System.in);
    //Hacer coleccion de personas, aliens, vehículos, mascosas
    
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
                //enlaza a la funcion de generarAlien
                break;
            default:break;
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
