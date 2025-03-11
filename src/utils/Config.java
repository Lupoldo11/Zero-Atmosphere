//Cambio de idioma en los textos
//Idea loca: hacer que lea un archivo en un formato.txt (prediseñado) y hacer que se añada
package utils;
/**
 *
 * @author Lupoldo
 */
import java.io.File;

public class Config {
    //Menu Config
    public static void config(){
        boolean salida=false;
        do {
            System.out.println(Text.menu_ajustes);
            String seleccion = Text.intro.nextLine();
            switch (seleccion){
                case "1" -> change_directory();
                case "2" -> Idiomas.cambiar_idioma();
                case "3" -> LectorTxt.menuFactura();
                case "4" -> salida=true;
                case "5" -> System.out.println(Text.directorio_files); //Saber en que directorio está situado
                default -> System.out.println(Text.error_seleccion);
            }
        } while (salida!=true);
    }
    
    public static String new_directorio;
    
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