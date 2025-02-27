//OPCION DEL MENÚ QUE ES AUTOMÁTICA
package main;
/**
 *
 * @author Lupoldo
 */
public class IA_ALONSO {
            
    //Funcionamiento principal código (MAIN)
    public static void calculadorAutomatico(){
        
        //1)Num aliens (aleatorio)
        System.out.println(Text.guiones);
        System.out.println("Accion 1");
        int contador_Raiser, contador_Nomun, total_alien;
        
        contador_Raiser= (int) (Math.random() * 200) + 1; //Gaston funcion random (debe de modular)
        contador_Nomun= (int) (Math.random() * 200) + 1; //Gastor funcion random (debe de modular)
        total_alien = contador_Raiser + contador_Nomun;
        
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser);
        
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        System.out.println(Text.guiones);
        System.out.println("Accion 6");
        System.out.println("Listado de Alien: "+Text.listAlien.size() +"\nNúmero de Nomun: "+contador_Nomun + "\nNúmero de Raiser: "+contador_Raiser);
        
        //2)Distancia nave
        System.out.println(Text.guiones);
        System.out.println("Accion 2");
        System.out.print("¿Cual es la distancia hacia la otra nave?");
        Text.distancia = (int) (Math.random() * 200) + 1;//Añadir ramdon de distancia
        System.out.println("La distancia con la nave es de: "+Text.distancia+" año/luz. \nPor tanto es: "+Vehiculo.metodoTransmision(Text.distancia));
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println(Text.guiones);
        System.out.println("Accion 3 y 4");
        int num_soldados = total_alien*2;
        int num_mineros = total_alien;
        int total_personas= num_soldados + num_mineros;
        Persona.generadorPersona(total_personas,num_soldados);
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
