package EjQuince;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorAccesoTest {

    private ControladorAcceso controlador;

    @Test
    void verificarAcceso_AdminTieneAccesoATodo() {
        // Arrange
        controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("adminUser", "ADMIN");

        // Act & Assert
        assertTrue(controlador.verificarAcceso("adminUser", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("adminUser", "CONSULTA"));
        assertTrue(controlador.verificarAcceso("adminUser", "EDICION"));
    }

    @Test
    void verificarAcceso_EditorNoPuedeGestionarUsuarios() {
        // Arrange
        controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("editorUser", "EDITOR");

        // Act & Assert
        assertFalse(controlador.verificarAcceso("editorUser", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("editorUser", "CONSULTA"));
        assertTrue(controlador.verificarAcceso("editorUser", "EDICION"));
    }

    @Test
    void verificarAcceso_VisitanteSoloPuedeConsultar() {
        // Arrange
        controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("visitorUser", "VISITANTE");

        // Act & Assert
        assertFalse(controlador.verificarAcceso("visitorUser", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("visitorUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitorUser", "EDICION"));
    }

    @Test
    void verificarAcceso_UsuarioSinRolAsignado_NoTieneAcceso() {
        // Arrange
        controlador = new ControladorAcceso();

        // Act & Assert
        assertFalse(controlador.verificarAcceso("unassignedUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("unassignedUser", "GESTION_USUARIOS"));
        assertFalse(controlador.verificarAcceso("unassignedUser", "EDICION"));
    }

    @Test
    void verificarAcceso_UsuarioConRolDesconocido_NoTieneAcceso() {
        // Arrange
        controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("unknownUser", "UNKNOWN_ROLE");

        // Act & Assert
        assertFalse(controlador.verificarAcceso("unknownUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("unknownUser", "GESTION_USUARIOS"));
        assertFalse(controlador.verificarAcceso("unknownUser", "EDICION"));
    }
}
