/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author masar
 */
public class Codigo {
    private int contadorMinero = 1;
    private int contadorSoldado = 1;
    private int contadorMascota = 1;
    private int contadorAlienigena = 1;
    private int contadorAerocar = 1;
    
    public String generarMinero() {
        String idMinero = "min" + String.format("%04d", contadorMinero);
        contadorMinero++;
        return idMinero;
    }

    // Método para generar Soldados
    public String generarSoldado() {
        String idSoldado = "sold" + String.format("%04d", contadorSoldado);
        contadorSoldado++;
        return idSoldado;
    }

    // Método para generar Mascotas
    public String generarMascota() {
        String idMascota = "masc" + String.format("%04d", contadorMascota);
        contadorMascota++;
        return idMascota;
    }

    // Método para generar Alienígenas
    public String generarAlienigena() {
        String idAlienigena = "ali" + String.format("%04d", contadorAlienigena);
        contadorAlienigena++;
        return idAlienigena;
    }

    // Método para generar Aerocars
    public String generarAerocar() {
        String idAerocar = "car" + String.format("%04d", contadorAerocar);
        contadorAerocar++;
        return idAerocar;
    }
}
