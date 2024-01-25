package Parchís;

public class Tablero {
    private Casilla[] casillas;

    public Tablero(int cantidadCasillas){
        casillas = new Casilla[cantidadCasillas];
        for (int i = 0; i < cantidadCasillas; i++){
            casillas[i] = new Casilla(i+1);
        }
    }

    public void mostrarTablero(){
        for (Casilla casilla : casillas){
            System.out.println(casilla);
        }
        System.out.println();
    }
    public Casilla obtenerCasilla(int numero){
        for (Casilla casilla : casillas){
            if(casilla.getNumero() == numero){
                return casilla;
            }
        }
        return null;
    }
}
