package EjOcho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    private ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.5, 10.3, -5.0, 0.0})
    void testCelsiusAFahrenheit(double celsius) {
        double resultado = conversor.celsiusAFahrenheit(celsius);
        double esperado = (celsius * 9 / 5) + 32;
        assertEquals(esperado, resultado, 0.0001); // Usamos delta para manejar errores de redondeo
    }

    @ParameterizedTest
    @ValueSource(doubles = {32.0, 50.0, 68.0, 90.0, 100.0})
    void testFahrenheitACelsius(double fahrenheit) {
        double resultado = conversor.fahrenheitACelsius(fahrenheit);
        double esperado = (fahrenheit - 32) * 5 / 9;
        assertEquals(esperado, resultado, 0.0001); // Usamos delta para manejar errores de redondeo
    }
}
