import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int tamano = random.nextInt(11) + 10;

        for (int i = 0; i < tamano; i++) {
            numeros.add(random.nextInt(101));
        }

        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int numero : numeros) {
            suma += numero;
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
        }

        double media = (double) suma / tamano;

        System.out.println("Números generados: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}