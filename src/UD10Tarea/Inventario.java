package UD10Tarea;

import java.util.ArrayList;

public class Inventario {

	// ArrayList privado
	private ArrayList<Mascotas> animales;

	// Constructor
	public Inventario() {
		animales = new ArrayList<>();
	}

	// Inicializa el inventario a vacío
	public void vaciar() {
		animales.clear();
	}

	// Inserta mascota al arrayList
	public void insertaMascota(Mascotas a) {
		animales.add(a);
	}

	// Elimina mascota por nombre
	public void eliminaMascota(String nombreI) {

		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i).getNombreI().equals(nombreI)) {
				animales.remove(i);
				return;
			}
		}

	}

	// Imprime todos los nombres de los animales
	public void imprimirTodos() {
		for (Mascotas elto : animales) {
			System.out.println(elto.getNombreI());
		}
	}

	// Imprime solo a los perros
	public void imprimirPerros() {
		for (Mascotas elto : animales) {
			if (elto instanceof Perro) {
				System.out.println(elto.getNombreI());
			}
		}
	}
}