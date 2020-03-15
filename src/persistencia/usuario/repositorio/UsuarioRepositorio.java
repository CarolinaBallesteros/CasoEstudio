package persistencia.usuario.repositorio;

import persistencia.usuario.entidad.Usuario;

public class UsuarioRepositorio implements IUsuarioRepositorio {

    private static UsuarioRepositorio unicaInstancia = null;

    private static final Object NO_EXISTE_UN_USUARIO_REGISTRADO = null;
    private Usuario primero;
    private Usuario ultimo;

    private UsuarioRepositorio() {
    }

    public static UsuarioRepositorio getUnicaInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new UsuarioRepositorio();
        }
        return unicaInstancia;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {

        if (primero == NO_EXISTE_UN_USUARIO_REGISTRADO) {
            primero = usuario;
            ultimo = usuario;
        } else {
            ultimo.setSiguiente(usuario);
            usuario.setAdelante(ultimo);
            ultimo = usuario;
        }

    }

    @Override
    public Usuario obtenerPorCedula(String cedula) throws Exception {
        Usuario actual = primero;

        try {
            while (!actual.getCedula().equals(cedula)) {
                actual = actual.getSiguiente();
            }

        } catch (Exception e) {
            throw new Exception("Usuario No Existe");
        }

        return actual;
    }

    @Override
    public void actualizar(Usuario usuarioActualizar) throws Exception {
        Usuario usuarioEncontrado = obtenerPorCedula(usuarioActualizar.getCedula());

        usuarioEncontrado.setNombre(usuarioActualizar.getNombre());
        usuarioEncontrado.setApellido(usuarioActualizar.getApellido());
        usuarioEncontrado.setTelefono(usuarioActualizar.getTelefono());
        usuarioEncontrado.setTipoUsuario(usuarioActualizar.getTipoUsuario());

    }

}
