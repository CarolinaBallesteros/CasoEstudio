package propiedad.servicio;

import static dominio.propiedad.constantes.PropiedadConstantes.EL_TIPO_INMUEBLE_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.EL_VALOR_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_CEDULA_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_DIRECCION_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_ZONA_NO_PUEDE_ESTAR_VACIO;
import dominio.propiedad.dto.PropiedadDto;
import persistencia.propiedad.repositorio.IPropiedadRepositorio;
import dominio.propiedad.servicio.RegistarPropiedadServicio;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.propiedad.entidad.Propiedad;
import persistencia.propiedad.repositorio.PropiedadRepositorio;
import propiedad.databuilder.PropiedadBuilder;

public class RegistarPropiedadServicioTest {

    private RegistarPropiedadServicio registrarPropiedad;
    private IPropiedadRepositorio propiedadRepositorio;
    private static final String VARIABLE_VACIO = "";
    private String VARIABLE_NULL;
    private static final String EL_TEST_NO_VALIDO_EL_ASSERT = "El test no valido el assert";

    @Before
    public void init() {

        registrarPropiedad = new RegistarPropiedadServicio();
        propiedadRepositorio = PropiedadRepositorio.getUnicaInstancia();
    }

    @Test
    public void registrarPropiedadTipoCasa() throws Exception {

        //Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();

        //Act
        registrarPropiedad.ejecutar(propiedadDto);
        Propiedad resultado = propiedadRepositorio.obtenerPorCedulaPropietario(propiedadDto.getCedulaPropietario());

        //Assert
        assertEquals(propiedadDto.getCedulaPropietario(), resultado.getCedulaPropietario());

    }

    @Test
    public void noPuedeEstarVacioTipoInmueble() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setTipoInmueble(VARIABLE_VACIO);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TIPO_INMUEBLE_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarNullTipoInmueble() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setTipoInmueble(VARIABLE_NULL);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_TIPO_INMUEBLE_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarVacioZona() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setZona(VARIABLE_VACIO);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_ZONA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarNullZona() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setZona(VARIABLE_NULL);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_ZONA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarVacioDirrecion() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setDireccion(VARIABLE_VACIO);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_DIRECCION_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarNullDirrecion() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setDireccion(VARIABLE_NULL);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_DIRECCION_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarVacioValor() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setValor(0.0);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_VALOR_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarNullValor() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setValor(null);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(EL_VALOR_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarVacioCedulaPropietario() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setCedulaPropietario(VARIABLE_VACIO);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_CEDULA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

    @Test
    public void noPuedeEstarCedulaPropietario() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        propiedadDto.setCedulaPropietario(VARIABLE_NULL);

        try {
            // Act
            registrarPropiedad.ejecutar(propiedadDto);
            fail(EL_TEST_NO_VALIDO_EL_ASSERT);
        } catch (Exception exception) {

            // Assert
            assertEquals(LA_CEDULA_NO_PUEDE_ESTAR_VACIO, exception.getMessage());
        }

    }

}
