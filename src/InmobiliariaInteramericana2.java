
public class InmobiliariaInteramericana2 {
	
	public static QuieroPonerEnArriendo quieroPonerenArriendo;
	public static RegistroPonerEnArriendo registroPonerenArriendo[];
	public static int registro;
	
	
	public static void main(String[] args) {
		
		quieroPonerenArriendo = new QuieroPonerEnArriendo();
		registroPonerenArriendo = new RegistroPonerEnArriendo[100];
		
		for(int i = 0; i < 100; i++) {
			registroPonerenArriendo[i] =  new RegistroPonerEnArriendo();
			
		}
		registro = 0;
		
		quieroPonerenArriendo.setVisible(true);
		
	}
	
	public static void enviar(String nombre, String email, String tipo, String direccion, String zona, int telefono, double valor) {
		
		registroPonerenArriendo[registro].setNombre(nombre);
		registroPonerenArriendo[registro].setTelefono(telefono);
		registroPonerenArriendo[registro].setEmail(email);
		registroPonerenArriendo[registro].setTipo_Inmueble(tipo);
		registroPonerenArriendo[registro].setDireccion(direccion);
		registroPonerenArriendo[registro].setValor(valor);
		registroPonerenArriendo[registro].setZona(zona);
		
		registro++;
		
	}
	
	public static void modificar(String cargar) {
		
		for (int j = 0; j < registroPonerenArriendo.length; j++) {
				if (registroPonerenArriendo[j].getNombre().equals(cargar)) {
						quieroPonerenArriendo.guardardatos(registroPonerenArriendo[j]);
				}
		}
	}

	public static void enviar(String nombre, String telefono, String email, String tipo, String direccion, String valor, String zona) {
		// TODO Auto-generated method stub
		
	}

}
