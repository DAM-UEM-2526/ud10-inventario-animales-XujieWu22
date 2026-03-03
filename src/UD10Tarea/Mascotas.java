package UD10Tarea;

public abstract class Mascotas {

	// Atributosde las mascotas
	protected String nombreI;
	protected int edad;
	protected String estado;

	// Constructor
	public Mascotas(String nombreI, int edad, String estado) {
		this.nombreI = nombreI;
		this.edad = edad;
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	// Getter del nombre (lo usaremos en Inventario)
	public String getNombreI() {
		return nombreI;
	}

	// Método abstracto (obliga a las clases hijas a implementarlo)
	public abstract String tipo();
}