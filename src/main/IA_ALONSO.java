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
    public static void calculadorAutomatico(){ //OPCION DEL MENÚ QUE ES AUTOMÁTICA
        
        //1)Num aliens (aleatorio)
        System.out.println(Text.guiones);
        int contador_Raiser, contador_Nomun, total_alien;
        
        contador_Raiser= (int) (Math.random() * 200) + 1; 
        contador_Nomun= (int) (Math.random() * 200) + 1; 
        total_alien = contador_Raiser + contador_Nomun;
        
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser);
        
        //2)Lista de aliens por tipos encontrados
        System.out.println(Text.guiones);
        System.out.println(Text.listado_de+" Alien: "+Text.listAlien.size() + Text.numero_de+"\n Nomun: "+contador_Nomun + Text.numero_de+"\nRaiser: "+contador_Raiser);
        
        //3)Distancia nave
        System.out.println(Text.guiones);
        System.out.print(Text.pregunta_distancia);
        Text.distancia = (int) (Math.random() * 200) + 1; //Añadir ramdon de distancia
        System.out.println(Text.respuesta_distancia+Text.distancia+Text.anios_luz+Vehiculo.metodoTransmision(Text.distancia));
        
        //Días
        double dias_mision = (int) Math.floor(Text.distancia*3);
        System.out.println(Text.duracion_mision+dias_mision+Text.dias);
        
        //3)Lista soldados y mineros
        System.out.println(Text.guiones);
        int num_soldados = total_alien*2;
        int num_mineros = total_alien;
        int total_personas= num_soldados + num_mineros;
        Persona.generadorPersona(total_personas,num_soldados);
        IA_EVA.metodo_toString(Text.listPersona);
        
        //7)Vehiculos utilizados 
        System.out.println(Text.guiones);
        utils.AsignacionVehiculo.selectorVehiculos(Text.listPersona.size(), Text.listPersona); //EN PROCESO
        IA_EVA.metodo_toString(Text.listVehiculo);
        
        //8) Coste Total Operación 
        System.out.println(Text.guiones);
        System.out.println(Text.coste_mision+ Sumatorio.costeTotal());
    }
}