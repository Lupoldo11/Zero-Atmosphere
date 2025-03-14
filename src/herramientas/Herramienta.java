package herramientas;

import utils.Text;

/**
 *
 * @author Lupoldo
 */
public class Herramienta {

    //Atributos
    public String codigo;
    public double proteccion;
    
    //Constructores
    public Herramienta(String codigo) {
        this.codigo = codigo;
        this.proteccion = randoomProteccion();
    }

    //Metodos Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public double getProteccion() {
        return proteccion;
    }

    public void setProteccion() {
        System.out.println("Cuanta protección va a tener?");
        int protec = Text.intro.nextInt();
        
        if (protec >= 0 && protec <= 1) {
            this.proteccion = protec;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

    //Metodo: genera num aleatorio para dar la protección
    public double randoomProteccion() {
        proteccion = Math.random(); //La proteccion tiene que ser un double entre 0 y 1
        return proteccion;
    }
    
}
