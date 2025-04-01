package utils;
/**
 *
 * @author Lupoldo
 */
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import aliens.Alien;
import mascotas.Mascota;
import personas.Persona;
import vehiculos.Vehiculo;

public class Text {

    // Contenido String o textual (por defecto)
    // Menus 
    public static String menu_seleccion_inicio = "Lista de opciones: \n1) IA_Bob (Seleccionable) \n2) IA_Alonso (Automático) \n3) Ajustes \n4) Salir";
    public static String menu_ajustes = "1) Cambiar directorio \n2) Cambiar idioma \n3) Factura \n4) Salir"; 
    public static String menu_factura = "1.Ver factura en pantalla \n2.Guardar factura \n3.Salir";
    public static String cierre_sesion = "Cerrando sesion";
    
    // Errores
    public static String error = "Error";
    public static String error_seleccion = "Opción no disponible";
    public static String error_cambio_dir = "No se ha podido cambiar";
    public static String error_dir_no_existe = "Esta ruta no existe";
    public static String error_dir_no_archivos = "En este directorio no se encuentran todos archivos necesarios";
    public static String error_dir_no_ajustado = " directorio no ajustado";
    public static String error_guardar_factura = "Error al guardar la factura";
    public static String error_valor_invalido = "El valor no es válido";
    
    // IA
    // IA General
    public static String accion = "Accion";
    public static String listado_de = "Listado de";
    public static String numero_de = "Numero de";
    public static String tamanio_lista = "Tamaño lista: ";
    // IA Aliens
    public static String pregunta_aliens = "¿Cuántos alienígenas hay en la nave?";
    // IA Distancia
    public static String pregunta_distancia = "¿Cual es la distancia hacia la otra nave?";
    public static String respuesta_distancia = "La distancia con la nave es de: ";
    public static String anios_luz = " año/luz. \nPor tanto es: ";
    // IA Duracion
    public static String duracion_mision = "La misión durará ";
    public static String dias = " días";
    // IA Coste
    public static String coste_mision = "El coste total del operativo es de: " ;
    // IA Personas
    public static String cuantos_soldados = "¿Cuántos soldados quieres?";
    public static String cuantos_mineros = "¿Cuántos mineros quieres?";
    
    // Configuracion
    public static String intro_directorio = "Introduce directorio: ";
    public static String dir_enlazado = "Directorio enlazado y con el contenido requerido";
    
    //Aliens
    public static String alien_come = "Hmmm";
    public static String alien_duerme = "Duermiendo";
    public static String alien_ataca = "Ataque!";
    
    // Mascotas
    public static String mascota_come = " esta comiendo";
    public static String mascota_duerme = " esta durmiendo";
    public static String str_amo = " amo:";
    public static String codigo_mascota = " codigo de mascota: ";
    public static String str_raza = " de raza ";
    public static String str_edad = " edad ";
    // Gato
    public static String maullar = "Miauuu";
    public static String ronronear = "Prrrrr";
    public static String gato_nombre = "Gato cuyo nombre es ";
    public static String str_color = " color ";
    public static String str_pelo = " tipo de pelo ";
    // Pajaro
    public static String piar = "Piiiioo pioo";
    public static String vuela = " esta volando";
    public static String no_vuela = "no puede volar";
    public static String str_pajaro = "Pajaro ";
    public static String str_especie = " su especie es ";
    // Perro
    public static String ladrar = "Guau guau";
    public static String jugar = " esta jugando";
    public static String perro_nombre = "Perro cuyo nombre es ";
    public static String str_peso = ", pesa ";
    public static String str_tamanio = "kgs, tamaño: ";
    
    //Personas
    public static String str_minero = "Trabajo: Minero: ";
    public static String str_soldado = "\nTrabajo: Soldado: ";
    public static String persona_nombre = "Nombre: ";
    public static String apellidos = "\nApellidos: ";
    public static String persona_edad = "\nEdad: ";
    public static String rango_general = "General";
    public static String rango_coronel = "Coronel";
    public static String rango_capitan = "Capitán";
    public static String rango_sargento = "Sargento";
    public static String rango_tropa = "Tropa";
    
