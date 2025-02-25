//*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
//*)Arreglar los toString de los animales (perro,gato,pajaro) - lo del amo
//*)Asociar el animal con su dueño
//*)Arreglar AeroBikes
//*)toString de Mascota
//Arreglar que cada nuevo intento se limpien las variables
package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Vector;
public class IA_EVA {

    //MÓDULO EN PRUEBAS !!!
    public static void metodo_toString(Vector ejemplo){
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
            if (objeto instanceof Pajaro) {
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof Perro) {
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof Gato) {
                System.out.println(ejemplo.get(i).toString());
            }
        }        
    }
    
    public static void main(String[] args) {
        boolean salida=false;
        do {
            boolean check_automatico = Config.comprobar_directorio(Text.directorio_files);
            System.out.println(Text.menu_seleccion_inicio);
            String seleccion = Text.intro.nextLine();
            
            switch (seleccion) {
                case "1": IA_BOB.calculadorSeleccion();
                               break;
                case "2": if(check_automatico){
                        IA_ALONSO.calculadorAutomatico();
                    } else {System.out.println(Text.error_seleccion+" directorio no ajustado");}
                    break;
                case "3": Config.config();
                    break;
                case "4": salida=true;
                    break;
                default: System.out.println(Text.error_seleccion);
                    break;
            }
        } while (salida!=true);
        
        System.out.println(Text.cierre_sesion);
    }
    
}
