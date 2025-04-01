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
    
    public static String new_directorio;
    
    //Genera las personas y añade al array
    public static void lectorFiles (){
        try {
            for (String file:Text.files){
                List<String> listFile= new ArrayList<>();
                List<String> lineas = Files.readAllLines(Paths.get(new_directorio+file));
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
    
     //Cambiar directorio
    public static void change_directory(){
        System.out.print(Text.intro_directorio);
        new_directorio= Text.intro.nextLine(); //Hay que meter la url con un \ para situarse en el directorio (dentro)
        boolean cheks= comprobar_directorio(new_directorio);
        if (cheks){
            Text.directorio_files=new_directorio;
        } else {
            System.out.println(Text.error_cambio_dir);
        }
    }
    
    //Comprobar si el directorio existe
    public static boolean comprobar_directorio(String new_directorio){
        File directorio = new File (new_directorio);
        
        if (directorio.exists() && directorio.isDirectory()){
            String[] listFiles = directorio.list();
            return comprobar_archivos(listFiles);
        } else {
            System.out.println(Text.error_dir_no_existe);
            return false;
        }
    }
    
    //Comprueba si los archivos que necesitamos están en el directorio
    public static boolean comprobar_archivos(String[] listFiles){
        boolean[] checks = {false,false,false,false,false,false};
        for (String file : listFiles){
            switch (file){
                case "nombres.txt" -> checks[0]=true;
                case "apellidos.txt" -> checks[1]=true;
                case "mascotas.txt" -> checks[2]=true;
                case "perros.txt" -> checks[3]=true;
                case "gatos.txt" -> checks[4]=true;
                case "pajaros.txt" -> checks[5]=true;
            }
        }
        if (checks[0]==true && checks[1]==true && checks[2]==true && checks[3]==true && checks[4]==true && checks[5]==true){
                main.IA_EVA.check_automatico=true;
                LectorTxt.lectorFiles();
                System.out.println(Text.dir_enlazado);
                return true;
            } else {
                System.out.println(Text.error_dir_no_archivos);
                return false;
            }
    }
}