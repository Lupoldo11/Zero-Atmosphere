package main;

import java.util.*;

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
        return sumarCostePersonas() + sumarCosteAliens() + sumarCosteVehiculos();
    }

}
