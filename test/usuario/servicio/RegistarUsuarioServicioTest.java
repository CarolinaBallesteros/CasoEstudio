package usuario.servicio;

import static dominio.usuario.constantes.UsuarioConstantes.ARRENDATARIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_APELLIDO_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_CEDULA_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_NOMBRE_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_TELEFONO_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_TIPO_USUARIO_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.PROPIETARIO;
import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.servicio.RegistrarUsuarioServicio;
import persistencia.usuario.entidad.Usuario;
import persistencia.usuario.repositorio.IUsuarioRepositorio;
import persistencia.usuario.repositorio.UsuarioRepositorio;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import usuario.databuilder.UsuarioBuilder;

public class RegistarUsuarioServicioTest {

    private RegistrarUsuarioServicio registrarUsuario;
    private IUsuarioRepositorio usuarioRepositorio;
    private static final String VARIABLE_VACIO = "";
    private String VARIABLE_NULL;
    private static final String EL_TEST_NO_VALIDO_EL_ASSERT = "El test no valido el assert";

    @Before
    public void init() {
        registrarUsuario = new RegistrarUsuarioServicio();
        usuarioRepositorio = UsuarioRepositorio.getUnicaInstancia();
    }

    @Test
    public void registrarUsuarioTipoArrendatario() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioArrendatario();

        // Act
        registrarUsuario.ejecutar(usuarioDto);
        Usuario resultado = usuarioRepositorio.obtenerPorCedula(usuarioDto.getCedula());

        // Assert
        assertEquals(usuarioDto.getCedula(), resultado.getCedula());
        assertEquals(ARRENDATARIO, resultado.getTipoUsuario());

    }

    @Test
    public void registrarUsuarioTipoPropietario() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();

        // Act
        registrarUsuario.ejecutar(usuarioDto);
        Usuario resultado = usuarioRepositorio.obtenerPorCedula(usuarioDto.getCedula());

        // Assert
        assertEquals(usuarioDto.getCedula(), resultado.getCedula());
        assertEquals(PROPIETARIO, resultado.getTipoUsuario());

    }

    @Test
    public void noPuedeEstarVacioNombre() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setNombre(VARIABLE_VACIO);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_NOMBRE_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarNullNombre() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setNombre(VARIABLE_NULL);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_NOMBRE_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarVacioApellido() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setApellido(VARIABLE_VACIO);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_APELLIDO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarNullApellido() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setApellido(VARIABLE_NULL);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_APELLIDO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarVacioTelefono() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setTelefono(VARIABLE_VACIO);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TELEFONO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarNullTelefono() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setTelefono(VARIABLE_NULL);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TELEFONO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarVacioCedula() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setCedula(VARIABLE_VACIO);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_CEDULA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarNullCedula() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setCedula(VARIABLE_NULL);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_CEDULA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarVacioTipoUsuario() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setTipoUsuario(VARIABLE_VACIO);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TIPO_USUARIO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }

    @Test
    public void noPuedeEstarNullTipoUsuario() throws Exception {

        // Arrange
        UsuarioDto usuarioDto = new UsuarioBuilder().tipoUsuarioPropietario();
        usuarioDto.setTipoUsuario(VARIABLE_NULL);

        try {
            // Act
            registrarUsuario.ejecutar(usuarioDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TIPO_USUARIO_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }
    }    
    
}
