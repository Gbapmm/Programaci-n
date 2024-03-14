package PriorityQueue;

public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private String citaPrevia;

    public Cliente(String nombre, String citaPrevia) {
        this.nombre = nombre;
        this.citaPrevia = citaPrevia;
    }

    public String getCitaPrevia() {
        return citaPrevia != null ? citaPrevia : "No";
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        // Si el otro cliente tiene cita previa y este no, el otro cliente tiene mayor prioridad
        if (otroCliente.getCitaPrevia().equals("Si") && this.getCitaPrevia().equals("No")) {
            return 1;
        }
        // Si este cliente tiene cita previa y el otro no, este cliente tiene mayor prioridad
        else if (this.getCitaPrevia().equals("Si") && otroCliente.getCitaPrevia().equals("No")) {
            return -1;
        }
        // Si ambos tienen cita previa o ambos no tienen, ordenamos alfabéticamente por nombre
        else {
            return this.nombre.compareTo(otroCliente.nombre);
        }
    }

    @Override
    public String toString() {
        return "Siguiente cliente: " + nombre + " (" + citaPrevia + ")";
    }
}
