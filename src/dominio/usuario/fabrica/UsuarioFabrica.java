package dominio.usuario.fabrica;

import dominio.usuario.dto.UsuarioDto;
import persistencia.usuario.entidad.Usuario;

public class UsuarioFabrica {

    public static Usuario convertirDtoAEntidad(UsuarioDto usuarioDto) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setApellido(usuarioDto.getApellido());
        usuario.setCedula(usuarioDto.getCedula());
        usuario.setTelefono(usuarioDto.getTelefono());
        usuario.setTipoUsuario(usuarioDto.getTipoUsuario());

        return usuario;
    }

    public static UsuarioDto convertirEntidadADto(Usuario usuario) {
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNombre(usuario.getNombre());
        usuarioDto.setApellido(usuario.getApellido());
        usuarioDto.setCedula(usuario.getCedula());
        usuarioDto.setTelefono(usuario.getTelefono());
        usuarioDto.setTipoUsuario(usuario.getTipoUsuario());

        return usuarioDto;
    }

}
