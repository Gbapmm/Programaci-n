package Fechas.Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera fecha (dd/MM/yyyy): ");
        String fechaStr1 = scanner.nextLine();

        System.out.print("Ingresa la segunda fecha (dd/MM/yyyy): ");
        String fechaStr2 = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha1 = dateFormat.parse(fechaStr1);
            Date fecha2 = dateFormat.parse(fechaStr2);

            mostrarDiferencia(fecha1, fecha2);

        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha inválido. Asegúrate de ingresar las fechas en el formato correcto.");
        }
    }

    private static void mostrarDiferencia(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);

        long diferenciaEnMillis = fecha2.getTime() - fecha1.getTime();
        long dias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
        long meses = (cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR)) * 12 + cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH);
        long anos = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);

        System.out.println("\nDiferencia:");
        System.out.println("- Días: " + dias);
        System.out.println("- Meses: " + meses);
        System.out.println("- Años: " + anos);
    }
}
