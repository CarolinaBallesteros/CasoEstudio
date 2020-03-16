
package dominio.propiedad.fabrica;

import dominio.propiedad.dto.PropiedadDto;
import persistencia.propiedad.entidad.Propiedad;
        

public class PropiedadFabrica {
    
    public static Propiedad convertirDtoAEntidad(PropiedadDto propiedadDto) throws Exception {
    
            Propiedad propiedad = new Propiedad();
            propiedad.setCedulaPropietario(propiedadDto.getCedulaPropietario());
            propiedad.setTipoInmueble(propiedadDto.getTipoInmueble());
            propiedad.setDireccion(propiedadDto.getDireccion());
            propiedad.setZona(propiedadDto.getZona());
            propiedad.setValor(propiedadDto.getValor());
            
            return propiedad;
    }
    
    public static PropiedadDto convertirEntidadADto(Propiedad propiedad){
        
        PropiedadDto propiedadDto = new PropiedadDto();
        propiedadDto.setCedulaPropietario(propiedad.getCedulaPropietario());
        propiedadDto.setTipoInmueble(propiedad.getTipoInmueble());
        propiedadDto.setDireccion(propiedad.getDireccion());
        propiedadDto.setZona(propiedad.getZona());
        propiedadDto.setValor(propiedad.getValor());
        
        return propiedadDto;
    }
    
}
    
    

