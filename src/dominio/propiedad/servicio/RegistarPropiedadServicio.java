
package dominio.propiedad.servicio;

import dominio.propiedad.dto.PropiedadDto;
import dominio.propiedad.fabrica.PropiedadFabrica;
import persistencia.propiedad.entidad.Propiedad;
import persistencia.propiedad.repositorio.IPropiedadRepositorio;
import persistencia.propiedad.repositorio.PropiedadRepositorio;

public class RegistarPropiedadServicio {
    
    private IPropiedadRepositorio propiedadRepositorio = PropiedadRepositorio.getUnicaInstancia();
    
    public void ejecutar (PropiedadDto propiedadDto) throws Exception {
            Propiedad propiedad = PropiedadFabrica.convertirDtoAEntidad(propiedadDto);
            propiedadRepositorio.guardarPropiedad(propiedad);
    }
    
}
