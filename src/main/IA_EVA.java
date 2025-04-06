package main;
/**
 *
 * @author SKTelecom
 */
import java.util.Vector;
import utils.Text;
import personas.*;
import aliens.*;
import mascotas.*;
import utils.Idiomas;
import utils.LectorTxt;
import utils.Sumatorio;
import vehiculos.*;

public class IA_EVA {
    public static boolean check_automatico = false;

    //MAIN
    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println(Text.menu_seleccion_inicio);
            String seleccion = Text.intro.nextLine();

            switch (seleccion) {
                case "1":
                   
                    if (check_automatico ) {
                        reset();
                        IA_BOB.calculadorSeleccion();
                    } else {
                        System.out.println(Text.error_seleccion + Text.error_dir_no_ajustado);
                    }
                    break;
                case "2":
                    if (check_automatico) {
                        reset();
                        IA_ALONSO.calculadorAutomatico();
                    } else {
                        System.out.println(Text.error_seleccion + Text.error_dir_no_ajustado);
                    }
                    break;
                case "3":
                    config();
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

    public static void config(){
        boolean salida=false;
        do {
            System.out.println(Text.menu_ajustes);
            String seleccion = Text.intro.nextLine();
            switch (seleccion){
                case "1" -> LectorTxt.change_directory();
                case "2" -> Idiomas.cambiar_idioma();
                case "3" -> Sumatorio.menuFactura();
                case "4" -> salida=true;
                case "5" -> System.out.println(Text.directorio_files); //Saber en que directorio está situado
                default -> System.out.println(Text.error_seleccion);
            }
        } while (salida!=true);
    }   
    
    //Metodo de reseteo de variables
    public static void reset (){
        utils.Text.listVehiculo.clear();
        utils.Text.listPersona.clear();
        utils.Text.listAlien.clear();
        utils.Text.listVehiculo.clear();
        utils.Text.listMascota.clear();
        utils.Text.mascota_dueño.clear();
        utils.Text.num_soldados=0;
        utils.Text.num_mineros=0;
        utils.Text.motos=0;
        utils.Text.coches=0;
        utils.Text.distancia=0;
    }
    
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
            if (objeto instanceof AeroCar) {
                System.out.println(ejemplo.get(i).toString());
            }
            if (objeto instanceof AeroBike) {
                System.out.println(ejemplo.get(i).toString());
            }
        }
    }
}