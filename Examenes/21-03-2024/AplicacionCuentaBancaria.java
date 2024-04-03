package Examen_I_Rec;

import java.text.BreakIterator;
import java.util.Scanner;

public class AplicacionCuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Control control = new Control();
        int opcion;

        while (true) {
            System.out.println("1. Abrir una nueva cuenta\n"
                    + "2. Ver un listado de las cuentas disponibles.\n"
                    + "3. Realizar un ingreso en una cuenta.\n"
                    + "4. Retirar efectivo de una cuenta.\n"
                    + "5. Salir de la aplicación.\n");
            System.out.println("Seleccione la acción a realizar: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    control.abrir();
                    break;
                case 2:
                    control.listado();
                    break;
                case 3:
                    control.ingresar();
                    break;
                case 4:
                    control.retirar();
                    break;
                case 5:
                    control.salir();
                    System.exit(0);
            }
        }
    }
}
