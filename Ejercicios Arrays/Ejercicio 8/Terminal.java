public class Terminal{

private String numero;
private int tiempo;

public Terminal(String numero){
  this.numero=numero;
  this.tiempo = 0;
}
public void llama(Terminal destino, int duracion){
  this.tiempo += duracion;
  destino.tiempo += duracion;
}

@Override
    public String toString() {
        return "Numero: " + numero + " - " + tiempo + "s de conversacion";
    }
}