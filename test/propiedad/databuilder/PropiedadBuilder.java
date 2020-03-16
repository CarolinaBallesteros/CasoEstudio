package propiedad.databuilder;

import dominio.propiedad.dto.PropiedadDto;

public class PropiedadBuilder {

    private PropiedadDto propiedadDto;

    public PropiedadBuilder() {
        propiedadDto = new PropiedadDto();
    }

    public PropiedadDto casa() {
        propiedadDto.setCedulaPropietario("1993");
        propiedadDto.setTipoInmueble("Casa");
        propiedadDto.setZona("SurOccidental");
        propiedadDto.setDireccion("Calle1");
        propiedadDto.setValor(800000.0);
        return propiedadDto;
    }

}
