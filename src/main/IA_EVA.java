//*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
//IDEA: hacer un menu inicial: 1) Hace un escaner a la nave y genera todo automáticamente
//                                             2) Salta la IA_Bob y va pidiendo datos y genera el resultado
package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Vector;
public class IA_EVA {
    
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
        System.out.println("Opciones de escaner: \n1) Escaner automático \n2) IA_Bob");
        String seleccion_num_alien = Text.intro.next();
        int contador_Raiser=0, contador_Nomun=0, total_alien=0;

        switch (seleccion_num_alien) {
            case "1" -> {
                contador_Raiser= (int) (Math.random() * 200) + 1; //Gaston funcion random (debe de modular)
                contador_Nomun= (int) (Math.random() * 200) + 1; //Gastor funcion random (debe de modular)
                total_alien = contador_Raiser + contador_Nomun;
            }
            case "2" -> {
                total_alien = Text.intro.nextInt();
                Text.intro.nextLine();
                contador_Raiser= (int) (Math.random() * total_alien) + 1; //Gaston funcion random (debe de modular)
                contador_Nomun= (int) (Math.random() * total_alien) + 1; //Gastor funcion random (debe de modular)
            }
            default -> System.out.println(Text.error_seleccion);
        }
        //enlaza a la funcion de generarAlien
        generadorAlien(total_alien,contador_Raiser);
        
        //2)Distancia nave
        System.out.println("Accion 2");
        System.out.print("¿Cual es la distancia hacia la otra nave?");
        double distancia = Text.intro.nextDouble();
        Text.intro.nextLine();
        System.out.println("La distancia con la nave es de: "+distancia+"año/luz");
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 3");
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 4");
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
        for(int i=0; i<Text.listAlien.size();i++){//esto se puede cambiar por el modulo=> metodo_toString()
            Alien ejemplo = Text.listAlien.get(i);
            if (ejemplo instanceof Raiser){
                System.out.println(Text.listAlien.get(i).toString());
            }
            if (ejemplo instanceof Nomun) {
                System.out.println(Text.listAlien.get(i).toString());
            }
        }
        
        //7)Vehiculos utilizados  (formula antia de empaquetamiento)
        System.out.println("Accion 7");
        
        //8) Coste Total Operación (formula ana)
        System.out.println("Accion 8");
        double coste_total=0; //Aquí va la función de ana del SUMATORIO
        System.out.println("El coste total del operativo es de: " + coste_total);
    }
    
    public static void main(String[] args) {
        boolean salida=false;
        do {
            System.out.println(Text.menu_seleccion_inicio);
            String seleccion = Text.intro.next();
            
            switch (seleccion) {
                case "1" -> calculador();
                case "2" -> salida=true;
                default -> System.out.println(Text.error_seleccion);
            }
        } while (salida!=true);
        
        System.out.println(Text.error_seleccion);
    }
    
}
