package utils;

import herramientas.Herramienta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import main.IA_GASTON;
/**
 *
 * @author Lupoldo
 */
public class Binary_file {

    public static void generar_archivo(){
        try {
            File f = new File("objeto.dat");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(IA_GASTON.listPala);
            oos.close();
        } catch (FileNotFoundException fne) {
            System.out.println("No existe fichero");
        } catch (IOException io){
            System.out.println(io.getMessage());
        }
    }

    public static ArrayList<Herramienta> listHerramienta = new ArrayList<>();

    public static void leer_archivo() throws IOException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File f = new File("objeto.dat");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ArrayList<Herramienta> ejemplo = (ArrayList<Herramienta>) ois.readObject();
        } catch (IOException io) {
            System.out.println("\n************FIN*******");
        } catch(ClassNotFoundException cnf){
            System.out.println("adad");
        }finally {
            ois.close();
            fis.close();
        }
    }
}
