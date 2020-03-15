package persistencia.usuario.repositorio;

import persistencia.usuario.entidad.Usuario;

public interface IUsuarioRepositorio {

	void guardarUsuario(Usuario usuario);

	Usuario obtenerPorCedula(String cedula) throws Exception;
	
        void actualizar(Usuario usuarioActualizar) throws Exception;

}
