package usuario.databuilder;

import static dominio.usuario.constantes.UsuarioConstantes.ARRENDATARIO;
import static dominio.usuario.constantes.UsuarioConstantes.PROPIETARIO;
import dominio.usuario.dto.UsuarioDto;

public class UsuarioBuilder {

	private UsuarioDto usuarioDto;
	
	public UsuarioBuilder() {
                usuarioDto = new UsuarioDto();
	}
	
	public UsuarioDto tipoUsuarioArrendatario() {
		usuarioDto.setNombre("Carolina");
		usuarioDto.setApellido("Ballesteros");
		usuarioDto.setTelefono("318");
		usuarioDto.setEmail("carola@pi.edu.co");
		usuarioDto.setCedula("1098");
                usuarioDto.setTipoUsuario(ARRENDATARIO);
		return usuarioDto;
	}
        
	public UsuarioDto tipoUsuarioPropietario() {
		usuarioDto.setNombre("Edwin");
		usuarioDto.setApellido("Mendez");
		usuarioDto.setTelefono("317");
		usuarioDto.setEmail("edwin@pi.edu.co");
		usuarioDto.setCedula("1993");
                usuarioDto.setTipoUsuario(PROPIETARIO);
		return usuarioDto;
	}        
	
        
}
