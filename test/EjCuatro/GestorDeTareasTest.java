package EjCuatro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorDeTareasTest {
    private GestorDeTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        // Agregar algunas tareas predeterminadas
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
    }

    @AfterEach
    public void tearDown() {
        // Limpiar las tareas después de cada prueba
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTarea() {
        // Verificar que las tareas se agreguen correctamente
        assertEquals(2, gestor.obtenerTareas().size());
        assertTrue(gestor.obtenerTareas().contains("Tarea 1"));
        assertTrue(gestor.obtenerTareas().contains("Tarea 2"));

        // Agregar una nueva tarea y verificar que se agregue correctamente
        gestor.agregarTarea("Tarea 3");
        assertEquals(3, gestor.obtenerTareas().size());
        assertTrue(gestor.obtenerTareas().contains("Tarea 3"));
    }

    @Test
    public void testEliminarTarea() {
        // Verificar que se elimine una tarea existente
        assertTrue(gestor.eliminarTarea("Tarea 1"));
        assertEquals(1, gestor.obtenerTareas().size());
        assertFalse(gestor.obtenerTareas().contains("Tarea 1"));

        // Verificar que no se elimine una tarea inexistente
        assertFalse(gestor.eliminarTarea("Tarea Inexistente"));
        assertEquals(1, gestor.obtenerTareas().size());
    }
}
