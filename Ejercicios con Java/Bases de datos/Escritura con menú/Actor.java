package bd6;

import java.time.LocalDateTime;

public class Actor {
    //Campos de la base de datos
   private int id;
   private String nombre;
   private String apellido;
   private LocalDateTime update;
   //
   private boolean nuevo;
   private boolean modificado;

    public Actor(int id, String nombre, String apellido, LocalDateTime update, boolean nuevo, boolean modificado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.update = update;
        this.nuevo = nuevo;
        this.modificado = modificado;
    }

    public Actor(int id, String nombre, String apellido, LocalDateTime update) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.update = update;
        nuevo = false;
        modificado = false;
    }
    
     public Actor(String nombre, String apellido, LocalDateTime update) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.update = update;
        nuevo = false;
        modificado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    @Override
    public String toString() {
        return "Actor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", update=" + update + '}';
    }
}