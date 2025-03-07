package mascotas;

import utils.Text;

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
        System.out.println(nombre+Text.mascota_come);
    }
    @Override
    public void dormir(){
        System.out.println(nombre+Text.mascota_duerme);
    }
    
    public void piar(){
        System.out.println(Text.piar);
    }
    public void volar(){
        if(volador){
            System.out.println(nombre+Text.vuela); 
        }
        else{
            System.out.println(nombre+Text.no_vuela);
        }
        
    }

    @Override
    public String toString() {
        return Text.str_pajaro +nombre+ Text.str_edad +edad+Text.str_amo+0+Text.str_color+color+Text.str_especie+especie+Text.codigo_mascota+super.codigo;
    }
    
}