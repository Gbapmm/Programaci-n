package Examen_I_Rec;

import java.util.Scanner;

public class AplicacionCuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Control control = new Control();
        int opcion;

        while (true) {
            System.out.println("1. Abrir una nueva cuenta.\n" +
                    "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).\n" +
                    "3. Realizar un ingreso en una cuenta.\n" +
                    "4. Retirar efectivo de una cuenta.\n" +
                    "5. Salir de la aplicación.");

            System.out.println("Seleccione la acción a realizar: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    control.abrir();
                    break;
            }
        }
    }
}
