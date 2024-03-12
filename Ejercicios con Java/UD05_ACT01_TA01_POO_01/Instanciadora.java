public class Instanciadora {
  public static void main(String[] args) {
      planDePruebas_01();
  }

  public static void planDePruebas_01() {
      // Crear tablero
      Tablero tablero = new Tablero(7, 9);

      // Mostrar tablero con valores numéricos
      System.out.println("Tablero con valores numéricos:");
      tablero.showTableroEstados();

      // Borrar tablero
      System.out.println("\nTablero despues de borrar:");
      tablero.deleteTablero();
      tablero.showTableroEstados();

      // Crear nuevo tablero con variedad de valores
      System.out.println("\nNuevo tablero con variedad de valores:");
      tablero = new Tablero(7, 9);
      tablero.setTableroCostaNoroeste();
      tablero.showTableroGrafico();
  }
}
