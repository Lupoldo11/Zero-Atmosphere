package utils;

/**
 *
 * @author Ana
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import static utils.Text.*;

public class Idiomas {
    // Crear y cargar properties
    static Properties propsEng = new Properties(); //Crear propertie
    static Properties propsEsp = new Properties(); 
    
    public static void cargarProperties(){
        try (InputStream urlPropsEsp = new FileInputStream("src/utils/espanol.properties")) {
            propsEsp.load(urlPropsEsp);
            
        } catch (Exception e) {
            System.out.println("Error al cargar properties");
        }
        try (InputStream urlPropsEng = new FileInputStream("src/utils/english.properties")) {
            propsEng.load(urlPropsEng);
            
            System.out.println(cierre_sesion);

        } catch (Exception e) {
            System.out.println("Error al cargar properties");
        }
    }
    //Seleccionar properties
    public static void seleccion_properties(Properties props){
        // Menus 
     menu_seleccion_inicio = props.getProperty("menu_seleccion_inicio");
     menu_ajustes = props.getProperty("menu_ajustes");
     menu_factura = props.getProperty("menu_factura");
     cierre_sesion = props.getProperty("cierre_sesion");
    
    // Errores
     error = props.getProperty("error");
     error_seleccion = props.getProperty("error_seleccion");
     error_cambio_dir = props.getProperty("error_cambio_dir");
     error_dir_no_existe = props.getProperty("error_dir_no_existe");
     error_dir_no_archivos = props.getProperty("error_dir_no_archivos");
     error_dir_no_ajustado = props.getProperty("error_dir_no_ajustado");
     error_guardar_factura = props.getProperty("error_guardar_factura");
    
    // IA
    // IA General
     accion = props.getProperty("accion");
     listado_de = props.getProperty("listado_de ");
     numero_de = props.getProperty("numero_de");
     tamanio_lista = props.getProperty("tamanio_lista");
    // IA Aliens
     pregunta_aliens = props.getProperty("pregunta_aliens ");
    // IA Distancia
     pregunta_distancia = props.getProperty("pregunta_distancia");
     respuesta_distancia = props.getProperty("respuesta_distancia");
     anios_luz = props.getProperty("anios_luz");
    // IA Duracion
     duracion_mision = props.getProperty("duracion_mision");
     dias = props.getProperty("dias");
    // IA Coste
     coste_mision = props.getProperty("coste_mision");
    // IA Personas
     cuantos_soldados = props.getProperty("cuantos_soldados");
     cuantos_mineros = props.getProperty("cuantos_mineros");
    
    // Configuracion
     intro_directorio = props.getProperty("intro_directorio");
     dir_enlazado = props.getProperty("dir_enlazado");
    
    //Aliens
     alien_come = props.getProperty("alien_come");
     alien_duerme = props.getProperty("alien_duerme");
     alien_ataca = props.getProperty("alien_ataca");
    
    // Mascotas
     mascota_come = props.getProperty("mascota_come");
     mascota_duerme = props.getProperty("mascota_duerme");
     str_amo = props.getProperty("str_amo");
     codigo_mascota = props.getProperty("codigo_mascota");
     str_raza = props.getProperty("str_raza");
     str_edad = props.getProperty("str_edad");
    // Gato
     maullar = props.getProperty("maullar");
     ronronear = props.getProperty("ronronear");
     gato_nombre = props.getProperty("gato_nombre");
     str_color = props.getProperty("str_color");
     str_pelo = props.getProperty("str_pelo");
    // Pajaro
     piar = props.getProperty("piar");
     vuela = props.getProperty("vuela");
     no_vuela = props.getProperty("no_vuela");
     str_pajaro = props.getProperty("str_pajaro");
     str_especie = props.getProperty("str_especie");
    // Perro
     ladrar = props.getProperty("ladrar");
     jugar = props.getProperty("jugar");
     perro_nombre = props.getProperty("perro_nombre");
     str_peso = props.getProperty("str_peso");
     str_tamanio = props.getProperty("str_tamanio");
    
    //Personas
     str_minero = props.getProperty("str_minero");
     str_soldado = props.getProperty("str_soldado");
     persona_nombre = props.getProperty("persona_nombre");
     apellidos = props.getProperty("apellidos");
     persona_edad = props.getProperty("persona_edad");
     rango_general = props.getProperty("rango_general");
     rango_coronel = props.getProperty("rango_coronel");
     rango_capitan = props.getProperty("rango_capitan");
     rango_sargento = props.getProperty("rango_sargento");
     rango_tropa = props.getProperty("rango_tropa");
    
    // Prefijo odigo
     pf_turbojet = props.getProperty("pf_turbojet");
     pf_minero = props.getProperty("pf_minero");
     pf_soldado = props.getProperty("pf_soldado");
     pf_mascota = props.getProperty("pf_mascota");
     pf_alien = props.getProperty("pf_alien");
     pf_aerocar = props.getProperty("pf_aerocar");

    // Factura
     str_coste_mision = props.getProperty("");
     str_personas_coste = props.getProperty("str_personas_coste");
     yurs = props.getProperty("yurs");
     coste_minero = props.getProperty("coste_minero");
     coste_soldado = props.getProperty("coste_soldado");
     coste_vehiculos = props.getProperty("coste_vehiculos");
     coste_aliens = props.getProperty("coste_aliens");
     fac_guardada = props.getProperty("fac_guardada");
    }
    
    //Menu cambio de idioma
    public static void cambiar_idioma() {
        cargarProperties();
        System.out.println("Elige un idioma:\n 1.Espanol\n 2.English");
        String seleccion = intro.nextLine();
        switch (seleccion) {
            case "1" -> {
                System.out.println("Idioma cambiado a Espanol");
                seleccion_properties(propsEsp);

            }
            case "2" -> {
                System.out.println("Language changed to English");
                seleccion_properties(propsEng);
            }
            default -> System.out.println(error_seleccion);
        }
    }
}
