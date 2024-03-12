import java.util.Random;

public class Tablero {
  private int fila;
  private int columna;
  private int[][] tablero;

  // Se crea el constructor del Tablero
  public Tablero(int fila, int columna) {
      this.fila = fila;
      this.columna = columna;
      this.tablero = new int[fila][columna];
  }

  // se crean los Getters/Setters para filas, columnas y Estado
  public int getFila() {
      return fila;
  }

  public void setFila(int fila) {
      this.fila = fila;
  }

  public int getColumna() {
      return columna;
  }

  public void setColumna(int columna) {
      this.columna = columna;
  }

  public void setEstado(int fila, int columna, int estado) {
      tablero[fila][columna] = estado;
  }

  //Se crea un tablero que muestre los valores numericos de los estados
  public void showTableroEstados() {
      for (int i = 0; i < fila; i++) {
          for (int j = 0; j < columna; j++) {
              System.out.print(tablero[i][j] + " ");
          }
          System.out.println();
      }
  }

  //Se crea un switch para identificar cada estado en el tablero
  public void showTableroGrafico() {
    for (int i = 0; i < fila; i++) {
        for (int j = 0; j < columna; j++) {
            switch (tablero[i][j]) {
                case 1:
                    System.out.print("# ");
                    break;
                case 2:
                    System.out.print("~ ");
                    break;
                case 3:
                    System.out.print("x ");
                    break;
                case 4:
                    System.out.print("* ");
                    break;
                default:
                    System.out.print("Error ");
            }
        }
        System.out.println();
    }
}
//Se crea el tablero con costa y estados varios
public void setTableroCostaNoroeste() {
  Random rand = new Random();

  for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
          if (i == 0 || j == 0) {
              // Tierra en la costa 
              tablero[i][j] = 1;
          } else {
              // Se introduce variedad: 2 (Mar), 3 (Peces no), o 4 (Peces sí) de forma aleatoria
              int randomValue = rand.nextInt(3) + 2;
              tablero[i][j] = randomValue;
          }
      }
  }
}

//Se borra el tablero y pone Tierra
public void deleteTablero() {
  for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
          tablero[i][j] = 1; 
      }
  }
}

}
