package aliens;
/**
 *
 * @author gasto
 */
import utils.Codigo;
import utils.Text;

public abstract class Alien {
    //Atributos
    public String codigo_ref;
    public String arma;
    public String dificultad;

    //Constructor
    public Alien(String arma, String dificultad) {
        this.arma=arma;
        this.dificultad=dificultad;
        this.codigo_ref= Codigo.generarAlienigena();
    }

    //Metodo static para generar los alien (de forma consecutiva) [Auto-generación]
    public static void generadorAlien (int total_alien, int contador_Raiser){
        for (int i=0;i<total_alien;i++){
                    if (contador_Raiser!=0){
                        Alien ejemplo1 = new Raiser("arma","dificultad",2); //invisibilidad
                        Text.listAlien.add(ejemplo1);
                        contador_Raiser--;
                    } else {
                        Alien ejemplo2 = new Nomun("arma","dificultad",2); //autotranslacion 
                        Text.listAlien.add(ejemplo2); 
                    }
        }
    }
}