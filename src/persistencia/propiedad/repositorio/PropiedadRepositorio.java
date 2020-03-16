package persistencia.propiedad.repositorio;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import persistencia.propiedad.entidad.Propiedad;

public class PropiedadRepositorio implements IPropiedadRepositorio {

    private static PropiedadRepositorio unicaInstancia = null;

    private static final Object NO_EXISTE_UNA_PROPIEDAD_REGISTRADA = null;
    private Propiedad primero;
    private Propiedad ultimo;

    private PropiedadRepositorio() {
    }

    public static PropiedadRepositorio getUnicaInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new PropiedadRepositorio();
        }
        return unicaInstancia;
    }

    @Override
    public void guardarPropiedad(Propiedad propiedad) {

        if (primero == NO_EXISTE_UNA_PROPIEDAD_REGISTRADA) {
            primero = propiedad;
            ultimo = propiedad;
        } else {
            ultimo.setSiguiente(propiedad);
            propiedad.setAdelante(ultimo);
            ultimo = propiedad;
        }

    }

    @Override
    public Propiedad obtenerPorCedulaPropietario(String cedula) throws Exception {
        Propiedad actual = primero;

        try {
            while (!actual.getCedulaPropietario().equals(cedula)) {
                actual = actual.getSiguiente();
            }
        } catch (Exception e) {
            throw new Exception("Propiedad No Existe");
        }
        return actual;
    }

    @Override
    public void actualizar(Propiedad propiedadActualizar) throws Exception {
        Propiedad propiedadEncontrada = obtenerPorCedulaPropietario(propiedadActualizar.getCedulaPropietario());

        propiedadEncontrada.setDireccion(propiedadActualizar.getDireccion());
        propiedadEncontrada.setZona(propiedadActualizar.getZona());

    }

    @Override
    public List<Propiedad> obtenerDireccionesPorValor(Double valorAFiltrar) {
        Propiedad actual = primero;
        List<Propiedad> propiedades = new ArrayList<>();

        while (actual != null) {

            if (actual.getValor() == valorAFiltrar) {
                propiedades.add(actual);
            }

            actual = actual.getSiguiente();
        }

        return propiedades;

    }
}
