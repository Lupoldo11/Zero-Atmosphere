/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author masar
 */
public class Pajaro extends Mascota{
    protected String color;
    protected String especie;
    protected boolean volador;
    
    public Pajaro(String nombre, int edad, PropietarioMascota amo,String color,String especie,boolean volador){
        super(nombre,edad,amo);
        this.color=color;
        this.especie=especie;
        this.volador=volador;
    }
    
    @Override
    public void comer(){
        System.out.println(nombre+" esta comiendo");
    }
    @Override
    public void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }
    
    public void piar(){
        System.out.println("Piiiioo pioo");
    }
    public void volar(){
        if(volador){
            System.out.println(nombre+" esta volando"); 
        }
        else{
            System.out.println(nombre+"no puede volar");
        }
        
    }

    @Override
    public String toString() {
        return "Pajaro{" + "color=" + color + ", especie=" + especie + ", volador=" + volador + '}';
    }
    
}
