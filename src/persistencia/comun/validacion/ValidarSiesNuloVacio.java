package persistencia.comun.validacion;

public class ValidarSiesNuloVacio {

    public static String validarSiesNuloVacio(String variableValidar, String errorConstante) throws Exception {
        if (variableValidar == null || variableValidar.isEmpty()) {
            throw new Exception(errorConstante);
        }
        return variableValidar;
    }

    private ValidarSiesNuloVacio() {
    }

}
