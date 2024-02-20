package EjSeis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    @Test
    void testRaizCuadrada() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        double resultado = calculadora.raizCuadrada(16);
        assertEquals(4, resultado);
    }

    @Test
    @Disabled("Implementación pendiente o en revisión")
    void testLogaritmoNatural() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        double resultado = calculadora.logaritmoNatural(10);
        assertEquals(2.302585092994046, resultado);
    }

    @Test
    void testFactorial() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        long resultado = calculadora.factorial(5);
        assertEquals(120, resultado);
    }
}
