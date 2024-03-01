package EjDiez;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaOperativoUtilsTest {

    @Test
    void testFuncionalidadSoloEnWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());

        String nombreSO = SistemaOperativoUtils.obtenerNombreSO();
        assertTrue(nombreSO.toLowerCase().contains("win"));
    }
}
