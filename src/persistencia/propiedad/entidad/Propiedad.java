package persistencia.propiedad.entidad;

import static dominio.propiedad.constantes.PropiedadConstantes.EL_TIPO_INMUEBLE_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.EL_VALOR_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_CEDULA_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_DIRECCION_NO_PUEDE_ESTAR_VACIO;
import static dominio.propiedad.constantes.PropiedadConstantes.LA_ZONA_NO_PUEDE_ESTAR_VACIO;
import static persistencia.comun.validacion.ValidarSiesNuloVacio.validarSiesNuloVacio;

public class Propiedad {

    private String cedulaPropietario;

    private String cedulaArrendatario;

    private String tipoInmueble;

    private String zona;

    private String direccion;

    private Double valor;

    private Propiedad adelante;

    private Propiedad siguiente;

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipo_inmueble) throws Exception {
        this.tipoInmueble = validarSiesNuloVacio(tipo_inmueble, EL_TIPO_INMUEBLE_NO_PUEDE_ESTAR_VACIO);
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) throws Exception {
        this.zona = validarSiesNuloVacio(zona, LA_ZONA_NO_PUEDE_ESTAR_VACIO);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
        this.direccion = validarSiesNuloVacio(direccion, LA_DIRECCION_NO_PUEDE_ESTAR_VACIO);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) throws Exception {
        if (valor == null || valor == 0.0) {
            throw new Exception(EL_VALOR_NO_PUEDE_ESTAR_VACIO);
        }

        this.valor = valor;
    }

    public Propiedad getAdelante() {
        return adelante;
    }

    public void setAdelante(Propiedad adelante) {
        this.adelante = adelante;
    }

    public Propiedad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Propiedad siguiente) {
        this.siguiente = siguiente;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) throws Exception {
        this.cedulaPropietario = validarSiesNuloVacio(cedulaPropietario, LA_CEDULA_NO_PUEDE_ESTAR_VACIO);
    }

    public String getCedulaArrendatario() {
        return cedulaArrendatario;
    }

    public void setCedulaArrendatario(String cedulaArrendatario) {
        this.cedulaArrendatario = cedulaArrendatario;
    }

}
