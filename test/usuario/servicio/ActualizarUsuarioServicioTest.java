package usuario.servicio;

import static dominio.usuario.constantes.UsuarioConstantes.ARRENDATARIO;
import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.servicio.ActualizarUsuarioServicio;
import dominio.usuario.servicio.ObtenerUsuarioServicio;
import dominio.usuario.servicio.RegistrarUsuarioServicio;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import persistencia.usuario.repositorio.IUsuarioRepositorio;
import usuario.databuilder.UsuarioBuilder;

public class ActualizarUsuarioServicioTest {

    private static final String TELEFONO_ACTUALIZADO = "313";
    private static final String APELLIDO_ACTUALIZADO = "Duran";
    private static final String NOMBRE_ACTUALIZADO = "Leidy";

    private ActualizarUsuarioServicio actualizarUsuarioServicio;
    private IUsuarioRepositorio usuarioRepositorio;
    private RegistrarUsuarioServicio registrarUsuario;
    private ObtenerUsuarioServicio obtenerUsuarioServicio;

    @Before
    public void init() {
        registrarUsuario = new RegistrarUsuarioServicio();
        actualizarUsuarioServicio = new ActualizarUsuarioServicio();
        obtenerUsuarioServicio = new ObtenerUsuarioServicio();
    }

    @Test
    public void actualizarUsuario() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        registrarUsuario.ejecutar(usuarioDto);
        UsuarioDto usuarioActualizar = obtenerUsuarioServicio.ejecutar(usuarioDto.getCedula());
        usuarioActualizar.setNombre(NOMBRE_ACTUALIZADO);
        usuarioActualizar.setApellido(APELLIDO_ACTUALIZADO);
        usuarioActualizar.setTelefono(TELEFONO_ACTUALIZADO);
        usuarioActualizar.setTipoUsuario(ARRENDATARIO);

        // Act
        actualizarUsuarioServicio.ejecutar(usuarioActualizar);
        UsuarioDto usuarioActualizado = obtenerUsuarioServicio.ejecutar(usuarioDto.getCedula());

        // Assert
        assertEquals(NOMBRE_ACTUALIZADO, usuarioActualizado.getNombre());
        assertEquals(APELLIDO_ACTUALIZADO, usuarioActualizado.getApellido());
        assertEquals(TELEFONO_ACTUALIZADO, usuarioActualizado.getTelefono());
        assertEquals(ARRENDATARIO, usuarioActualizado.getTipoUsuario());

    }

}
