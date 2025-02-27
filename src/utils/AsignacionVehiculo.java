
package utils;

/**
 *
 * @author antia
 */
import java.util.*;

public class AsignacionVehiculo {

    
    public static ArrayList<String> lista() {
        ArrayList<String> listaPersona = new ArrayList<>();
        listaPersona.add("Belen Esteban");
        listaPersona.add("Alejandro");
        listaPersona.add("Antia");
        listaPersona.add("Gaston");
        listaPersona.add("Eva");
        listaPersona.add("Ana");
        listaPersona.add("Lopez");
        listaPersona.add("Carmen");
        listaPersona.add("Laura");
        listaPersona.add("Manuel");
        
        return listaPersona;
    }

    // Método para asignar vehículos a las personas
    public static int[] AsignacionVehiculo(int numero) {
        int coche = 2;      
        int moto = 0;       
        int restante = 0;   

        if (numero > 6) {   
            numero -= 6;    

           
            coche += numero / 4;   
            restante = numero % 4; 

            
            if (restante == 3) {
                moto += 2;
            } else if (restante > 0) {
                moto += 1; 
            }
        }

        return new int[]{coche, moto, restante}; 
    }

  
    public static ArrayList<String> asignarPersonasAVehiculos() {
        ArrayList<String> personas = lista(); 
        int numeroPersonas = personas.size(); 

       
        int[] vehiculos = AsignacionVehiculo(numeroPersonas);

        int coches = vehiculos[0];
        int motos = vehiculos[1];
        int restante = vehiculos[2];

        ArrayList<String> asignaciones = new ArrayList<>(); 

        int personaIndex = 0;

        
        for (int i = 0; i < coches; i++) {
            asignaciones.add("Coche " + (i + 1) + ":");
            

            int personasEnCoche = 4; 
            if (i == coches - 1) {
               
                personasEnCoche = Math.min(4, personas.size() - personaIndex);
            }

           
            for (int j = 0; j < personasEnCoche; j++) {
                if (personaIndex < personas.size()) {
                    asignaciones.add(" - " + personas.get(personaIndex));
                    personaIndex++;
                }
            }
        }

        
        for (int i = 0; i < motos; i++) {
            asignaciones.add("Moto " + (i + 1) + ":");
            
           
            int personasEnMoto = 2;  
            for (int j = 0; j < personasEnMoto; j++) {
                if (personaIndex < personas.size()) {
                    asignaciones.add(" - " + personas.get(personaIndex));
                    personaIndex++;
                }
            }
        }

        return asignaciones;
    }

    public static void main(String[] args) {
        ArrayList<String> resultado = asignarPersonasAVehiculos(); 
        Scanner sn=new Scanner(System.in);
        
        System.out.println("Cuantas personas van");
        int per=sn.nextInt();
        
        
       
        for (String asignacion : resultado) {
            System.out.println(asignacion);
        }
    }
}