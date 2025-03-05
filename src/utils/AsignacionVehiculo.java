package utils;
/**
 *
 * @author antia
 */
import java.util.Vector;
import personas.Persona;
import utils.Text;
import vehiculos.*;
public class AsignacionVehiculo {
    private static int motos=0,coches=0;
    public static Vector<Vehiculo> listVehiculo= new Vector <>();
    
    //Método para calcular vehículos
    public static int[] organizacion(int cantidad_personas){
        if (cantidad_personas > 6) {   
            cantidad_personas -= 6;    
            coches += cantidad_personas/ 4;  
            if (cantidad_personas % 4 == 3) {
                motos += 2;
            } else if (cantidad_personas % 4 > 0) {
                motos += 1; 
            }
        } else {
            coches=2;
            if (cantidad_personas-2==3){
                motos=2;
            } else {
                motos=1;
            }
        }
        //Salida resultado
        int[] result = {coches,motos};
        return result;
    }
  
    public static void selectorVehiculos(int cantidad_personas, Vector<Persona> listPersonas){
        int[] cantidad_vehiculos= utils.AsignacionVehiculo.organizacion(cantidad_personas);
        
        int contador=0;
        for (int aeroCars=cantidad_vehiculos[0]; aeroCars>0; aeroCars--) {
            //generar cada aeroCar con los 4 integrantes
            Persona[] grupo4= {listPersonas.get(contador),listPersonas.get(contador+1),listPersonas.get(contador+2),listPersonas.get(contador+3)};
            listVehiculo.add(new AeroCar(grupo4));
            contador+=4;
        }
        
        //Generar aeroBike si hay
        if (cantidad_vehiculos[1]>0){
            generarMotos(cantidad_personas,contador, listPersonas);
        }
        
        //Enviarlo a la clase Text 
        Text.listVehiculo= listVehiculo;
    }    
    
    public static void generarMotos(int cantidad_personas, int contador, Vector<Persona> listPersonas){ //ARREGLAR
        switch (cantidad_personas-contador) {
            case 3: //generar una aeroBike con 2 personas y aeroBike con 1 persona
                Persona[] grupo2_2= {listPersonas.get(-1),listPersonas.get(-2)};
                listVehiculo.add(new AeroBike(grupo2_2));
                Persona[] grupo1_2= {listPersonas.get(-3)};
                listVehiculo.add(new AeroBike(grupo1_2));
                break;
            case 2: //generar una aeroBike con 2 personas
                Persona[] grupo2= {listPersonas.get(-1),listPersonas.get(-2)};
                listVehiculo.add(new AeroBike(grupo2));
                break;
            case 1: //generar un aeroBike con 1 persona
                Persona[] grupo1= {listPersonas.get(-1)};
                listVehiculo.add(new AeroBike(grupo1));
                break;
        }
    }
}