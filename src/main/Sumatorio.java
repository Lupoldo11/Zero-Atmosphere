package main;

import java.util.*;
import java.io.*;

public class Sumatorio {

    public static int[] contadorPersonas() {
        int numMineros = 0;
        int numSoldados = 0;

        for (int i = 0; i < Text.listPersona.size(); i++) {
            if (Text.listPersona.get(i) instanceof Minero) {
                numMineros++;
            } else {
                numSoldados++;
            }
        }
        int[] numPersonas = {numMineros, numSoldados};
        return numPersonas;
    }

    public static int[] contadorVehiculos() {
        int numAeroCar = 0;
        int numAeroBike = 0;

        for (int i = 0; i < Text.listVehiculo.size(); i++) {
            if (Text.listVehiculo.get(i) instanceof AeroCar) {
                numAeroCar++;
            } else {
                numAeroBike++;
            }
        }
        int[] numVehiculos = {numAeroCar, numAeroBike};
        return numVehiculos;
    }

    public static int sumarCostePersonas() {
        int costeMineros = contadorPersonas()[0] * 20;
        int costeSoldados = contadorPersonas()[1] * 22;

        return costeMineros + costeSoldados;
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
        int costeMineros = contadorPersonas()[0] * 20;
        int costeSoldados = contadorPersonas()[1] * 22;
        int costeCars = contadorVehiculos()[0] + AeroCar.gastoCarburante;
        int costeBikes = contadorVehiculos()[1] + AeroBike.gastoCarburante;

        String factura = "*********************************************************\n"
                + "*********************************************************\n"
                + "COSTE DE LA MISION\n"
                + "*********************************************************\n"
                + "Personas             Coste/Dia       Total\n"
                + "_____________________________________________________________\n"
                + "  Minero             20yurs       " + costeMineros + " yurs\n"
                + "  Soldado            22yurs       " + costeSoldados + " yurs\n"
                + "*********************************************************\n"
                + "Vehiculos                            Total\n"
                + "____________________________________________________________\n"
                + "  AeroCar                          " + costeCars + " yurs\n"
                + "  AeroBike                         " + costeBikes + " yurs\n"
                + "*********************************************************\n"
                + "Penalizacion por alien  4yurs/dia  " + sumarCosteAliens() + " yurs\n"
                + "*********************************************************\n"
                + "*********************************************************\n"
                + "TOTAL: " + costeTotal() + "\n"
                + "*********************************************************";
        return factura;
        
    }
    
    public static void guardarFactura(String directorio){
        try {
            FileWriter imprimir = new FileWriter(directorio+"\\factura.txt"); // puedes añadir la ruta de archivo donde quieras que se guarde
            imprimir.write(imprimirFactura());
            imprimir.close();
            System.out.println("Factura guardada");
        } catch (IOException e) {
            System.out.println("Error al guardar la factura");
            e.printStackTrace();
        }
    }
    
    public static void menuFactura() {
        System.out.println("1.Ver factura en pantalla \n 2.Guardar factura");
        String seleccion = Text.intro.nextLine();
        
        switch(seleccion){
            case "1":
                System.out.println(imprimirFactura());
                
                break;
            case "2":
                boolean guardado = false;
                do{
                    System.out.println("Introduce el directorio donde guardar la factura");
                    String dir = Text.intro.nextLine(); 
                    File directorio = new File(dir);
                    if(directorio.exists() && directorio.isDirectory()){
                    guardarFactura(dir);
                    guardado = true;
                }
                else{
                    System.out.println("directorio incorrecto");
                }
                }while(guardado == false);
                
                break;
            default:
                System.out.println("Error");
        }
    }
    

}
