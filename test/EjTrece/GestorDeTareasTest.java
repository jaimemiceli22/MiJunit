package EjTrece;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {
    private GestorDeTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDeTareas();
    }

    @Nested
    class AgregarTareaTest {
        @Test
        void deberiaAgregarTareaCorrectamente() {
            gestor.agregarTarea("1", "Tarea 1");
            assertEquals("Tarea 1", gestor.buscarTareaPorId("1").orElse(null));
        }
    }

    @Nested
    class EliminarTareaTest {
        @Test
        void deberiaEliminarTareaExistente() {
            gestor.agregarTarea("1", "Tarea 1");
            assertTrue(gestor.eliminarTarea("1"));
            assertFalse(gestor.buscarTareaPorId("1").isPresent());
        }

        @Test
        void deberiaDevolverFalseParaTareaNoExistente() {
            assertFalse(gestor.eliminarTarea("2"));
        }
    }

    @Nested
    class BuscarTareaPorIdTest {
        @Test
        void deberiaDevolverDescripcionDeTareaExistente() {
            gestor.agregarTarea("1", "Tarea 1");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea 1", descripcion.get());
        }

        @Test
        void deberiaDevolverOptionalVacioParaTareaNoExistente() {
            Optional<String> descripcion = gestor.buscarTareaPorId("2");
            assertFalse(descripcion.isPresent());
        }
    }
}
