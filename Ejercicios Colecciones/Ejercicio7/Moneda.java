package Ejercicio7;

public class Moneda {

	private String valor;
	private String posicion;

	public Moneda(String valor, String posicion) {
		this.valor = valor;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return valor + " - " + posicion;
	}
}
