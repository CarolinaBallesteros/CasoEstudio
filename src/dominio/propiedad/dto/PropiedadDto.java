package dominio.propiedad.dto;

public class PropiedadDto {

    private String cedulaPropietario;

    private String tipoInmueble;

    private String zona;

    private String direccion;

    private Double valor;

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipo_inmueble) {
        this.tipoInmueble = tipo_inmueble;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
