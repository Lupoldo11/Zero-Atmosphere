package utils;

/**
 *
 * @author Lupoldo
 */
import herramientas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

    public static void volcar_datos() {

        int contador = 0;
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql:" + "//localhost:3306/zeroatmosfera", "lopez", "zero");

            Statement s = conexion.createStatement();

            for (Herramienta item : main.IA_GASTON.listHerramientas) {
                if (item instanceof Ciberexcavadora) {
                    s.executeUpdate("INSERT INTO prueba (Codigo, Objeto_bin) VALUES ('A123', UNHEX();");
                }
                if (item instanceof Martillo) {
                    s.executeUpdate("INSERT INTO prueba (Codigo, Objeto_bin) VALUES ('A123', UNHEX();");
                }
                if (item instanceof Pala) {
                    s.executeUpdate("INSERT INTO prueba (Codigo, Objeto_bin) VALUES ('A123', UNHEX();");
                }
                if (item instanceof Cibercompresor) {
                    s.executeUpdate("INSERT INTO prueba (Codigo, Objeto_bin) VALUES ('A123', UNHEX();");
                }
                contador++;
            }
            conexion.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
