package UD10Tarea;

public class Gato extends Mascotas {
	//cremaos una clase publica llamada canario y le damos parametros
	public Gato(String nombreI, int edad, String estado, String fechaNacimiento) {
		super(nombreI, edad, estado);
	}

	public String tipo() {
		return "Gato";
	}
}