    // Prefijo odigo
    public static String pf_turbojet = "tjet";
    public static String pf_minero = "min";
    public static String pf_soldado = "sold";
    public static String pf_mascota = "masc";
    public static String pf_alien = "ali";
    public static String pf_aerocar = "car";
    public static String pf_herramienta = "her";

    // Factura
    public static String str_coste_mision ="COSTE DE LA MISION\n";
    public static String str_personas_coste = "Personas             Coste/Dia       Total\n";
    public static String yurs = " yurs\n";
    public static String coste_minero = "Minero            20yurs       \"";
    public static String coste_soldado = "  Soldado            22yurs       ";
    public static String coste_vehiculos = "Vehiculos                            Total\n";
    public static String coste_aliens = "Penalizacion por alien  4yurs/dia  ";
    public static String fac_guardada = "Factura guardada";

    // Vehiculos
    public static String arranca = "Esta arrancado";
    public static String apagado = "Esta apagado";
    public static String bike = "\nAeroBike";
    public static String tripulantes = "\nTripulantes: ";
    public static String deposito_lleno = "Deposito lleno";
    public static String demasiada_gasolina = "La gasolina supera a la cantidad máxima \nDepósito Máximo: ";
    public static String str_estado_deposito = "\nDepósito del vehículo: ";
    public static String gasolina_falta = "\nGasolina que falta: ";
    public static String car = "\nAeroCar ";
    public static String marca = ", Marca: ";
    public static String turbojet = "TurboJet{";
    public static String potencia = "potencia=";
    public static String str_gasto_carburante = ", gastoCarburante=";
    public static String str_codigo = ", codigo=";
    public static String economico = "economico";
    public static String estelar = "estelar";
    public static String vehiculo_tj = "Vehiculo{" + " turbojet=";
    
    // Herramientas
    public static String metal_puro = "puro";
    public static String metal_aleacion = "aleacion";
    public static String sujecion_manual = "manual";
    public static String sujecion_correa = "correa";
    public static String traccion_ruedas = "ruedas";
    public static String traccion_oruga = "oruga";
    
    //String para funciones
    public static String guiones = "-----------------------------------------------";
    public static String separador = "||||||||||||||||||||||||||||||||||||||||||||||||||||";
    public static String directorio_files = "C:\\Users\\Lupoldo\\Desktop\\Desarrollo Muti\\Programación\\Archivos programación\\ZeroAtmosphere\\src\\documentacion\\";
    protected static String[] files = new String[]{"nombres.txt", "apellidos.txt", "mascotas.txt", "gatos.txt","perros.txt","pajaros.txt"};

    //Herramientas de introducción de datos
    public static Scanner intro = new Scanner(System.in);

    //Hacer coleccion de personas, aliens, vehículos, mascosas
    public static Vector<Persona> listPersona = new Vector<>();
    public static Vector<Alien> listAlien = new Vector<>();
    public static Vector<Vehiculo> listVehiculo = new Vector<>();
    public static Vector<Mascota> listMascota = new Vector<>();

    //Hacer lista de nombre, apellido, nombre_mascota, raza_mascota
    public static List<String> fileNombres;
    public static List<String> fileApellidos;
    public static List<String> fileMascotaN;
    public static List<String> filePerros;
    public static List<String> fileGatos;
    public static List<String> filePajaros;

    //HashMap para asociacion mascota-dueño
    public static HashMap<String, String> mascota_dueño = new HashMap<>();

    //Variables usados en varias class
    public static int num_soldados, num_mineros;
    public static int motos, coches;
    public static double distancia;

    //LO GUARDO AQUí PORQUE NO SE DONDE PONERLO (Objeto Persona predefinidos)
    final Persona laura = new Persona("Laura", "Lopez Gomez", 20);
    final Persona carmen = new Persona("Carmen", "Lopez Arias", 59);
    final Persona federico = new Persona("Federico", "Lopez Lopez", 19);
    final Persona lopez = new Persona("Lopez", "Lopez Lopez", 63);
}
