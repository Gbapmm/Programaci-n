package HashMaps;

import java.util.Map;
import java.util.HashMap;

public class RegistroEstudiantes {
	private Map<Integer, Estudiante> registro;

	public RegistroEstudiantes() {
		registro = new HashMap<>();
	}

	public void agregarEstudiante(Estudiante estudiante) {
		registro.put(estudiante.getId(), estudiante);
		System.out.println("Estudiante agregado con éxito");
	}

	public void eliminarEstudiante(int id) {
		if (registro.containsKey(id)) {
			registro.remove(id);
			System.out.println("Estudiante eliminado correctamente.");
		} else {
			System.out.println("No se ha encontradó un estudiante con ese Id.");
		}
	}

	public double obtenerMedia(int id) {
		if (registro.containsKey(id)) {
			return registro.get(id).getMediaNotas();
		} else {
			throw new IllegalArgumentException("No se encontró un estudiante con ese ID.");
		}
	}

	public void mostrarEstudiantes() {
		System.out.println("Lista de estudiantes");
		for (Estudiante estudiante : registro.values()) {
			System.out.println(estudiante.toString());
		}
	}
}
