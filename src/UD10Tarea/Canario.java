package UD10Tarea;

public class Canario extends Mascotas {
	//cremaos una clase publica llamada canario y le damos parametros
	public Canario(String nombreI, int edad, String estado) {
		super(nombreI, edad, estado);
	}

	public String tipo() {
		return "Canario";
	}
}