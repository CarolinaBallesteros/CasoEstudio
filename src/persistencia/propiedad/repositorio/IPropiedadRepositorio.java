package persistencia.propiedad.repositorio;

import java.util.List;
import persistencia.propiedad.entidad.Propiedad;

public interface IPropiedadRepositorio {

    void guardarPropiedad(Propiedad propiedad);

    Propiedad obtenerPorCedulaPropietario(String cedula) throws Exception;

    void actualizar(Propiedad propiedadActualizar) throws Exception;

    public List<Propiedad> obtenerDireccionesPorValor(Double valorAFiltrar);

}
