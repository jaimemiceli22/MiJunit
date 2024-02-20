package EjDos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-1, calc.sumar(-3, 2));
        assertEquals(0, calc.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(-5, calc.restar(-3, 2));
        assertEquals(0, calc.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-6, calc.multiplicar(-2, 3));
        assertEquals(0, calc.multiplicar(0, 0));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.dividir(5, 2));
        assertEquals(-2, calc.dividir(-6, 3));
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
