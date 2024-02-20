package EjSiete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class ProcesadorTareasTest {

    private ProcesadorTareas procesadorTareas = new ProcesadorTareas();

    @Test
    void pruebaEjecutarTareaLarga() {
        // Especificamos un tiempo máximo de 1000 milisegundos (1 segundo)
        assertTimeout(Duration.ofMillis(1000), () -> {
            procesadorTareas.ejecutarTareaLarga(2000); // Simulamos una tarea que debería tardar más de 1 segundo
        });
    }
    @Test
    void pruebaEjecutarTareaCorta() {
        // Especificamos un tiempo máximo de 1000 milisegundos (1 segundo)
        assertTimeout(Duration.ofMillis(1000), () -> {
            procesadorTareas.ejecutarTareaLarga(900); // Simulamos una tarea que debería tardar más de 1 segundo
        });
    }
}
