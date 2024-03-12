package Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Años {
	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.parse("2020-07-06");
		LocalDate seisNov = LocalDate.parse("6/11/2020", DateTimeFormatter.ofPattern("d/M/yyyy") );
		
	}
}