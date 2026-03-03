package UD10Tarea;

public class Perro extends Mascotas {
	// cremaos una clase publica llamada canario y le damos parametros
	public Perro(String nombreI, int edad, String estado, String fechaNacimiento) {
		super(nombreI, edad, estado);
	}

	public String tipo() {
		return "Perro";
	}
}