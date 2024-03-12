import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte cont = 0;
        byte numero = 1;
        byte opcion = 0;
        byte resultado = 0;
        int valor = 0;
        char car;
        boolean sair = false;
        boolean repetir = false;

        while ((!sair) && (cont == 0)) {
            System.out.print("Introduza la cantidad de números a leer [1-50][0 para saír]: ");
            if (sc.hasNextByte()) {
                cont = sc.nextByte();

                if (cont == 0) {
                    sair = true;
                } else {
                    cont = (cont < 1 || cont > 50) ? 0 : cont;
                }
            } else {
                System.out.println("\tERROR:  Se debe introducir un número entre 1 e 50");
                sc.next();
                cont = 0;
            }
        }

        if (!sair) {
            System.out.println("\Opciones disponibles:\n"
                    + "\t1. Indicar cuantas letras hay.\n"
                    + "\t2. indicar cuantos dígitos hay.\n"
                    + "\t3. Indicar cuantos son mayúsculas.\n"
                    + "\t4. Transformalo todo a minúsculas.\n"
                    + "\t5. Saír");

            do {
                repetir = false;
                System.out.print("Indique la operación que desee realizar "
                        + "sobre los caracteres correspondentes: ");
                if (sc.hasNextByte()) {
                    opcion = sc.nextByte();
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("\tATENCIÓN! Opción no disponible. "
                                + "Vuelva a seleccionar. ");
                        repetir = true;
                    }
                } else {
                    System.out.println("\tERROR: Se debe introducir un caracter entre 1 e 5");
                    sc.next();
                    repetir = true;
                }
            } while (repetir);

            sair = (opcion == 5);

            if (!sair) {
                numero = 1;
                System.out.println("Introduza los " + cont + " números [0-65535]");

                while (cont != 0) {
                    do {
                        repetir = false;
                        System.out.print(numero + ".- ");
                        if (sc.hasNextInt()) {
                            valor = sc.nextInt();
                            if (valor < 0 || valor > 65535) {
                                System.out.println("\tATENCIÓN! Número no disponible." + "Vuelva a introducir. ");
                                repetir = true;
                            }
                        } else {
                            System.out.println("\tERROR: Se debe introducir un número entre 0 e 65535");
                            sc.next();
                            repetir = true;
                        }
                    } while (repetir);

                    car = (char) valor;
                    System.out.println("\tValor del carácter: " + car);

                    switch (opcion) {
                        case 1:
                            resultado = (Character.isLetter(car)) ? ++resultado : resultado;
                            break;
                        case 2:
                            resultado = (Character.isDigit(car)) ? ++resultado : resultado;
                            break;
                        case 3:
                            resultado = (Character.isUpperCase(car)) ? ++resultado : resultado;
                            break;
                        case 4:
                            System.out.println("\tCarácter en minúscula: " + Character.toLowerCase(car));
                            break;
                    }

                    cont--;
                    numero++;
                }

                switch (opcion) {
                    case 1:
                        System.out.println(" **Hay " + resultado + " letras**");
                        break;
                    case 2:
                        System.out.println("**Hay " + resultado + " dígitos**");
                        break;
                    case 3:
                        System.out.println("**Hay " + resultado + " mayúsculas**");
                        break;
                }
            }
        }

        System.out.println("Saliendo del programa...");
        sc.close();
    }
}