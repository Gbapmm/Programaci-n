package Iteraciones.Iteracion1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", 30, "Ingeniero"));
        personas.add(new Persona(2, "María", 25, "Doctora"));
        personas.add(new Persona(3, "Pedro", 40, "Profesor"));
        personas.add(new Persona(4, "Julia", 18, null));
        personas.add(new Persona(5, "Carlos", 35, "Abogado"));
        personas.add(new Persona(6, "Luisa", 28, "Arquitecta"));
        personas.add(new Persona(7, "Miguel", 45, "Empresario"));
        personas.add(new Persona(8, "Ana", 20, null));
        personas.add(new Persona(9, "Sofía", 33, "Psicóloga"));
        personas.add(new Persona(10, "Diego", 22, "Estudiante"));

        System.out.println("Introduce el codigo de la persona a buscar: ");
        int codigo = scanner.nextInt();

        // Crear un iterador personalizado para buscar personas por código
        Iterator<Persona> iterador = new Iterator<Persona>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < personas.size();
            }

            @Override
            public Persona next() {
                return personas.get(currentIndex++);
            }
        };

        Persona personaEncontrada = null;
        while (iterador.hasNext()) {
            Persona persona = iterador.next();
            if (persona.getCodigo() == codigo) {
                personaEncontrada = persona;
                break;
            }
        }

        if (personaEncontrada != null) {
            System.out.println("Persona encontrada:");
            System.out.println("Código: " + personaEncontrada.getCodigo());
            System.out.println("Nombre: " + personaEncontrada.getNombre());
            System.out.println("Edad: " + personaEncontrada.getEdad());
            System.out.println("Ocupación: "
                    + (personaEncontrada.getOcupacion() != null ? personaEncontrada.getOcupacion() : "Sin ocupación"));
        } else {
            System.out.println("No se encontró ninguna persona con el código " + codigo);
        }

        scanner.close();
    }
}
