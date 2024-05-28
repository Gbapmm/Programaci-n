
import java.time.LocalDate;
import java.time.LocalTime;


public class Factura {

    int numero;
    int codigo;
    LocalDate fecha;
    LocalTime hora;
    Double importe;

    Factura(int numero, int codigo, LocalDate fecha, LocalTime hora, Double importe) {
        this.numero = numero;
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", codigo=" + codigo + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + '}';
    }



}