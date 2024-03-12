import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		String palabra;
		String cambio;
		
		System.out.println("Introduce el texto a utilizar: ");
		texto = sc.nextLine();
		System.out.println("Introduce la palabra a reemplazar: ");
		palabra = sc.nextLine();
		System.out.println("Intreoduce la palabra con la que reemplazarás: ");
		cambio = sc.nextLine();
		
		System.out.println("Texto con la palabra cambiada: ");
		System.out.println(texto.replaceAll(palabra, cambio));
	}
}
