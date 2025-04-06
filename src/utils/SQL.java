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

    public static Pala objetoP;
    public static Martillo objetoM;
    public static Ciberexcavadora objetoCE;
    public static Cibercompresor objetoCC;
    
    public static void datos(String palabra) {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql:" + "//localhost:3306/zeroatmosfera", "lopez", "zero");

            Statement s = conexion.createStatement();

            switch (palabra) {
                case "volcar" -> {
                    for (Herramienta item : main.IA_GASTON.listHerramientas) {
                        if (item instanceof Ciberexcavadora) {
                            s.executeUpdate("INSERT INTO Ciberexcavadora (codigo, proteccion, consumo, traccion) "
                                    + "VALUES ('" + item.getCodigo() + "'," + item.getProteccion() + "," + ((Ciberexcavadora) item).getConsumo() + ",'" + ((Ciberexcavadora) item).getTraccion() + "');");
                        }
                        if (item instanceof Martillo) {
                            s.executeUpdate("INSERT INTO Martillo (codigo, proteccion, consumo, sujecion) "
                                    + "VALUES ('" + item.getCodigo() + "'," + item.getProteccion() + "," + ((Martillo) item).getConsumo() + ",'" + ((Martillo) item).getSujecion() + "');");
                        }
                        if (item instanceof Pala) {
                            s.executeUpdate("INSERT INTO Pala (codigo, proteccion, long_mango, metal) "
                                    + "VALUES ('" + item.getCodigo() + "'," + item.getProteccion() + "," + ((Pala) item).getLongMango() + ",'" + ((Pala) item).getMetal() + "');");
                        }
                        if (item instanceof Cibercompresor) {
                            s.executeUpdate("INSERT INTO Cibercompresor (codigo, proteccion, consumo, traccion) "
                                    + "VALUES ('" + item.getCodigo() + "'," + item.getProteccion() + "," + ((Cibercompresor) item).getConsumo() + ",'" + ((Cibercompresor) item).getTraccion() + "');");
                        }
                    }
                }
                
                case "borrar" ->{
                    s.executeUpdate("TRUNCATE TABLE martillo");
                    s.executeUpdate("TRUNCATE TABLE pala");
                    s.executeUpdate("TRUNCATE TABLE cibercompresor");
                    s.executeUpdate("TRUNCATE TABLE ciberexcavadora");
                }
                
                case "cambiar-compresor" ->{
                    s.executeUpdate("UPDATE cibercompresor SET "
                            + "proteccion =  "+objetoCC.getProteccion()+", "
                            + "consumo = "+objetoCC.getConsumo()+", "
                            + "traccion =  ' "+objetoCC.getTraccion()+" ', "
                            + "Hora_creacion = CURRENT_TIMESTAMP "
                            + "WHERE Codigo = '"+objetoCC.getCodigo()+"';");
                }
                case "cambiar-excavadora" ->{
                    s.executeUpdate("UPDATE ciberexcavadora SET "
                            + "proteccion =  "+objetoCE.getProteccion()+", "
                            + "consumo = "+objetoCE.getConsumo()+", "
                            + "traccion =  ' "+objetoCE.getConsumo()+" ', "
                            + "Hora_creacion = CURRENT_TIMESTAMP "
                            + "WHERE Codigo = '"+objetoCE.getCodigo()+"';");
                }
                case "cambiar-martillo" ->{
                    s.executeUpdate("UPDATE martillo SET "
                            + "proteccion =  "+objetoM.getProteccion()+", "
                            + "consumo = "+objetoM.getConsumo()+", "
                            + "sujeccion =  ' "+objetoM.getSujecion()+" ', "
                            + "Hora_creacion = CURRENT_TIMESTAMP "
                            + "WHERE Codigo = '"+objetoM.getCodigo()+"';");
                }
                case "cambiar-pala" ->{
                    s.executeUpdate("UPDATE pala SET "
                            + "proteccion =  "+objetoP.getProteccion()+", "
                            + "metal = ' "+objetoP.getMetal()+" ', "
                            + "long_mango =  "+objetoP.getLongMango()+", "
                            + "Hora_creacion = CURRENT_TIMESTAMP "
                            + "WHERE Codigo = '"+objetoP.getCodigo()+"';");
                }
            }

            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
