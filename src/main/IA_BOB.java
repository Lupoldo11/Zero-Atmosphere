package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Vector;
public class IA_BOB {
    
    //Genera los aliens que y los añade a la array 
    public static void generadorAlien (int total_alien, int contador_Raiser){
        for (int i=0;i<total_alien;i++){
                    if (contador_Raiser!=0){
                        Alien ejemplo1 = new Raiser(1,"prueba","prueba","prueba",2);
                        Text.listAlien.add(ejemplo1);
                        contador_Raiser--;
                    } else {
                        Alien ejemplo2 = new Nomun(1,"prueba","prueba","prueba",2);
                        Text.listAlien.add(ejemplo2); 
                    }
        }
    }
    
    //Genera las personas y añade al array
    public static void generadorPersona (int total_humanos, int num_soldados){
        for (int i=0;i<total_humanos;i++){
                    if (num_soldados!=0){
                        Persona ejemplo1 = new Soldado("prueba","prueba",2,2,"prueba");
                        Text.listPersona.add(ejemplo1);
                        num_soldados--;
                    } else {
                        Persona ejemplo2 = new Minero("prueba","prueba",2,2);
                        Text.listPersona.add(ejemplo2); 
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
        System.out.println("Accion 1");
        int contador_Raiser, contador_Nomun, total_alien;
        total_alien = Text.intro.nextInt();
        Text.intro.nextLine();
        contador_Raiser= (int) (Math.random() * total_alien) + 1; //Gaston funcion random (debe de modular)
        contador_Nomun= total_alien-contador_Raiser; //Gastor funcion random (debe de modular)
        //enlaza a la funcion de generarAlien
        generadorAlien(total_alien,contador_Raiser);
        
        //2)Distancia nave
        System.out.println("Accion 2");
        System.out.print("¿Cual es la distancia hacia la otra nave?");
        double distancia = Text.intro.nextDouble();
        Text.intro.nextLine();
        System.out.println("La distancia con la nave es de: "+distancia+"año/luz");
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion ");
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 3 y 4");
        System.out.println("¿Cuántos soldados quieres?");
        int num_soldados = Text.intro.nextInt();
        System.out.println("¿Cuántos mineros quieres?");
        int num_mineros = Text.intro.nextInt();
        int total_personas= num_soldados + num_mineros;
        
        generadorPersona(total_personas,num_soldados);
        
        System.out.println("Tamaño lista: "+Text.listPersona.size());
        for(int i=0; i<Text.listPersona.size();i++){ //esto se puede cambiar por el modulo=> metodo_toString()
            Persona ejemplo = Text.listPersona.get(i);
            if (ejemplo instanceof Soldado){
                System.out.println(Text.listPersona.get(i).toString());
            }
            if (ejemplo instanceof Minero) {
                System.out.println(Text.listPersona.get(i).toString());
            }
        }
        
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        System.out.println("Accion 6");
        System.out.println("Listado de Alien: "+Text.listAlien.size() +"\nNúmero de Nomun: "+contador_Nomun + "\nNúmero de Raiser: "+contador_Raiser);
        
        //7)Vehiculos utilizados  (formula antia de empaquetamiento)
        System.out.println("Accion 7");
        
        //8) Coste Total Operación (formula ana)
        System.out.println("Accion 8");
        double coste_total=0; //Aquí va la función de ana del SUMATORIO
        System.out.println("El coste total del operativo es de: " + coste_total);
    }      
}
