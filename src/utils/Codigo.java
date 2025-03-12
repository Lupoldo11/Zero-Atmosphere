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
    private static int contadorVehiculo = 1;
    private static int contadorTurbo = 1;
    private static int contadorHerramienta = 1;
    
    public static String generarTurboJet() {
        String idTurbo = Text.pf_turbojet + String.format("%04d", contadorTurbo);
        contadorTurbo++;
        return idTurbo;
    }
    
    public static String generarMinero() {
        String idMinero = Text.pf_minero + String.format("%04d", contadorMinero);
        contadorMinero++;
        return idMinero;
    }

    // Método para generar Soldados
    public static String generarSoldado() {
        String idSoldado = Text.pf_soldado + String.format("%04d", contadorSoldado);
        contadorSoldado++;
        return idSoldado;
    }

    // Método para generar Mascotas
    public static String generarMascota() {
        String idMascota = Text.pf_mascota + String.format("%04d", contadorMascota);
        contadorMascota++;
        return idMascota;
    }

    // Método para generar Alienígenas
    public static String generarAlienigena() {
        String idAlienigena = Text.pf_alien + String.format("%04d", contadorAlienigena);
        contadorAlienigena++;
        return idAlienigena;
    }

    // Método para generar Aerocars
    public static String generarVehiculo() {
        String idAerocar = Text.pf_aerocar + String.format("%04d", contadorVehiculo);
        contadorVehiculo++;
        return idAerocar;
    }
    
    public static String generarHerramienta() {
        String idHerramienta = Text.pf_herramienta + String.format("%04d", contadorHerramienta);
        contadorHerramienta++;
        return idHerramienta;
    }
}