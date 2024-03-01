package EjCatorce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFinancieraTest {

    private static final double DELTA = 0.0001;

    @Test
    void calcularInteresCompuesto_DeberiaCalcularCorrectamente() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double principal = 1000;
        double tasaInteres = 0.05;
        int numeroCompuestos = 12;
        int años = 5;
        double resultadoEsperado = 1000 * Math.pow(1 + (0.05 / 12), 12 * 5);
        assertEquals(resultadoEsperado, calculadora.calcularInteresCompuesto(principal, tasaInteres, numeroCompuestos, años), DELTA);
    }

    @Test
    void calcularVPN_DeberiaCalcularCorrectamente() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double tasaDescuento = 0.1;
        double[] flujosCaja = {-1000, 100, 200, 300, 400, 500};
        double resultadoEsperado = -1000 + (100 / Math.pow(1 + tasaDescuento, 1)) + (200 / Math.pow(1 + tasaDescuento, 2))
                + (300 / Math.pow(1 + tasaDescuento, 3)) + (400 / Math.pow(1 + tasaDescuento, 4)) + (500 / Math.pow(1 + tasaDescuento, 5));
        assertEquals(resultadoEsperado, calculadora.calcularVPN(tasaDescuento, flujosCaja), DELTA);
    }
}
