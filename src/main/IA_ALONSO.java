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
        System.out.println("Accion 1");
        int contador_Raiser, contador_Nomun, total_alien;
        
        contador_Raiser= (int) (Math.random() * 200) + 1; //Gaston funcion random (debe de modular)
        contador_Nomun= (int) (Math.random() * 200) + 1; //Gastor funcion random (debe de modular)
        total_alien = contador_Raiser + contador_Nomun;
        
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser);
        
        //2)Distancia nave
        System.out.println("Accion 2");
        System.out.print("¿Cual es la distancia hacia la otra nave?");
        double distancia = (int) (Math.random() * 200) + 1;//Añadir ramdon de distancia
        System.out.println("La distancia con la nave es de: "+distancia+"año/luz; por tanto es: "+Vehiculo.metodoTransmision(distancia));
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion ");
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 3 y 4");
        int num_soldados = total_alien*2;
        int num_mineros = total_alien;
        int total_personas= num_soldados + num_mineros;
        
        Persona.generadorPersona(total_personas,num_soldados);
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 3");
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println("Accion 4");
        IA_EVA.metodo_toString(Text.listPersona);
        
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
}
