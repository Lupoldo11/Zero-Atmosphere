//OPCION DEL MENÚ QUE ES SELECCIÓN
package main;
/**
 *
 * @author SKTelecom
 */

import utils.Text;
import utils.Sumatorio;
import aliens.Alien;
import personas.Persona;
import vehiculos.Vehiculo;

public class IA_BOB {
            
    //Funcionamiento principal código (MAIN)
    public static void calculadorSeleccion(){
        
        //1)Num aliens (seleccion)
        System.out.println(Text.guiones);
        System.out.println("Accion 1");
        int contador_Raiser, contador_Nomun, total_alien;
        System.out.println("¿Cuántos alienígenas hay en la nave ?");
        total_alien = Text.intro.nextInt(); //Preguntar cantidad de alien en la nave
        Text.intro.nextLine();
        contador_Raiser= (int) (Math.random() * total_alien) + 1; 
        contador_Nomun= total_alien-contador_Raiser; 
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser); 
        
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        System.out.println(Text.guiones);
        System.out.println("Accion 6");
        System.out.println("Listado de Alien: "+Text.listAlien.size() +"\nNúmero de Nomun: "+contador_Nomun + "\nNúmero de Raiser: "+contador_Raiser);
        
        //2)Distancia nave
        System.out.println(Text.guiones);
        System.out.println("Accion 2");
        System.out.println("¿Cual es la distancia hacia la otra nave?");
        double distancia = Text.intro.nextDouble();
        Text.intro.nextLine();
        System.out.println("La distancia con la nave es de: "+Text.distancia+" año/luz. \nPor tanto es: "+Vehiculo.metodoTransmision(Text.distancia));
        
        //Días
        double dias_mision = (int) Math.floor(Text.distancia*3);
        System.out.println(Text.duracion_mision+dias_mision+Text.dias);
        
        //4)Lista mineros y soldados (nombres - toString) a intervenir (pedir a usuario)
        System.out.println(Text.guiones);
        System.out.println("Accion 3 y 4");
        System.out.println("¿Cuántos soldados quieres?");
        int num_soldados = Text.intro.nextInt();
        System.out.println("¿Cuántos mineros quieres?");
        int num_mineros = Text.intro.nextInt();
        Text.intro.nextLine();
        int total_personas= Text.num_soldados + Text.num_mineros;
        Persona.generadorPersona(total_personas,Text.num_soldados); //las mascotas se generan aleatorias aquí
        
        //Muestra todos los tripulantes de la nave
        System.out.println(Text.guiones);
        System.out.println("Tamaño lista: "+Text.listPersona.size());
        System.out.println(Text.guiones);
        IA_EVA.metodo_toString(Text.listPersona);
        
        //7)Vehiculos utilizados  (formula antia de empaquetamiento)
        System.out.println(Text.guiones);
        System.out.println("Accion 7");
        
        //8) Coste Total Operación (formula ana)
        System.out.println(Text.guiones);
        System.out.println("Accion 8");
        System.out.println("El coste total del operativo es de: " + Sumatorio.costeTotal());
    }      
}