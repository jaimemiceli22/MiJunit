package EjDieciocho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasPesadasTest {

    private final ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

    @Test
    void testRendimientoOperacionIntensiva() {
        // Definir el límite de tiempo aceptable en milisegundos
        long tiempoLimite = 1000; // 1 segundo

        // Obtener el tiempo de inicio
        long inicio = System.currentTimeMillis();

        // Ejecutar la operación intensiva
        procesador.realizarOperacionIntensiva();

        // Obtener el tiempo de finalización
        long fin = System.currentTimeMillis();

        // Calcular la duración de la operación en milisegundos
        long duracion = fin - inicio;

        // Verificar que la duración esté dentro del límite aceptable
        assertTrue(duracion <= tiempoLimite,
                "La operación intensiva tardó " + duracion + " milisegundos, excediendo el límite de " + tiempoLimite + " milisegundos.");
    }
}
