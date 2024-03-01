package EjTres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testValidarTexto_conTextoValido() {
        Validador validador = new Validador();
        assertDoesNotThrow(() -> validador.validarTexto("Texto válido"));
    }

    @Test
    public void testValidarTexto_conTextoNulo() {
        Validador validador = new Validador();
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(null));
        assertEquals("El texto no puede ser nulo ni vacío", exception.getMessage());
    }

    @Test
    public void testValidarTexto_conTextoVacio() {
        Validador validador = new Validador();
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(""));
        assertEquals("El texto no puede ser nulo ni vacío", exception.getMessage());
    }
}
