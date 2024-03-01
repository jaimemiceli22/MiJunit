package EjVeinte;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
//jaime perez miceli

public class GestorProductosTest {

    GestorProductos gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorProductos();
    }

    @Nested
    class AgregarProductoTests {

        @Test
        void agregarProducto_DeberiaAgregarProductoCuandoNombreValidoYPrecioPositivo() {
            assertTrue(gestor.agregarProducto("Producto1", 10.0));
            assertEquals(10.0, gestor.obtenerPrecio("Producto1"));
        }

        @Test
        void agregarProducto_NoDeberiaAgregarProductoCuandoNombreNulo() {
            assertFalse(gestor.agregarProducto(null, 10.0));
            assertEquals(0, gestor.productos.size());
        }

        @Test
        void agregarProducto_NoDeberiaAgregarProductoCuandoNombreVacio() {
            assertFalse(gestor.agregarProducto("", 10.0));
            assertEquals(0, gestor.productos.size());
        }

        @Test
        void agregarProducto_NoDeberiaAgregarProductoCuandoPrecioNegativo() {
            assertFalse(gestor.agregarProducto("Producto2", -5.0));
            assertEquals(0, gestor.productos.size());
        }
    }

    @Nested
    class EliminarProductoTests {

        @Test
        void eliminarProducto_DeberiaEliminarProductoExistente() {
            gestor.agregarProducto("Producto1", 10.0);
            assertTrue(gestor.eliminarProducto("Producto1"));
            assertNull(gestor.obtenerPrecio("Producto1"));
        }

        @Test
        void eliminarProducto_NoDeberiaEliminarProductoInexistente() {
            assertFalse(gestor.eliminarProducto("ProductoInexistente"));
        }
    }
}
