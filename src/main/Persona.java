package main;


public class Persona {
    
    //Atributos
    private String nombre;
    private String[] apellidos;
    private int edad; 
    
    //Contructores
    public Persona(String nombre, String apellidos, int edad){
        this.nombre= nombre;
        this.apellidos= apellidos.split(" "); //Genera un array separando en el caracter puesto
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
    
    public String texto_toString(){
        String texto_salida="Nombre: "+this.nombre+
                                        "\nApellidos: "+this.apellidos[0]+" "+this.apellidos[1]+
                                        "\nEdad: "+this.edad;
        return texto_salida;
    }
    
    //Metodos 
}

