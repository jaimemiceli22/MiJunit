package EjDos;

public class Calculadora {
    /**
     * Suma dos números enteros.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return La diferencia entre a y b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return El producto de a y b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return El cociente de a y b.
     * @throws ArithmeticException si b es 0.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
