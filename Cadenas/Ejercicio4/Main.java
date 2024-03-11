public class Main {
	public static void main(String[] args) {
		String texto = "Este é un exemplo de texto. Inclúe varias frases e parágrafos.\n"
				+ "Outra frase aquí. E un novo parágrafo.\n" + "Última frase do texto.";
		String palabrabuscada = "frase";

		int apariciones = aparicionesPalabra(texto, palabrabuscada);

		System.out.println("La palabra '" + palabrabuscada + "' aparece " + apariciones + " veces en el texto.");

		contarFrase(texto);
	}

	public static void contarFrase(String texto) {
		int párrafos = 0;
		int frases = 0;
		int palabras = 0;
		int caracteres = 0;

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			if (!Character.isWhitespace(caracter)) {
				caracteres++;
			}

			if (caracter == '\n') {
				párrafos++;
			}

			if (Character.isWhitespace(caracter)) {
				if (i > 0 && texto.charAt(i - 1) == '.') {
					frases++;
				}
			}
		}

		if (texto.endsWith(".")) {
			frases++;
		}

		String[] palabrasDiv = texto.split("\\s+");
		palabras = palabrasDiv.length;

		System.out.println("Número de párrafos: " + párrafos);
		System.out.println("Número de frases: " + frases);
		System.out.println("Número de palabras: " + palabras);
		System.out.println("Número de caracteres: " + caracteres);
	}

	public static int aparicionesPalabra(String texto, String palabrabuscada) {
		String textoLower = texto.toLowerCase();
		String palabraLower = palabrabuscada.toLowerCase();

		int apariciones = 0;
		int indice = 0;

		while ((indice = textoLower.indexOf(palabraLower, indice)) != -1) {
			// a
			apariciones++;
			indice++;
		}

		return apariciones;
	}
}