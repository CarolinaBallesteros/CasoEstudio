package dominio.usuario.servicio;

import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.fabrica.UsuarioFabrica;
import persistencia.usuario.entidad.Usuario;
import persistencia.usuario.repositorio.IUsuarioRepositorio;
import persistencia.usuario.repositorio.UsuarioRepositorio;

public class ActualizarUsuarioServicio {

    private IUsuarioRepositorio usuarioRepositorio = UsuarioRepositorio.getUnicaInstancia();

    public void ejecutar(UsuarioDto usuarioDtoActualizar) throws Exception {
        Usuario usuarioActualizar = UsuarioFabrica.convertirDtoAEntidad(usuarioDtoActualizar);
        usuarioRepositorio.actualizar(usuarioActualizar);
    }

}
