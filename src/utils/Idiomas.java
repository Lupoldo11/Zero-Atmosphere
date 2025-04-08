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

    //Menu cambio de idioma
    public static void cambiar_idioma() {
        cargarProperties();
        System.out.println(Text.menu_idioma);
        String seleccion = intro.nextLine();
        switch (seleccion) {
            case "1" -> {
                System.out.println(Text.cambio_espanol);
                seleccion_properties(propsEsp);

            }
            case "2" -> {
                System.out.println(Text.cambio_ingles);
                seleccion_properties(propsEng);
            }
            default ->
                System.out.println(error_seleccion);
        }
    }

    // Crear y cargar properties
    static Properties propsEng = new Properties(); //Crear propertie
    static Properties propsEsp = new Properties();

    public static void cargarProperties() {
        try (InputStream urlPropsEsp = new FileInputStream("src/utils/espanol.properties")) {
            propsEsp.load(urlPropsEsp);

        } catch (Exception e) {
            System.out.println(Text.cambio_ingles);
        }
        try (InputStream urlPropsEng = new FileInputStream("src/utils/english.properties")) {
            propsEng.load(urlPropsEng);

            System.out.println(cierre_sesion);

        } catch (Exception e) {
            System.out.println(Text.cambio_ingles);
        }
    }

    //Seleccionar properties
    public static void seleccion_properties(Properties props) {

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
        error_valor_invalido = props.getProperty("error_valor_invalido");
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
        
        opcion_herramientas = props.getProperty("opcion_herramientas");
        opcion_nube = props.getProperty("opcion_nube");
                
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
        pf_herramienta = props.getProperty("pf_herramienta");

        // Factura
        str_coste_mision = props.getProperty("");
        str_personas_coste = props.getProperty("str_personas_coste");
        yurs = props.getProperty("yurs");
        coste_minero = props.getProperty("coste_minero");
        coste_soldado = props.getProperty("coste_soldado");
        coste_vehiculos = props.getProperty("coste_vehiculos");
        coste_aliens = props.getProperty("coste_aliens");
        fac_guardada = props.getProperty("fac_guardada");
        
        // Vehiculos
        arranca = props.getProperty("arranca");
        apagado = props.getProperty("apagado");
        bike = props.getProperty("bike");
        tripulantes = props.getProperty("tripulantes");
        deposito_lleno = props.getProperty("deposito_lleno");
        demasiada_gasolina = props.getProperty("demasiada_gasolina");
        str_estado_deposito = props.getProperty("str_estado_deposito");
        gasolina_falta = props.getProperty("gasolina_falta");
        car = props.getProperty("car");
        marca = props.getProperty("marca");
        turbojet = props.getProperty("turbojet");
        potencia = props.getProperty("potencia");
        str_gasto_carburante = props.getProperty("str_gasto_carburante");
        str_codigo = props.getProperty("str_codigo");
         economico = props.getProperty("economico");
        estelar = props.getProperty("estelar");
        vehiculo_tj = props.getProperty("vehiculo_tj");
        vehiculos_usados = props.getProperty("vehiculos_usados");
        
        //Herramientas
        compresor = props.getProperty("compresor");
        excavadora = props.getProperty("excavadora");
        martillo = props.getProperty("martillo");
        pala = props.getProperty("pala");
        metal_puro = props.getProperty("metal_puro");
        metal_aleacion = props.getProperty("metal_aleacion");
        sujecion_manual = props.getProperty("sujecion_manual");
        sujecion_correa = props.getProperty("sujecion_correa");
        traccion_ruedas = props.getProperty("traccion_ruedas");
        traccion_oruga = props.getProperty("traccion_oruga");
        pregunta_consumo = props.getProperty("pregunta_consumo");
        menu_metal = props.getProperty("menu_metal");
        modificar_atributo = props.getProperty("modificar_atributo");
        error_cambiar_codigo = props.getProperty("error_cambiar_codigo");
        proteccion = props.getProperty("proteccion");
        consumo = props.getProperty("consumo");
        traccion = props.getProperty("traccion");
        pregunta_proteccion = props.getProperty("pregunta_proteccion");
        pregunta_mango = props.getProperty("pregunta_mango");
        metal = props.getProperty("metal");
        longitud = props.getProperty("longitud");
        sujecion  = props.getProperty("sujecion");
        menu_traccion = props.getProperty("menu_traccion");
        
        //IA_ANTIA
        menu_modificar = props.getProperty("menu_modificar");
        pregunta_codigo = props.getProperty("pregunta_codigo");
        seguir_modificando  = props.getProperty("seguir_modificando");
        herramientas_anadidas = props.getProperty("herramientas_anadidas");
        
        //IA_GASTON
        menu_ia_gaston = props.getProperty("menu_ia_gaston");
        borrar_datos_bbdd = props.getProperty("borrar_datos_bbdd");
        menu_herramientas  = props.getProperty("menu_herramientas");
        modificar_herramienta = props.getProperty("modificar_herramienta");
        
        //Idiomas
        menu_idioma = props.getProperty("menu_idioman");
        cambio_espanol = props.getProperty("cambio_espanol");
        cambio_ingles  = props.getProperty("cambio_ingles");
    }
}
