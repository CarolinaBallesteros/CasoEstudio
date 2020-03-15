package dominio.usuario.servicio;

import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.fabrica.UsuarioFabrica;
import persistencia.usuario.entidad.Usuario;
import persistencia.usuario.repositorio.IUsuarioRepositorio;
import persistencia.usuario.repositorio.UsuarioRepositorio;

public class RegistrarUsuarioServicio {
	
	private IUsuarioRepositorio usuarioRepositorio = UsuarioRepositorio.getUnicaInstancia();
	
	public void ejecutar(UsuarioDto usuarioDto) throws Exception {
		Usuario usuario = UsuarioFabrica.convertirDtoAEntidad(usuarioDto);
		usuarioRepositorio.guardarUsuario(usuario);
	}
	
}
