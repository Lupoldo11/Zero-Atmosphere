package utils;
/**
 *
 * @author masar
 */
public class Codigo {
    private static int contadorMinero = 1;
    private static int contadorSoldado = 1;
    private static int contadorMascota = 1;
    private static int contadorAlienigena = 1;
    private static int contadorAerocar = 1;
    
    public static String generarMinero() {
        String idMinero = "min" + String.format("%04d", contadorMinero);
        contadorMinero++;
        return idMinero;
    }

    // Método para generar Soldados
    public static String generarSoldado() {
        String idSoldado = "sold" + String.format("%04d", contadorSoldado);
        contadorSoldado++;
        return idSoldado;
    }

    // Método para generar Mascotas
    public static String generarMascota() {
        String idMascota = "masc" + String.format("%04d", contadorMascota);
        contadorMascota++;
        return idMascota;
    }

    // Método para generar Alienígenas
    public static String generarAlienigena() {
        String idAlienigena = "ali" + String.format("%04d", contadorAlienigena);
        contadorAlienigena++;
        return idAlienigena;
    }

    // Método para generar Aerocars
    public static String generarAerocar() {
        String idAerocar = "car" + String.format("%04d", contadorAerocar);
        contadorAerocar++;
        return idAerocar;
    }
}