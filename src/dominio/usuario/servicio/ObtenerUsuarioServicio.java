package dominio.usuario.servicio;

import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.fabrica.UsuarioFabrica;
import persistencia.usuario.repositorio.IUsuarioRepositorio;
import persistencia.usuario.repositorio.UsuarioRepositorio;

public class ObtenerUsuarioServicio {

    private IUsuarioRepositorio usuarioRepositorio = UsuarioRepositorio.getUnicaInstancia();

    public UsuarioDto ejecutar(String cedula) throws Exception {
        return UsuarioFabrica.convertirEntidadADto(usuarioRepositorio.obtenerPorCedula(cedula));
    }

}
