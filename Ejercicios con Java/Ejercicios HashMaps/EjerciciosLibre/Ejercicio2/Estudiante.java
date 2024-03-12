package HashMaps;

public class Estudiante {
	String nombre;
	int id;
	double mediaNotas;

	public Estudiante(String nombre, int id, double mediaNotas) {
		this.nombre = nombre;
		this.id = id;
		this.mediaNotas = mediaNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public double getMediaNotas() {
		return mediaNotas;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nId: " + id + "\nMedia de las notas: " + mediaNotas;
	}

}
