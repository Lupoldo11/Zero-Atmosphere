/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author masar
 */
public class Resetea {
    public static void reset (){
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
}
