package utils;

/**
 *
 * @author Ana
 */
import java.io.File;
import personas.Minero;
import static utils.LectorTxt.guardarFactura;
import vehiculos.*;

public class Sumatorio {

    //Manu factura
    public static void menuFactura() {
        System.out.println(Text.menu_factura);
        String seleccion = Text.intro.nextLine();
        boolean salir = false;
        switch (seleccion) {
            case "1":
                System.out.println(Sumatorio.imprimirFactura());
                break;
            case "2":
                boolean guardado = false;
                do {
                    System.out.println(Text.intro_directorio);
                    String dir = Text.intro.nextLine();
                    File directorio = new File(dir);
                    if (directorio.exists() && directorio.isDirectory()) {
                        guardarFactura(dir);
                        guardado = true;
                    } else {
                        System.out.println(Text.error_dir_no_existe);
                    }
                } while (guardado == false);
                break;
            case "3":
                salir = true;
                break;
            default:
                System.out.println(Text.error);
        }
    }

    //Sumas para la factura
    public static int sumarCostePersonas() {
        int costePersonas = 0;
        for (int i = 0; i < Text.listPersona.size(); i++) {
            if (Text.listPersona.get(i) instanceof Minero) {
                costePersonas += 20;
            } else {
                costePersonas += 22;
            }
        }
        return costePersonas;
    }

    public static int sumarCosteAliens() {
        int costeAliens = 0;
        for (int i = 0; i < Text.listAlien.size(); i++) {
            costeAliens += 4;
        }
        return costeAliens;
    }

    public static int sumarCosteVehiculos(double distancia) {
        int costeVehiculos = 0;
        for (int i = 0; i < Text.listVehiculo.size(); i++) {
            costeVehiculos += Text.listVehiculo.get(i).calculaCarburante(distancia);
        }
        return costeVehiculos;
    }

    public static int costeTotal() {
        return (sumarCostePersonas() + sumarCosteAliens() + sumarCosteVehiculos(2)) * 3;
    }

    //Impresion de factura
    public static String imprimirFactura() {
        int costeMineros = Text.num_mineros * 20;
        int costeSoldados = Text.num_soldados * 22;
        int costeCars = Text.coches + AeroCar.gastoCarburante;
        int costeBikes = Text.motos + AeroBike.gastoCarburante;

        String factura = "*********************************************************\n"
                + "*********************************************************\n"
                + Text.str_coste_mision
                + "*********************************************************\n"
                + Text.str_personas_coste
                + "_____________________________________________________________\n"
                + Text.coste_minero + +costeMineros + Text.yurs
                + Text.coste_soldado + costeSoldados + Text.yurs
                + "*********************************************************\n"
                + Text.coste_vehiculos
                + "____________________________________________________________\n"
                + "  AeroCar                          " + costeCars + Text.yurs
                + "  AeroBike                         " + costeBikes + Text.yurs
                + "*********************************************************\n"
                + Text.coste_aliens + sumarCosteAliens() + Text.yurs
                + "*********************************************************\n"
                + "*********************************************************\n"
                + "TOTAL: " + costeTotal() + "\n"
                + "*********************************************************";
        return factura;
    }
}
