
package utils;
/**
 *
 * @author Ana
 */

import java.util.*;
import java.io.*;
import personas.Minero;
import vehiculos.*;



public class Sumatorio {
    
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
                + Text.coste_minero+  + costeMineros + Text.yurs
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
