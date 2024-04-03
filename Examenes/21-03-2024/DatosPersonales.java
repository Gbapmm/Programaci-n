package Examen_I_Rec;

class DatosPersonales {
    private String nombre;
    private String apellidos;
    private String fechanac;

    public DatosPersonales(String nombre, String apellidos, String fechanac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanac = fechanac;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }
}
