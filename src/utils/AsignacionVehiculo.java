//ARREGLAR
package utils;

import java.util.Vector;
import personas.Persona;
import vehiculos.*;

public class AsignacionVehiculo {

    //Atributos
    private static int motos = 0, coches = 0;
    public static Vector<Vehiculo> listVehiculo = new Vector<>();

    public static void selectorVehiculos(int cantidad_personas, Vector<Persona> listPersonas) {
        coches = 0;
        motos = 0;
        int[] cantidad_vehiculos = utils.AsignacionVehiculo.organizacion(cantidad_personas);
        
        //Genera AeroCars
        int contador = generarCoches(cantidad_personas, listPersonas, cantidad_vehiculos);
        
        // Generar AeroBike 
        if (cantidad_vehiculos[1] > 0) {
            generarMotos(cantidad_personas, contador, listPersonas);
        }

        // Enviarlo a la clase Text
        Text.listVehiculo = listVehiculo;
    }
    
    // Método para calcular vehículos
    public static int[] organizacion(int cantidad_personas) { //CAMBIAR POR LO QUE HICE EN EL PC de GASTON
        if(cantidad_personas>=6){
            coches += (int) cantidad_personas/4;
            if(cantidad_personas %4 == 3) {
                motos += 2;
            } else if (cantidad_personas %4 >=1){
                motos +=1;
            }
        } else if(cantidad_personas > 0) {
            coches=2;
            cantidad_personas-=2;
            if (cantidad_personas >=3){
                motos=2;
            } else if (cantidad_personas >=1){
                motos=1;
            }
        }
        // Salida resultado
        int[] result = {coches, motos};
        return result;
    }

    public static int generarCoches(int cantidad_personas, Vector<Persona> listPersonas, int[] cantidad_vehiculos) {
        int contador = 0;
        if(cantidad_personas == 0) return contador;
        if (cantidad_personas < 6) {
            for (int i = 0; i < 2; i++) {
                Persona[] grupo = {listPersonas.get(contador)};
                listVehiculo.add(new AeroCar(grupo));
                contador += 1;
            }
            return contador;
        } else {
            for (int i = cantidad_vehiculos[0]; i > 0; i--) {
                // Generar cada AeroCar con los 4 integrantes
                Persona[] grupo4 = {listPersonas.get(contador), listPersonas.get(contador + 1), listPersonas.get(contador + 2), listPersonas.get(contador + 3)};
                listVehiculo.add(new AeroCar(grupo4));
                contador += 4;
            }
            return contador;
        }
    }

    public static void generarMotos(int cantidad_personas, int contador, Vector<Persona> listPersonas) {
        int personasRestantes = cantidad_personas - contador;

        switch (personasRestantes) {
            case 3: // Generar una AeroBike con 2 personas y otra con 1 persona
                Persona[] grupo2_2 = {listPersonas.get(contador), listPersonas.get(contador + 1)};
                listVehiculo.add(new AeroBike(grupo2_2));
                Persona[] grupo1_2 = {listPersonas.get(contador + 2)};
                listVehiculo.add(new AeroBike(grupo1_2));
                break;
            case 2: // Generar una AeroBike con 2 personas
                Persona[] grupo2 = {listPersonas.get(contador), listPersonas.get(contador + 1)};
                listVehiculo.add(new AeroBike(grupo2));
                break;
            case 1: // Generar una AeroBike con 1 persona
                Persona[] grupo1 = {listPersonas.get(contador)};
                listVehiculo.add(new AeroBike(grupo1));
                break;
        }
    }
}
