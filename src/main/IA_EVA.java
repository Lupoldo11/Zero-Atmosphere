//*) Genera los 4 principales tripulantes (Carmen, Laura, Lopez, federico) , la nave principal, la nave objetivo
//*)Arreglar los toString de los animales (perro,gato,pajaro) - lo del amo
//Arreglar que cada nuevo intento se limpien las variables
package main;

/**
 *
 * @author SKTelecom
 */
import java.util.Vector;
import utils.Text;
import utils.Config;
import personas.*;
import aliens.*;
import mascotas.*;

public class IA_EVA {

    //MÓDULO EN PRUEBAS !!!
    public static void metodo_toString(Vector ejemplo) {
        for (int i = 0; i < ejemplo.size(); i++) {
            Object objeto = ejemplo.get(i);
            if (objeto instanceof Soldado) {
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

    public static boolean check_automatico = false;

    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println(Text.menu_seleccion_inicio);
            String seleccion = Text.intro.nextLine();

            switch (seleccion) {
                case "1":
                    if (check_automatico) {
                        utils.Resetea.reset();
                        IA_BOB.calculadorSeleccion();
                    } else {
                        System.out.println(Text.error_seleccion + Text.error_dir_no_ajustado);
                    }
                    break;
                case "2":
                    if (check_automatico) {
                        utils.Resetea.reset();
                        IA_ALONSO.calculadorAutomatico();
                    } else {
                        System.out.println(Text.error_seleccion + Text.error_dir_no_ajustado);
                    }
                    break;
                case "3":
                    Config.config();
                    break;
                case "4":
                    salida = true;
                    break;
                default:
                    System.out.println(Text.error_seleccion);
                    break;
            }
        } while (salida != true);
    }

}
