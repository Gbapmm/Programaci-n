import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        switch (compararCadeas()) {
            case -1:
                System.out.println("As cadeas non son iguais. A súa lonxitude "
                        + "non coincide.");
                break;
            case 0:
                System.out.println("As cadeas non son iguais. Non conteñen os "
                        + "mesmos caracteres.");
                break;
            case 1:
                System.out.println("As cadeas son iguais, pero non coinciden "
                        + "no caso no que están escritas.");
                break;
            case 2:
                System.out.println("As cadeas son exactamente iguais.");
                break;
        }
    }

    public static byte compararCadeas() {
        boolean repetir = true;
        byte resultado = 0;
        String cadea;
        String cadeaR;
        Scanner sc = new Scanner(System.in);

        do {
            repetir = false;
            System.out.print("Introduza unha cadea: ");
            cadea = sc.nextLine();
            System.out.print("Repita a cadea: ");
            cadeaR = sc.nextLine();

            if (cadea.isEmpty() || cadeaR.isEmpty()) {
                System.out.println("\tERRO: Debe introducirse algunha cadea.");
                repetir = true;
            } else {
                if (cadea.length() == cadeaR.length()) {
                    if (cadea.equals(cadeaR)) {
                        resultado = 2;
                    } else if (cadea.equalsIgnoreCase(cadeaR)) {
                        resultado = 1;
                    } else {
                        resultado = 0;
                    }
                } else {
                    resultado = -1;
                }
            }
        } while (repetir);

        sc.close(); 
        return resultado;
    }
}
