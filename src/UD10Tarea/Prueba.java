package UD10Tarea;

public class Prueba {

	public static void main(String[] args) {
		//creamos dos objetos de tipo perro y gato
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");
		//imprimimos el noombre del perro y el estado del gato
		System.out.println(r.getNombreI());
		System.out.println(g.getEstado());
		//creamos el objeto llamado inventario
		Inventario i = new Inventario();
		//insertamos al peero y al gato en el inventario
		i.insertaMascota(g);
		i.insertaMascota(r);
		//imprimimos todos los animales dentro del arrayList
		i.imprimirTodos();
		//imprimimos solo a los perros
		i.imprimirPerros();
		//vaciamos todo
		i.vaciar();
		//volvemos a imprimir todos y solo a los perros
		i.imprimirTodos();
		i.imprimirPerros();
	}
}