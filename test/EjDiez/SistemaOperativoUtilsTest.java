package EjDiez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaOperativoUtilsTest {

    @Test
    void testFuncionalidadSoloEnWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());

        // Aquí va el código de la prueba que solo se ejecutará en Windows
        // Por ejemplo:
        String nombreSO = SistemaOperativoUtils.obtenerNombreSO();
        assertTrue(nombreSO.toLowerCase().contains("win"));
    }

    // Otros casos de prueba que no tienen condiciones
    // ...
}
