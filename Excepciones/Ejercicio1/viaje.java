package Ejercicio1;

import java.util.Random;

public class viaje {

	public static String ir(String origen, String destino) throws ExcepcionBase {
		int tipoAccidente = obtenerTipoAccidente();

		if (tipoAccidente == 1) {
			throw new ExcepcionBase("Accidente leve");
		} else if (tipoAccidente == 2) {
			throw new ExcepcionBase("Accidente grave");
		} else {
			return "He llegado a " +  destino;
		}
	}

	public static String viaje(String origen, String destino) {
		try {
			return ir(origen, destino);
		} catch (ExcepcionBase e) {
			String mensaje = e.getMessage();
			if (mensaje.equals("Accidente leve")) {
				return "Llego tarde";
			} else if (mensaje.equals("Accidente grave")) {
				return "No llego nunca";
			} else {
				return "Al hospital";
			}
		}
	}

	private static int obtenerTipoAccidente() { //Con esto se genera un numero aleatorio de 1-3 para decidir que tipo de accidente ocurre o deja de ocurrir.
        return new Random().nextInt(3);
	}
}