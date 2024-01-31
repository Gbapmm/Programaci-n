package Ejercicio7;

public class Moneda {

	private int valor;
	private String posicion;

	public Moneda(int valor, String posicion) {
		this.posicion = posicion;
		this.valor = valor;
	}

	public String toString() {
		if (valor < 100) {
			return "Moneda de " + valor + " céntimos";
		} else {
			return "Moneda de " + (valor / 100) + " euros";
		}
	}
}
