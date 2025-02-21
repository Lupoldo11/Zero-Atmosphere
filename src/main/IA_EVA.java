//*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
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
        }        
    }
    
    public static void main(String[] args) {
        boolean salida=false;
        do {
            System.out.println(Text.menu_seleccion_inicio);
            String seleccion = Text.intro.next();
            
            switch (seleccion) {
                case "1" -> IA_BOB.calculadorSeleccion();
                case "2" -> IA_ALONSO.calculadorAutomatico();
                case "3" -> salida=true;
                default -> System.out.println(Text.error_seleccion);
            }
        } while (salida!=true);
        
        System.out.println(Text.error_seleccion);
    }
    
}
