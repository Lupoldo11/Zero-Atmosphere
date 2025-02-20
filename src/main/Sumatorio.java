package main;

import java.util.*;

public class Sumatorio {

    public static int sumarCostePersonas() {
        int costePersonas = 0;
        for (int i = 0; i < listPersona.size(); i++) {
            if (listPersona.get(i) instanceof Minero) {
                costePersonas += 20;
            } else {
                costePersonas += 22;
            }

        }
        return costePersonas;
    }

    public static int sumarCosteAliens() {
        int costeAliens = 0;
        for (int i = 0; i < listAlien.size(); i++) {
            costeAliens += 4;
        }
        return costeAliens;
    }

    public static int costeTotal() {
        return sumarCostePersonas() + sumarCosteAliens();
    }
}
