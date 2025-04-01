package herramientas;

import utils.Codigo;
import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Pala extends Herramienta {
    //Atributos
    public int longMango;
    public String metal;

    //Constructores
    private Pala() {
        super(Codigo.generarHerramienta());
        this.longMango = randomLongMango();
        this.metal = randomMetal();
    }

    //Metodo static crear objeto
    public static Pala crear() {
        Pala pala = new Pala();
        return pala;
    }

    //Metodos Getter
    public int getLongMango() {
        return longMango;
    }

    public String getMetal() {
        return metal;
    }

    //Para dar un valor aleatorio a longitud de mango y metal
    public int randomLongMango() {
        longMango = (int) ((Math.random() * 5) + 1);
        return longMango;
    }

    public String randomMetal() {
        double rdm = Math.random();
        if (rdm <= 0.5) {
            metal = Text.metal_puro;
        } else {
            metal = Text.metal_aleacion;
        }
        return metal;
    }

    //Para introducir manualmente los valores
    public void setLongMango() {
        System.out.println("Cuanto de lago va a ser el mango?");
        int largoMango = Text.intro.nextInt();
        Text.intro.nextLine();
        
        if (largoMango >= 1 && largoMango <= 5) {
            this.longMango = largoMango;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    public void setMetal() {
        System.out.println("Tipo de metal: 1)Puro o 2)Aleación");
        String metalmod= Text.intro.nextLine();
        metalmod = metalmod.toLowerCase();
        
        switch(metalmod){
            case "puro"->this.metal= "metal";
            case "aleacion"->this.metal= "aleacion";
            default ->  System.out.println(Text.error_valor_invalido);
        }
    }

    public static void modificar(Herramienta item){
        Pala pala= (Pala) item;
        System.out.println(pala.toString());
        System.out.println("Qué atributo quieres modificar?");
        String posicion = Text.intro.nextLine();
        
        switch(posicion){
            case"1"-> System.out.println("El código no se puede cambiar");
            case"2"-> pala.setProteccion(); //Modificar para entrada de valores
            case"3"-> pala.setMetal(); //Modificar para entrada de valores
            case"4"-> pala.setLongMango(); //Modificar para entrada de valores
            default->System.out.println("Opcion no disponible");
        }
    }
    
    //toString
    @Override
    public String toString(){
        String texto="Pala \n1.Codigo: "+super.codigo+"\n2.Protección: "+super.proteccion+
                "\n3.Metal: "+this.metal+"\n4.Longitud: "+this.longMango;
        return texto;
    }
}
