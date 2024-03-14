package Ejercicio5;

import java.util.HashMap;

public class Diccionario {
  private HashMap<String, String> Diccionario;

  public Diccionario() {
    this.Diccionario = new HashMap<>();
  }

  public void añadirTermino(String catellano, String gallego) {
    this.Diccionario.put(catellano, gallego);
  }

  public void buscarTermino(String castellano, String gallego) {
    if (Diccionario.containsKey(castellano)) {
      System.out.println("Este termino en gallego es: " + Diccionario.get(gallego));
    } else {
      System.out.println("Este termino no está registrado.");
    }
  }

  public void modificarTermino(String castellano, String gallegoNuevo) {
    if (Diccionario.containsKey(castellano)) {
      this.Diccionario.put(castellano, gallegoNuevo);
      System.out.println("Término modificado correctamente.");
    } else {
      System.out.println("El término '" + castellano + "' no existe en el diccionario.");
    }
  }

  public void eliminarTermino(String castellano, String gallego) {
    for (HashMap.Entry<String, String> entry : Diccionario.entrySet()) {
      if (entry.getKey().equals(castellano) && entry.getValue().equals(gallego)) {
        Diccionario.remove(entry.getKey());
        System.out.println("Término eliminado correctamente.");
        return; // Salir del método después de eliminar el término
      }
    }
    // Si no se encontró el término
    System.out.println("El término introducido no existe en el diccionario.");
  }
}
