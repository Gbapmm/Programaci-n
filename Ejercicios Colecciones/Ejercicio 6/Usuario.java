package Ejercicio6;

public class Usuario {
    private String nombreUsuario;
    private int contraseña;

    public Usuario(String nombreUsuario, int contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }
}
