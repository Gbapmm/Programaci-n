package Examen_I_Rec;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cuenta> cuentas = new ArrayList<>();
    int contadorCuentas = 001;

    public void abrir() {
        System.out.println("---- Introduzca sus datos personales ----\n");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("Fecha Nacimiento: ");
        String fechanac = scanner.nextLine();
        System.out.println("Introduzca el saldo inicial de su cuenta: ");
        double saldo = scanner.nextInt();

        DatosPersonales titular = new DatosPersonales(nombre, apellidos, fechanac);
        int numCuenta = Integer.parseInt(generarNumCuenta());
        Cuenta nuevaCuenta = new Cuenta(titular, saldo, numCuenta);
        cuentas.add(nuevaCuenta);

        System.out.println("Cuenta creada satisfactoriamente.");
    }

    public void listado() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas disponibles.");
        } else {
            System.out.println("--- Listado de Cuentas ---");
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuenta);
            }
        }
    }

    public void ingresar() {
        System.out.println("Introduzca el numero de la cuenta a la que ingresar: ");
        int numCuenta = scanner.nextInt();

        Cuenta cuenta = buscarCuenta(numCuenta);

        if (cuenta != null) {
            System.out.println("Introduzca la cantidad a ingresar: ");
            double cantidad = scanner.nextDouble();

            cuenta.efectuarIngreso(cantidad);
            System.out.println("Ingreso realizado correctamente.\n"
                    + "Nuevo saldo de la cuenta: " + cuenta.getSaldo());
        } else {
            System.out.println("La cuenta especificada no existe.\n");
        }
    }



    public void retirar() {
        System.out.println("Introduzca el numero de la cuenta de la que retirar: ");
        int numCuenta = scanner.nextInt();

        Cuenta cuenta = buscarCuenta(numCuenta);

        if (cuenta != null) {
            System.out.println("Introduzca la cantidad a retirar: ");
            double cantidad = scanner.nextDouble();

            cuenta.efectuarRetirada(cantidad);
            System.out.println("Retirada realizada correctamente.\n"
                    + "Nuevo saldo de la cuenta: " + cuenta.getSaldo());
        } else {
            System.out.println("La cuenta especificada no existe.\n");
        }
    }

    public void salir() {
        System.out.println("Saliendo de la aplicación...\n"
                + "Gracias por confiar en nuestro banco.");
    }

    private String generarNumCuenta() {
        String numCuenta = String.format("%06d", contadorCuentas);
        contadorCuentas++;
        return numCuenta;
    }
    private Cuenta buscarCuenta(int numCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumCuenta() == numCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}
