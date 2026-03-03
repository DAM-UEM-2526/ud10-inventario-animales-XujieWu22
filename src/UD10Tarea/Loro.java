package UD10Tarea;

public class Loro extends Mascotas {
	//cremaos una clase publica llamada canario y le damos parametros
	public Loro(String nombreI, int edad, String estado) {
		super(nombreI, edad, estado);
	}

	public String tipo() {
		return "Loro";
	}
}