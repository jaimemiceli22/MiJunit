package EjUno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjUnoTest {

    @Test
    void test(){
        EjUno uno = new EjUno("Hola");
        assertEquals("Hola", uno.getTexto());


    }

}