package EjDieciseis;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GeneradorNumerosTest {

    private final GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void generarNumeroAleatorioEnRango_NumeroEnRango() {
        // Arrange
        int min = 0;
        int max = 1000;

        int numeroAleatorio = generador.generarNumeroAleatorioEnRango(min, max);

        assertTrue(numeroAleatorio >= min && numeroAleatorio <= max);
    }

    @Test
    void esPar_NumeroPar() {

        int numeroPar = generador.generarNumeroAleatorioEnRango(0, 1000) * 2;

        boolean resultado = generador.esPar(numeroPar);

        assertTrue(resultado);
    }

    @Test
    void esPar_NumeroImpar() {
        int numeroImpar = generador.generarNumeroAleatorioEnRango(0, 1000) * 2 + 1;

        boolean resultado = generador.esPar(numeroImpar);

        assertFalse(resultado);
    }
}
