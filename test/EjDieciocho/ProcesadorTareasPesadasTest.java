package EjDieciocho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasPesadasTest {

    private final ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

    @Test
    void testRendimientoOperacionIntensiva() {
        long tiempoLimite = 1000;

        long inicio = System.currentTimeMillis();

        procesador.realizarOperacionIntensiva();

        long fin = System.currentTimeMillis();

        long duracion = fin - inicio;

        assertTrue(duracion <= tiempoLimite,
                "La operación intensiva tardó " + duracion + " milisegundos, excediendo el límite de " + tiempoLimite + " milisegundos.");
    }
}
