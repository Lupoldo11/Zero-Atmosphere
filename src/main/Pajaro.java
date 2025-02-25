package main;
/**
 *
 * @author masar
 */
public class Pajaro extends Mascota{
    protected String color;
    protected String especie;
    protected boolean volador;
    
    public Pajaro(String color,String especie,boolean volador){
        super(edadPajaro()); //añadir metodo para calcular edad de un pajaro
        this.color=color;
        this.especie=especie;
        this.volador=volador;
    }
    
    public static int edadPajaro(){
        return (int) (Math.random() * 7) + 1;
    }
    
    @Override
    public void comer(){
        System.out.println(nombre+" esta comiendo");
    }
    @Override
    public void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }
    
    public void piar(){
        System.out.println("Piiiioo pioo");
    }
    public void volar(){
        if(volador){
            System.out.println(nombre+" esta volando"); 
        }
        else{
            System.out.println(nombre+"no puede volar");
        }
        
    }

    @Override
    public String toString() {
        return "Pajaro " +nombre+ " edad "+edad+" amo "+0+" de color "+color+" su especie es "+especie+" con codigo de mascota "+super.codigo;
    }
    
}