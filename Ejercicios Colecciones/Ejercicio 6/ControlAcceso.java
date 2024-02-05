package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {

        Map<String, Usuario> usuarios = new HashMap<>();
        usuarios.put("usuario1", new Usuario("Pedro", 9123));
        usuarios.put("usuario2", new Usuario("Juan", 2344));
        
        int intentosMaximos = 3;


        autenticarUsuario(usuarios, intentosMaximos);
    }
    
    private static void autenticarUsuario(Map<String, Usuario> usuarios, int intentosMaximos) {
        Scanner scanner = new Scanner(System.in);

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Ingrese nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese contraseña: ");
            int contraseña = scanner.nextInt();

            if (verificarCredenciales(usuarios, nombreUsuario, contraseña)) {
                System.out.println("Ha accedido al área restringida.");
                scanner.close();
                return;
            } else {
                System.out.println("Credenciales incorrectas. Intento " + intento + " de " + intentosMaximos);
            }
        }

        System.out.println("Lo siento, no tiene acceso al área restringida.");
        scanner.close();
    }
        
        private static boolean verificarCredenciales(Map<String, Usuario> usuarios, String nombreUsuario, int contraseña) {
            // Verificar si el usuario existe y la contraseña coincide
            if (usuarios.containsKey(nombreUsuario)) {
                int contraseñaAlmacenada = usuarios.get(nombreUsuario).getContraseña();
                return contraseñaAlmacenada == contraseña;
            }
            return false;
        }



}