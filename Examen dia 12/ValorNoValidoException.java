package ExamenYo;

public class ValorNoValidoException extends Exception {
    public ValorNoValidoException() {
        super("El valor proporcionado no es válido. Por favor, introduzca un valor positivo.");
    }
}
