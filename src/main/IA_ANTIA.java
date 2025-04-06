package main;

import herramientas.*;
import java.io.File;
import java.util.ArrayList;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class IA_ANTIA {

    public static ArrayList<Herramienta> modificados = new ArrayList<>();

    public static ArrayList<Pala> palas = new ArrayList<>();
    public static ArrayList<Cibercompresor> compresores = new ArrayList<>();
    public static ArrayList<Ciberexcavadora> excavadoras = new ArrayList<>();
    public static ArrayList<Martillo> martillos = new ArrayList<>();

    public static void menu() {
        utils.Binary_file.leer_binarios(new File("palas.dat"));
        utils.Binary_file.leer_binarios(new File("compresores.dat"));
        utils.Binary_file.leer_binarios(new File("excavadoras.dat"));
        utils.Binary_file.leer_binarios(new File("martillos.dat"));

        for (Herramienta item : Text.listHerramientas2) {
            if (item instanceof Pala) {
                palas.add((Pala) item);
            }
            if (item instanceof Cibercompresor) {
                compresores.add((Cibercompresor) item);
            }
            if (item instanceof Ciberexcavadora) {
                excavadoras.add((Ciberexcavadora) item);
            }
            if (item instanceof Martillo) {
                martillos.add((Martillo) item);
            }
        }

        //INICIO MATRIZ
        String salida = "";

        for (int num_palas = 0; num_palas < (palas.size() - 1); num_palas++) {
            Pala pala = palas.get(num_palas);
            salida += pala.getCodigo() + " ";
        }
        salida += "\n";
        for (int num_martillos = 0; num_martillos < (martillos.size() - 1); num_martillos++) {
            Martillo martillo = martillos.get(num_martillos);
            salida += martillo.getCodigo() + " ";
        }
        salida += "\n";
        for (int num_excava = 0; num_excava < (excavadoras.size() - 1); num_excava++) {
            Ciberexcavadora excava = excavadoras.get(num_excava);
            salida += excava.getCodigo() + " ";
        }
        salida += "\n";
        for (int num_compresor = 0; num_compresor < (compresores.size() - 1); num_compresor++) {
            Cibercompresor compresor = compresores.get(num_compresor);
            salida += compresor.getCodigo() + " ";
        }
        salida += "\n";

        System.out.println(salida);

        System.out.println("Que quieres hacer: 1) Salir / 2) Modificar");
        String seleccion = Text.intro.nextLine();
        boolean exit = false;

        if (seleccion.equals("2")) {
            do {
                int contador = 0;
                System.out.println("Que Codigo tiene?");
                String codigo = Text.intro.nextLine();

                for (Herramienta item : Text.listHerramientas2) {
                    if (item.getCodigo().equalsIgnoreCase(codigo)) {
                        if (item instanceof Cibercompresor) {
                            herramientas.Cibercompresor.modificar(item);
                        }
                        if (item instanceof Ciberexcavadora) {
                            herramientas.Ciberexcavadora.modificar(item);
                        }
                        if (item instanceof Martillo) {
                            herramientas.Martillo.modificar(item);
                        }
                        if (item instanceof Pala) {
                            herramientas.Pala.modificar(item);
                        }
                        //Guardar para el arraylist para el txt
                        modificados.add(item);
                    }
                    contador++;
                }

                System.out.println("Quieres seguir modificando?: 1) No / 2) Sí");
                seleccion = Text.intro.nextLine();
                if (seleccion.equals("1")) {
                    exit = true;
                    System.out.println("Herramientas añadidas a los binarios");
                }
            } while (exit == false);
        }
        utils.Binary_file.txtBinario(utils.Binary_file.file_excavadoras, 1, Text.listHerramientas2);
        utils.Binary_file.txtBinario(utils.Binary_file.file_martillos, 2, Text.listHerramientas2);
        utils.Binary_file.txtBinario(utils.Binary_file.file_palas, 3, Text.listHerramientas2);
        utils.Binary_file.txtBinario(utils.Binary_file.file_compresores, 4, Text.listHerramientas2);
        utils.Binary_file.txtBinario(new File("modificados.dat"), 5, main.IA_ANTIA.modificados);
        Text.listHerramientas2.clear();
    }
}
