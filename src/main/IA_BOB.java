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
    public static void calculadorSeleccion(){ //OPCION DEL MENÚ QUE ES SELECCIÓN
        
        //1)Num aliens (seleccion)
        System.out.println(Text.guiones);
        int contador_Raiser, contador_Nomun, total_alien;
        System.out.println(Text.pregunta_aliens);
        total_alien = Text.intro.nextInt(); Text.intro.nextLine(); //Preguntar cantidad de alien en la nave
        contador_Raiser= (int) (Math.random() * total_alien) + 1; 
        contador_Nomun= total_alien-contador_Raiser; 
        //enlaza a la funcion de generarAlien
        Alien.generadorAlien(total_alien,contador_Raiser); 
        
        //2)Lista de aliens por tipos encontrados
        System.out.println(Text.guiones);
        System.out.println(Text.listado_de+" Alien: "+Text.listAlien.size() +"\nNúmero de Nomun: "+contador_Nomun + "\nNúmero de Raiser: "+contador_Raiser);
        
        //3)Distancia nave
        System.out.println(Text.guiones);
        System.out.println(Text.pregunta_distancia);
        Text.distancia = Text.intro.nextDouble(); Text.intro.nextLine();
        System.out.println(Text.respuesta_distancia+Text.distancia+Text.anios_luz+Vehiculo.metodoTransmision(Text.distancia));
        
        //Días
        double dias_mision = (int) Math.floor(Text.distancia*3);
        System.out.println(Text.duracion_mision+dias_mision+Text.dias);
        
        //4)Lista mineros y soldados
        System.out.println(Text.guiones);
        System.out.println(Text.cuantos_soldados);
        Text.num_soldados = Text.intro.nextInt(); Text.intro.nextLine();
        System.out.println(Text.cuantos_mineros);
        Text.num_mineros = Text.intro.nextInt(); Text.intro.nextLine();
        int total_personas= Text.num_soldados + Text.num_mineros;
        Persona.generadorPersona(total_personas,Text.num_soldados); //Mascotas --> generan aleatorias
        
        //Muestra todos los tripulantes de la nave
        System.out.println(Text.guiones);
        System.out.println(Text.tamanio_lista+Text.listPersona.size());
        System.out.println(Text.guiones);
        IA_EVA.metodo_toString(Text.listPersona);
        
        //7)Vehiculos utilizados 
        System.out.println(Text.guiones);
        utils.AsignacionVehiculo.selectorVehiculos(Text.listPersona.size(), Text.listPersona); //EN PROGRASO
        IA_EVA.metodo_toString(Text.listVehiculo);
        
        //8) Coste Total Operación
        System.out.println(Text.guiones);
        System.out.println(Text.coste_mision + Sumatorio.costeTotal());
    }      
}