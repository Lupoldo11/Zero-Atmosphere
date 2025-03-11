package herramientas;
/**
 *
 * @author Lupoldo
 */
public class Martillo  extends Herramienta{
    private Martillo (){}
    
    public static Martillo crear(){
        Martillo martillo = new Martillo();
        return martillo;
    }
}
