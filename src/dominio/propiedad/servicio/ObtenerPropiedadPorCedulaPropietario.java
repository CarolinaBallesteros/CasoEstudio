package dominio.propiedad.servicio;

import dominio.propiedad.dto.PropiedadDto;
import dominio.propiedad.fabrica.PropiedadFabrica;
import persistencia.propiedad.repositorio.IPropiedadRepositorio;
import persistencia.propiedad.repositorio.PropiedadRepositorio;

public class ObtenerPropiedadPorCedulaPropietario {

    private IPropiedadRepositorio propiedadRepositorio = PropiedadRepositorio.getUnicaInstancia();

    public PropiedadDto ejecutar(String cedulaPropiedad) throws Exception {
        return PropiedadFabrica.convertirEntidadADto(propiedadRepositorio.obtenerPorCedulaPropietario(cedulaPropiedad));
    }

}
