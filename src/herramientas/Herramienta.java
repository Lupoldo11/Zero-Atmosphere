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

    //Metodos
    public String getCodigo() {
        return codigo;
    }

    public double getProteccion() {
        return proteccion;
    }

    public double randoomProteccion() {
        proteccion = Math.random(); //La proteccion tiene que ser un double entre 0 y 1
        return proteccion;
    }

    public void setProteccion(double proteccion) {
        if (proteccion >= 0 && proteccion <= 1) {
            this.proteccion = proteccion;
        } else {
            System.out.println(Text.error_valor_invalido);
        }
    }

}
