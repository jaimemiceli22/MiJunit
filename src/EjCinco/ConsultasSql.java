package EjCinco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasSql {



    public static ArrayList<Persona> insertarPersonas() {
        try {
            ResultSet rs;
            int id;
            String nombre;
            int edad;
            ArrayList<Persona> arrayPersona = new ArrayList<>();

            rs = ConexionBBDD.ejecutarConsultaSelect("Select id_persona, nombre_persona, edad_persona from persona");

            while (rs.next()) {
                id = rs.getInt("id_persona");
                nombre = rs.getString("nombre_persona");
                edad = rs.getInt("edad_persona");
                Persona persona = new Persona(id, nombre, edad);
                arrayPersona.add(persona);
            }

            return arrayPersona;
        } catch (SQLException e) {
            throw new RuntimeException("Error al ejecutar la consulta SQL", e);
        } finally {
            ConexionBBDD.desconectarBaseDeDatos();
        }
    }
    public static void insertarPersona(Persona persona){
        ResultSet rs;
        try{
            ConexionBBDD.ejecutarConsultaUpdate("INSERT INTO persona (nombre_persona, edad_persona) VALUES ('" + persona.getNombre_persona() + "', " + persona.getEdad_persona() + ")");

        }catch (Exception e) {

        } finally {
            ConexionBBDD.desconectarBaseDeDatos();
        }
    }



}
