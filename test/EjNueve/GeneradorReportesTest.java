package EjNueve;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class GeneradorReportesTest {

    private GeneradorReportes generador = new GeneradorReportes();

    @TestFactory
    Stream<DynamicTest> testGenerarReporte() {
        List<String> datos1 = Arrays.asList("Dato 1", "Dato 2", "Dato 3");
        List<String> datos2 = Arrays.asList("Uno", "Dos", "Tres");
        List<String> datos3 = Arrays.asList("Java", "JUnit", "Test");

        return Stream.of(
                dynamicTest("Reporte con datos 1", () -> {
                    String reporte = generador.generarReporte(datos1);
                    assertEquals("Reporte:\n- Dato 1\n- Dato 2\n- Dato 3\n", reporte);
                }),
                dynamicTest("Reporte con datos 2", () -> {
                    String reporte = generador.generarReporte(datos2);
                    assertEquals("Reporte:\n- Uno\n- Dos\n- Tres\n", reporte);
                }),
                dynamicTest("Reporte con datos 3", () -> {
                    String reporte = generador.generarReporte(datos3);
                    assertEquals("Reporte:\n- Java\n- JUnit\n- Test\n", reporte);
                })
        );
    }
}
