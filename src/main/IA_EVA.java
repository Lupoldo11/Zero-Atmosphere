//*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
//IDEA: hacer un menu inicial: 1) Hace un escaner a la nave y genera todo automáticamente
//                                             2) Salta la IA_Bob y va pidiendo datos y genera el resultado
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
    
    //MÓDULO EN PRUEBAS !!!
    public static void metodo_toString(Vector ejemplo,Object ejemplo2){
        for(int i=0; i<ejemplo.size();i++){
            Object objeto = ejemplo.get(i);
            if (objeto instanceof Soldado){
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof Minero) {
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof Raiser) {
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof Nomun) {
                System.out.println(ejemplo.get(i).toString());
            }
        }        
    }
            
    //Funcionamiento principal código (MAIN)
    public static void calculador(){
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
        for(int i=0; i<listPersona.size();i++){ //esto se puede cambiar por el modulo=> metodo_toString()
            Persona ejemplo = listPersona.get(i);
            if (ejemplo instanceof Soldado){
                System.out.println(listPersona.get(i).toString());
            }
            if (ejemplo instanceof Minero) {
                System.out.println(listPersona.get(i).toString());
            }
        }
        
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        for(int i=0; i<listAlien.size();i++){//esto se puede cambiar por el modulo=> metodo_toString()
            Alien ejemplo = listAlien.get(i);
            if (ejemplo instanceof Raiser){
                System.out.println(listAlien.get(i).toString());
            }
            if (ejemplo instanceof Nomun) {
                System.out.println(listAlien.get(i).toString());
            }
        }
        
        //7)Vehiculos utilizados  (formula antia de empaquetamiento)
        
        
        //8) Coste Total Operación (formula ana)
        double coste_total=0; //Aquí va la función de ana del SUMATORIO
        System.out.println("El coste total del operativo es de: " + coste_total);
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
