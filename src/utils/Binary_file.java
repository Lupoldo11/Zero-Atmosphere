package utils;

/**
 *
 * @author Ana
 */
import herramientas.*;
import java.io.*;
import java.util.ArrayList;

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
        escribir_binarios(file_excavadoras, 1);
        escribir_binarios(file_martillos, 2);
        escribir_binarios(file_palas, 3);
        escribir_binarios(file_compresores, 4);
        System.out.println("Herramientas añadidas a los binarios");
    }

    //Escribir los binarios del arraylist que le pases en el file que le pases
    public static void escribir_binarios(File archivo, int seleccion) {
        int contador = 0;
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);
            for (Herramienta item : main.IA_GASTON.listHerramientas) {
                if (item instanceof Ciberexcavadora && seleccion == 1) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                }
                if (item instanceof Martillo && seleccion == 2) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                }
                if (item instanceof Pala && seleccion == 3) {
                    escribir.writeObject(main.IA_GASTON.listHerramientas.get(contador));
                }
                if (item instanceof Cibercompresor && seleccion == 4) {
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
    public static void leer_binarios(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream leer = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                Text.listHerramientas2.add((Herramienta) leer.readObject());
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
    }

    //Escribir los binarios del arraylist que le pases en el file que le pases
    public static void txtBinario(File archivo, int seleccion, ArrayList<Herramienta> list) {
        int contador = 0;
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(archivo));
            for (Herramienta item : list) {
                if (item instanceof Ciberexcavadora && seleccion == 1) {
                    escribir.writeObject(list.get(contador));
                }
                if (item instanceof Martillo && seleccion == 2) {
                    escribir.writeObject(list.get(contador));
                }
                if (item instanceof Pala && seleccion == 3) {
                    escribir.writeObject(list.get(contador));
                }
                if (item instanceof Cibercompresor && seleccion == 4) {
                    escribir.writeObject(list.get(contador));
                }
                if (seleccion == 5) {
                    escribir.writeObject(list.get(contador));
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
    public static void leer_txtBinario(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream leer = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                Herramienta item = (Herramienta) leer.readObject();
                    if (item instanceof Ciberexcavadora ) {
                        SQL.objetoCE= (Ciberexcavadora) item;
                        SQL.datos("cambiar-excavadora");
                    }
                    if (item instanceof Martillo ) {
                        SQL.objetoM= (Martillo) item;
                        SQL.datos("cambiar-martillo");
                    }
                    if (item instanceof Cibercompresor ) {
                        SQL.objetoCC= (Cibercompresor) item;
                        SQL.datos("cambiar-compresor");
                    }
                    if (item instanceof Pala ) {
                        SQL.objetoP= (Pala) item;
                        SQL.datos("cambiar-pala");
                    }
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
    }
}
