package Examen14;

import java.util.Scanner;
import java.util.Iterator;
import examen240314.Usuarios;

public class Control {

  public void showVuelos() {
    if (colaDeVuelos == null || colaDeVuelos.isEmpty()) {
      System.out.println("No hay ningún vuelo registrado.");
      return;
    }

    System.out.println("Información de vuelos en la cola:");
    Iterator<Vuelo> iterator = colaDeVuelos.iterator();
    while (iterator.hasNext()) {
      Vuelo vuelo = iterator.next();
      System.out.println(vuelo);
    }
  }

  public static boolean login(Usuarios usuarios) {
    Scanner scanner = new Scanner(System.in);
    String username = "";
    String password = "";

    for (int i = 0; i < 3; i++) {
      System.out.println("Introduce tu nombre de usuario");
       username = scanner.next();
      System.out.println("Introduce tu contraseña");
       password = scanner.next();
    }

    if (usuarios.getUsuarios().containsKey(username) && usuarios.getUsuarios().get(username).equals(password)) {
      System.out.println("Inicio de sesión exitoso");
      return true;
    } else {
      System.out.println("Nombre de usuario o contraseña incorrectos. Intentos restantes: " + (3 - i - 1));
    }
    System.out.println("Has excedido el número máximo de intentos. Saliendo del programa.");
    scanner.close();
    return false;
  }

  public static void mostrarAgradecimiento(long inicio) {
    long fin = System.currentTimeMillis();
    long tiempoTranscurrido = (fin - inicio) / (1000 * 60); // Convertir de milisegundos a minutos
    System.out.println("Saliendo del programa. Han pasado " + tiempoTranscurrido + " minutos desde el inicio.");
}
}
