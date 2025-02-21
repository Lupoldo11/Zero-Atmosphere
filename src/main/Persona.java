package main;
/**
 *
 * @author Lupoldo
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private final int edad; 
    private Mascota mascota;
    
    //Contructores
    public Persona(){
        this.nombre= Text.fileNombres.get((int) (Math.random() * Text.fileNombres.size())); //Selecciona un nombre al azar
        this.apellido1= Text.fileApellidos.get((int) (Math.random() * Text.fileApellidos.size())); //Selecciona un apellido al azar
        this.apellido2= Text.fileApellidos.get((int) (Math.random() * Text.fileApellidos.size())); 
        this.edad= (int) (Math.random() * 100) + 10; //Edad máxima de una persona 100 años
        
        //Saber si tendrá mascota
        if (Math.random()<0.5) {
            Mascota.generarMascota();//Asociar con algun humano
        }
    }
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        String[] apellidos_completo=apellidos.split(" ");
        this.apellido1=apellidos_completo[0];
        this.apellido2=apellidos_completo[1];
        this.edad=edad;
    }
    
    //Metodos Setter y Getter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String cambio_nombre){
        this.nombre=cambio_nombre;
    }
    
    public String getApellidos(){
        return this.apellido1+this.apellido2;
    }
    public void setApellidos(String apellidos){
        String[] apellidos_completo=apellidos.split(" ");
        this.apellido1=apellidos_completo[0];
        this.apellido2=apellidos_completo[1];
    }
    
    public int getEdad(){
        return this.edad;
    }
    //No tiene set debido a que la edad no se cambia a voluntad
    
    //Metodo toString
    public String texto_toString(){
        String texto_salida="Nombre: "+this.nombre+
                                        "\nApellidos: "+this.apellido1+" "+this.apellido2+
                                        "\nEdad: "+this.edad;
        return texto_salida;
    }
    
    //Metodo static que genera la listPersona [Auto-rellenable]
    public static void generadorPersona (int total_humanos, int num_soldados){
        for (int i=0;i<total_humanos;i++){
                    if (num_soldados!=0){
                        Persona ejemplo1 = new Soldado(); //nombre (auto)/ apellidos (auto)/ edad (auto)/ peso?
                        Text.listPersona.add(ejemplo1);
                        num_soldados--;
                    } else {
                        Persona ejemplo2 = new Minero(); //nombre (auto)/ apellidos (auto)/ edad (auto)/ peso?
                        Text.listPersona.add(ejemplo2); 
                    }
        }
    }
}
