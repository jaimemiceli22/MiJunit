package EjCinco;

public class Persona {
    private int id_persona;
    private String nombre_persona;
    private int edad_persona;

    public Persona(int id_persona, String nombre_persona, int edad_persona) {
        this.id_persona = id_persona;
        this.nombre_persona = nombre_persona;
        this.edad_persona = edad_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public int getEdad_persona() {
        return edad_persona;
    }

    public void setEdad_persona(int edad_persona) {
        this.edad_persona = edad_persona;
    }

    @Override
    public String toString() {
        return "{" +
                "id_persona=" + id_persona +
                ", nombre_persona='" + nombre_persona + '\'' +
                ", edad_persona=" + edad_persona +
                '}';
    }
}
