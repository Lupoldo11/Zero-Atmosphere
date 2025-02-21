package main;
/**
 *
 * @author Lupoldo
 */
public class Persona {
    //Atributos
    private String nombre;
    private String[] apellidos;
    private final int edad; 
    private Mascota mascota;
    
    //Contructores
    public Persona(String nombre, String apellidos){
        this.nombre= nombre;
        this.apellidos= apellidos.split(" "); //Genera un array separando en el caracter puesto
        this.edad= (int) (Math.random() * 100) + 10; //Edad máxima de una persona 100 años
        double azar_mascota = Math.random();
        if (azar_mascota<0.5) {
            this.mascota= Mascota.generarMascota();
        }
    }
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos= apellidos.split(" ");
        this.edad=edad;
    }
    
    //Metodos Setter y Getter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String cambio_nombre){
        this.nombre=cambio_nombre;
    }
    
    public String[] getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos.split(" ");
    }
    
    public int getEdad(){
        return this.edad;
    }
    //No tiene set debido a que la edad no se cambia a voluntad
    
    //Metodo toString
    public String texto_toString(){
        String texto_salida="Nombre: "+this.nombre+
                                        "\nApellidos: "+this.apellidos[0]+" "+this.apellidos[1]+
                                        "\nEdad: "+this.edad;
        return texto_salida;
    }
    
    //Metodo static que genera la listPersona [Auto-rellenable]
    public static void generadorPersona (int total_humanos, int num_soldados){
        for (int i=0;i<total_humanos;i++){
            double azar_mascota = Math.random(); //Entre 0 y 1 para saber si tienen mascota o no
                    if (num_soldados!=0){
                        Persona ejemplo1 = new Soldado("nombre","apellido"); //nombre (auto)/ apellidos (auto)/ edad (auto)/ peso?
                        Text.listPersona.add(ejemplo1);
                        num_soldados--;
                    } else {
                        Persona ejemplo2 = new Minero("nombre","apellido"); //nombre (auto)/ apellidos (auto)/ edad (auto)/ peso?
                        Text.listPersona.add(ejemplo2); 
                    }
        }
    }
}
