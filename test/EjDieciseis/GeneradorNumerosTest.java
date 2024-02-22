package EjDieciseis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {

    private final GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void generarNumeroAleatorioEnRango_NumeroEnRango() {
        // Arrange
        int min = 0;
        int max = 1000;

        // Act
        int numeroAleatorio = generador.generarNumeroAleatorioEnRango(min, max);

        // Assert
        assertTrue(numeroAleatorio >= min && numeroAleatorio <= max);
    }

    @Test
    void esPar_NumeroPar() {
        // Arrange
        int numeroPar = generador.generarNumeroAleatorioEnRango(0, 1000) * 2;

        // Act
        boolean resultado = generador.esPar(numeroPar);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void esPar_NumeroImpar() {
        // Arrange
        int numeroImpar = generador.generarNumeroAleatorioEnRango(0, 1000) * 2 + 1;

        // Act
        boolean resultado = generador.esPar(numeroImpar);

        // Assert
        assertFalse(resultado);
    }
}
