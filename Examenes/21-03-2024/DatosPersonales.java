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

    @Override
    public String toString() {
        return  nombre + ".\n"
                + "Apellidos: " + apellidos + ".\n"
                + "Fecha nacimiento: " + fechanac + ".";
    }
}
