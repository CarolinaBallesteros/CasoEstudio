package dominio.propiedad.servicio;

import dominio.propiedad.dto.PropiedadDto;
import dominio.propiedad.fabrica.PropiedadFabrica;
import java.util.ArrayList;
import java.util.List;
import persistencia.propiedad.entidad.Propiedad;
import persistencia.propiedad.repositorio.IPropiedadRepositorio;
import persistencia.propiedad.repositorio.PropiedadRepositorio;

public class ObtenerDireccionPropiedadPorValor {

    private IPropiedadRepositorio propiedadRepositorio = PropiedadRepositorio.getUnicaInstancia();

    public List<PropiedadDto> ejecutar(Double valorAFiltrar) {
        List<Propiedad> propiedades = propiedadRepositorio.obtenerDireccionesPorValor(valorAFiltrar);
        List<PropiedadDto> propiedadesDto = new ArrayList<>();

        propiedades.stream().forEach(propiedad -> {
            propiedadesDto.add(PropiedadFabrica.convertirEntidadADto(propiedad));
        });
                
        return propiedadesDto;
    }

}
