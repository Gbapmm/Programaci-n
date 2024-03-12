package Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Edad {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la fecha de nacimiento (en formato YYYY-MM-DD): ");
		String inputFechaNacimiento = scanner.nextLine();

		LocalDate fNacimiento = LocalDate.parse(inputFechaNacimiento);

		scanner.close();

		LocalDate hoy = LocalDate.now();
		Period edad = Period.between(fNacimiento, hoy);
		int años = edad.getYears();
		System.out.println("Tienes " + años + " años");

	}
}