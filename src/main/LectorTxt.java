package main;
/**
 *
 * @author Lupoldo
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
public class LectorTxt {
    
    //Genera las personas y añade al array
    public static void lectorFiles (){
        try {
            List<String> listFile= new ArrayList<>();
            
            for (String file:Text.files){
                List<String> lineas = Files.readAllLines(Paths.get(Text.directorio_files+file));
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
            case"Nombres.txt"-> Text.fileNombres= listFile;
            case"Apellidos.txt"-> Text.fileApellidos= listFile;
            case"MascotaN.txt"-> Text.fileMascotaN= listFile;
            case"MascotaR.txt"-> Text.fileMascotaR= listFile;
            default->System.out.println(Text.error_seleccion);
        }
    }
}