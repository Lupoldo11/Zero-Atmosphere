package utils;
/**
 *
 * @author Lupoldo
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
public class LectorTxt {
    
    //Genera las personas y añade al array
    public static void lectorFiles (){
        try {
            for (String file:Text.files){
                List<String> listFile= new ArrayList<>();
                List<String> lineas = Files.readAllLines(Paths.get(Config.new_directorio+file));
                for (String linea : lineas) {
                    String[] linea_con_comas=linea.split(",");
                    for (String nombre : linea_con_comas){
                        listFile.add(nombre);
                    }
                }
                admin(listFile,file);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    //Administra los listFile
    public static void admin(List<String> listFile, String file){
        switch (file){
            case"nombres.txt"-> Text.fileNombres= listFile;
            case"apellidos.txt"-> Text.fileApellidos= listFile;
            case"mascotas.txt"-> Text.fileMascotaN= listFile;
            case"perros.txt"-> Text.filePerros= listFile;
            case"pajaros.txt"-> Text.filePajaros= listFile;
            case"gatos.txt"-> Text.fileGatos= listFile;
            default->System.out.println(Text.error_seleccion);
        }
    }
    
    public static void guardarFactura(String directorio){
        try {
            FileWriter imprimir = new FileWriter(directorio+"\\factura.txt"); // puedes añadir la ruta de archivo donde quieras que se guarde
            imprimir.write(Sumatorio.imprimirFactura());
            imprimir.close();
            System.out.println(Text.fac_guardada);
        } catch (IOException e) {
            System.out.println(Text.error_guardar_factura);
            e.printStackTrace();
        }
    }
    
    public static void menuFactura() {
        System.out.println(Text.menu_factura);
        String seleccion = Text.intro.nextLine();
        boolean salir = false;
        switch(seleccion){
            case "1":
                System.out.println(Sumatorio.imprimirFactura());
                
                break;
            case "2":
                boolean guardado = false;
                do{
                    System.out.println(Text.intro_directorio);
                    String dir = Text.intro.nextLine(); 
                    File directorio = new File(dir);
                    if(directorio.exists() && directorio.isDirectory()){
                        guardarFactura(dir);
                        guardado = true;
                    }
                    else{
                        System.out.println(Text.error_dir_no_existe);
                    }
                }while(guardado == false);
                break;
            case "3":
                salir = true;
                break;
            default:
                System.out.println(Text.error);
        }
    }
}