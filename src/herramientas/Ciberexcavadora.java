package herramientas;
/**
 *
 * @author Lupoldo
 */
public class Ciberexcavadora  extends Herramienta{
    private Ciberexcavadora (){}
    
    public static Ciberexcavadora crear(){
        Ciberexcavadora excavadora = new Ciberexcavadora();
        return excavadora;
    }
}
