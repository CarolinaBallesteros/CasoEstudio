package propiedad.servicio;

import dominio.propiedad.dto.PropiedadDto;
import dominio.propiedad.servicio.ActualizarPropiedadServicio;
import dominio.propiedad.servicio.ObtenerPropiedadPorCedulaPropietario;
import dominio.propiedad.servicio.RegistarPropiedadServicio;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import propiedad.databuilder.PropiedadBuilder;

public class ActualizarPropiedadServicioTest {

    private ActualizarPropiedadServicio actualizarPropiedadServicio;
    private ObtenerPropiedadPorCedulaPropietario obtenerPropiedadPorCedulaPropietario;
    private RegistarPropiedadServicio registrarPropiedad;

    private static final String ZONA_ACTUALIZADA = "Zona Actualizada";
    private static final String DIRECCION_ACTUALIZADA = "Dirección Actualizada";

    @Before
    public void init() {
        actualizarPropiedadServicio = new ActualizarPropiedadServicio();
        obtenerPropiedadPorCedulaPropietario = new ObtenerPropiedadPorCedulaPropietario();
        registrarPropiedad = new RegistarPropiedadServicio();
    }

    @Test
    public void actualizarPropiedad() throws Exception {

        // Arrange
        PropiedadDto propiedadDto = new PropiedadBuilder().casa();
        registrarPropiedad.ejecutar(propiedadDto);
        PropiedadDto propiedadActualizar = obtenerPropiedadPorCedulaPropietario.ejecutar(propiedadDto.getCedulaPropietario());
        propiedadActualizar.setDireccion(DIRECCION_ACTUALIZADA);
        propiedadActualizar.setZona(ZONA_ACTUALIZADA);

        // Act
        actualizarPropiedadServicio.ejecutar(propiedadActualizar);
        PropiedadDto propiedadActualizada = obtenerPropiedadPorCedulaPropietario.ejecutar(propiedadDto.getCedulaPropietario());

        // Assert
        assertEquals(ZONA_ACTUALIZADA, propiedadActualizada.getZona());
        assertEquals(DIRECCION_ACTUALIZADA, propiedadActualizada.getDireccion());

    }

}
