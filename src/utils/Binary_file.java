package utils;

/**
 *
 * @author Ana
 */

import herramientas.*;
import java.io.*;
import java.util.*;
import main.IA_GASTON;

public class Binary_file {

    //Files para los binarios
    public static File file_excavadoras = new File("C:\\Users\\Carlos\\Desktop\\Programación\\Prácticas\\SK Telecom\\Zero Atmosphere\\excavadoras.dat");
    public static File file_martillos = new File("C:\\Users\\Carlos\\Desktop\\Programación\\Prácticas\\SK Telecom\\Zero Atmosphere\\martillos.dat");
    public static File file_palas = new File("C:\\Users\\Carlos\\Desktop\\Programación\\Prácticas\\SK Telecom\\Zero Atmosphere\\palas.dat");
    public static File file_compresores = new File("C:\\Users\\Carlos\\Desktop\\Programación\\Prácticas\\SK Telecom\\Zero Atmosphere\\compresores.dat");
    
    //Escribir los binarios del arraylist que le pases en el file que le pases
    public static void escribir_binarios(File archivo, ArrayList lista) {
        try {
            //Excavadoras
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);
            for (int i = 0; i < lista.size(); i++) {
                escribir.writeObject(lista.get(i));
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
    
    //Meter el arraylist de cada tipo de herramienta en el file correspondiente
    public static void llenar_binarios() {
        escribir_binarios(file_excavadoras, IA_GASTON.listExcavador);
        escribir_binarios(file_martillos, IA_GASTON.listMartillo);
        escribir_binarios(file_palas, IA_GASTON.listPala);
        escribir_binarios(file_compresores, IA_GASTON.listCompresor);
        System.out.println("Herramientas añadidas a los binarios");
    }
    
    //Leer el binario que le pases
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
    
    //Meter los objetos de los binarios en la fila correspondiente de la matriz
    public static void volcar_binarios() {
        for (int j = 0; j < IA_GASTON.matrizHerramientas.size(); j++) {
            IA_GASTON.matrizHerramientas.get(0).add(j, leer_binarios(utils.Binary_file.file_excavadoras));
            IA_GASTON.matrizHerramientas.get(1).add(j, leer_binarios(utils.Binary_file.file_martillos));
            IA_GASTON.matrizHerramientas.get(2).add(j, leer_binarios(utils.Binary_file.file_palas));
            IA_GASTON.matrizHerramientas.get(3).add(j, leer_binarios(utils.Binary_file.file_compresores));

        }

        System.out.println("Herramientas guardadas en la matriz");
    }

}
