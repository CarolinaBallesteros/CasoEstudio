package persistencia.usuario.entidad;

import static dominio.usuario.constantes.UsuarioConstantes.EL_APELLIDO_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_CEDULA_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_NOMBRE_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_TELEFONO_NO_PUEDE_ESTAR_VACIO;
import static dominio.usuario.constantes.UsuarioConstantes.EL_TIPO_USUARIO_NO_PUEDE_ESTAR_VACIO;
import static persistencia.comun.validacion.ValidarSiesNuloVacio.validarSiesNuloVacio;

public class Usuario {

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private String cedula;

    private String tipoUsuario;

    private Usuario adelante;

    private Usuario siguiente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        this.nombre = validarSiesNuloVacio(nombre, EL_NOMBRE_NO_PUEDE_ESTAR_VACIO);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        this.apellido = validarSiesNuloVacio(apellido, EL_APELLIDO_NO_PUEDE_ESTAR_VACIO);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception {
        this.telefono = validarSiesNuloVacio(telefono, EL_TELEFONO_NO_PUEDE_ESTAR_VACIO);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws Exception {
        this.cedula = validarSiesNuloVacio(cedula, EL_CEDULA_NO_PUEDE_ESTAR_VACIO);
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) throws Exception {
        this.tipoUsuario = validarSiesNuloVacio(tipoUsuario, EL_TIPO_USUARIO_NO_PUEDE_ESTAR_VACIO);
    }

    public Usuario getAdelante() {
        return adelante;
    }

    public void setAdelante(Usuario adelante) {
        this.adelante = adelante;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }

}
