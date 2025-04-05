package utils;

/**
 *
 * @author Ana
 */

import herramientas.*;
import java.io.*;

public class Binary_file {

    //Files para los binarios
    public static File file_excavadoras = new File("excavadoras.dat");
    public static File file_martillos = new File("martillos.dat");
    public static File file_palas = new File("palas.dat");
    public static File file_compresores = new File("compresores.dat");
    
    public static void volcar_binarios() {
        llenar_binarios();
    }
    
    //Meter el arraylist de cada tipo de herramienta en el file correspondiente
    public static void llenar_binarios() {
        escribir_binarios(file_excavadoras,1);
        escribir_binarios(file_martillos,2);
        escribir_binarios(file_palas,3);
        escribir_binarios(file_compresores,4);
        System.out.println("Herramientas añadidas a los binarios");
    }
    
    //Escribir los binarios del arraylist que le pases en el file que le pases
    public static void escribir_binarios(File archivo, int seleccion) {
        int contador=0;
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);
            for (Herramienta item : main.IA_GASTON.listHerramientas) {
                 if (item instanceof Ciberexcavadora && seleccion==1) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                 }
                 if (item instanceof Martillo && seleccion==2) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                 }
                 if (item instanceof Pala && seleccion==3) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                 }
                 if (item instanceof Cibercompresor && seleccion==4) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                 }
                 contador++;
            }
            escribir.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado. "
                    + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo. "
                    + ex.getMessage());
        }
    }
    
    
    //Leer el binario que le pases(MIRAR)
    public static Herramienta leer_binarios(File archivo) {
        Herramienta leida = new Herramienta();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream leer = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                leida = (Herramienta) leer.readObject();
            }
            leer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado. "
                    + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo. "
                    + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase no existe " + ex.getMessage());
        }
        return leida;
    }

}