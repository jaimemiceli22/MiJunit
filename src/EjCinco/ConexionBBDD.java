package EjCinco;

import java.sql.*;

public class ConexionBBDD {
    private static ResultSet rs;
    private static Connection conexion;
    private static Statement sentenciaSQL;

    public static Connection conectarBaseDeDatos() {
        conexion = null;
        try {
            // Conectar con la base de datos
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/datos", "root", ""); // Proporcionamos la dirección, el administrador y la clave
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }
    public static void desconectarBaseDeDatos() {
        try {
            conexion.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejecutarConsultaUpdate(String consulta) {
        conexion = conectarBaseDeDatos();
        sentenciaSQL = null;

        try {
            sentenciaSQL = conexion.createStatement();
            sentenciaSQL.executeUpdate(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectarBaseDeDatos();
        }
    }
    public static ResultSet ejecutarConsultaSelect(String consulta) {
        conexion = conectarBaseDeDatos();
        sentenciaSQL = null;
        rs = null;

        try {
            sentenciaSQL = conexion.createStatement();
            rs = sentenciaSQL.executeQuery(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } //Se necesita cerrar al usarlo.
        return rs;
    }

}
