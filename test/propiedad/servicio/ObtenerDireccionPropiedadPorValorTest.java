package propiedad.servicio;

import dominio.propiedad.dto.PropiedadDto;
import dominio.propiedad.servicio.ObtenerDireccionPropiedadPorValor;
import dominio.propiedad.servicio.RegistarPropiedadServicio;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import propiedad.databuilder.PropiedadBuilder;

public class ObtenerDireccionPropiedadPorValorTest {

    private RegistarPropiedadServicio registrarPropiedad;
    private ObtenerDireccionPropiedadPorValor obtenerDireccionPropiedadPorValor;

    @Before
    public void init() {
        registrarPropiedad = new RegistarPropiedadServicio();
        obtenerDireccionPropiedadPorValor = new ObtenerDireccionPropiedadPorValor();
    }

    @Test
    public void obtenerDireccionPropiedadPorValor() throws Exception {

        // Arrange
        PropiedadDto propiedadDto1 = new PropiedadBuilder().casa();
        propiedadDto1.setValor(15.0);
        registrarPropiedad.ejecutar(propiedadDto1);

        PropiedadDto propiedadDto2 = new PropiedadBuilder().casa();
        propiedadDto2.setValor(20.0);
        registrarPropiedad.ejecutar(propiedadDto2);

        PropiedadDto propiedadDto3 = new PropiedadBuilder().casa();
        propiedadDto3.setValor(10.0);
        registrarPropiedad.ejecutar(propiedadDto3);

        PropiedadDto propiedadDto4 = new PropiedadBuilder().casa();
        propiedadDto4.setValor(20.0);
        registrarPropiedad.ejecutar(propiedadDto4);

        Double valorAFiltrar = 20.0;
        
        //Act
        List<PropiedadDto> resultado =  obtenerDireccionPropiedadPorValor.ejecutar(valorAFiltrar);

        // Assert
        assertEquals(2,resultado.size());
        
    }

}
