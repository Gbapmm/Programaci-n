public class Ejercicio4 {
    public static void main(String[] args) {
        String texto = "Este é un exemplo de texto. Inclúe varias frases e parágrafos.\n"
                + "Outra frase aquí. E un novo parágrafo.\n"
                + "Última frase do texto.";

        contarFrase(texto);
    }

    public static void contarFrase(String cadena) {
        int párrafos = 0;
        int frases = 0;
        int palabras = 0;
        int caracteres = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (!Character.isWhitespace(caracter)) {
                caracteres++;
            }

            if (caracter == '\n') {
                párrafos++;
            }

            if (Character.isWhitespace(caracter)) {
                if (i > 0 && cadena.charAt(i - 1) == '.') {
                    frases++;
                }
            }
        }

        if (cadena.endsWith(".")) {
            frases++;
        }

        String[] palabrasDiv = cadena.split("\\s+");
        palabras = palabrasDiv.length;

        System.out.println("Número de párrafos: " + párrafos);
        System.out.println("Número de frases: " + frases);
        System.out.println("Número de palabras: " + palabras);
        System.out.println("Número de caracteres: " + caracteres);
    }
}
