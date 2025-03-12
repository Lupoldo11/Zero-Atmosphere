//OPCION DEL MENÚ QUE ES AUTOMÁTICA
package main;
/**
 *
 * @author Lupoldo
 */

import utils.Text;
import utils.Sumatorio;
import aliens.Alien;
import personas.Persona;
import vehiculos.Vehiculo;

public class IA_ALONSO {
            
    //Funcionamiento principal código (MAIN)
    public static void calculadorAutomatico(){
        
        //1)Num aliens (aleatorio)
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 1");
        int contador_Raiser, contador_Nomun, total_alien;
        
        contador_Raiser= (int) (Math.random() * 200) + 1; //Gaston funcion random (debe de modular)
        contador_Nomun= (int) (Math.random() * 200) + 1; //Gastor funcion random (debe de modular)
        total_alien = contador_Raiser + contador_Nomun;
        
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser);
        
        //6)Lista de aliens por tipos encontrados (toString de funciones de arriba)
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 6");
        System.out.println(Text.listado_de+" Alien: "+Text.listAlien.size() + Text.numero_de+"\n Nomun: "+contador_Nomun + Text.numero_de+"\nRaiser: "+contador_Raiser);
        
        //2)Distancia nave
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 2");
        System.out.print(Text.pregunta_distancia);
        double distancia = (int) (Math.random() * 200) + 1;//Añadir ramdon de distancia
        System.out.println(Text.respuesta_distancia+Text.distancia+Text.anios_luz+Vehiculo.metodoTransmision(Text.distancia));
        
        //Días
        double dias_mision = (int) Math.floor(Text.distancia*3);
        System.out.println(Text.duracion_mision+dias_mision+Text.dias);
        
        //3)Lista soldados (nombres - toString) a intervenir (pedir a usuario)
        //4)Lista mineros (nombres - toString) a intervenir (pedir a usuario)
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 3 y 4");
        int num_soldados = total_alien*2;
        int num_mineros = total_alien;
        int total_personas= num_soldados + num_mineros;
        Persona.generadorPersona(total_personas,num_soldados);
        IA_EVA.metodo_toString(Text.listPersona);
        
        //7)Vehiculos utilizados  (formula antia de empaquetamiento)
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 7");
        utils.AsignacionVehiculo.selectorVehiculos(Text.listPersona.size(), Text.listPersona); //EN PROCESO
        
        //8) Coste Total Operación (formula ana)
        System.out.println(Text.guiones);
        System.out.println(Text.accion+" 8");
        System.out.println(Text.coste_mision+ Sumatorio.costeTotal());
    }
}