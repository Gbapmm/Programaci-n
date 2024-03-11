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
            System.out.print("Introduza a cantidade de números a ler [1-50][0 para saír]: ");
            if (sc.hasNextByte()) {
                cont = sc.nextByte();

                if (cont == 0) {
                    sair = true;
                } else {
                    cont = (cont < 1 || cont > 50) ? 0 : cont;
                }
            } else {
                System.out.println("\tERRO: Débese introducir un número entre 1 e 50");
                sc.next();
                cont = 0;
            }
        }

        if (!sair) {
            System.out.println("\nOpcións dispoñibles:\n"
                    + "\t1. Indicar cantas letras hai.\n"
                    + "\t2. Indicar cantos díxitos hai.\n"
                    + "\t3. Indicar cantos son maiúsculas.\n"
                    + "\t4. Transformalo a minúscula.\n"
                    + "\t5. Saír");

            do {
                repetir = false;
                System.out.print("Indique a operación que desexe realizar "
                        + "sobre os caracteres correspondentes: ");
                if (sc.hasNextByte()) {
                    opcion = sc.nextByte();
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("\tATENCIÓN! Opción non dispoñible. "
                                + "Volva a seleccionar. ");
                        repetir = true;
                    }
                } else {
                    System.out.println("\tERRO: Débese introducir unha entre 1 e 5");
                    sc.next();
                    repetir = true;
                }
            } while (repetir);

            sair = (opcion == 5);

            if (!sair) {
                numero = 1;
                System.out.println("Introduza os " + cont + " números [0-65535]");

                while (cont != 0) {
                    do {
                        repetir = false;
                        System.out.print(numero + ".- ");
                        if (sc.hasNextInt()) {
                            valor = sc.nextInt();
                            if (valor < 0 || valor > 65535) {
                                System.out.println("\tATENCIÓN! Número non dispoñible." + "Volva a introducir. ");
                                repetir = true;
                            }
                        } else {
                            System.out.println("\tERRO: Débese introducir un número entre 0 e 65535");
                            sc.next();
                            repetir = true;
                        }
                    } while (repetir);

                    car = (char) valor;
                    System.out.println("\tValor do carácter: " + car);

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
                        System.out.println(" **Hai " + resultado + " letras**");
                        break;
                    case 2:
                        System.out.println("**Hai " + resultado + " díxitos**");
                        break;
                    case 3:
                        System.out.println("**Hai " + resultado + " maiúsculas**");
                        break;
                }
            }
        }

        System.out.println("Saíndo do programa...");
        sc.close();
    }
}