package ExamenYo;

import java.time.LocalDateTime;

public class Vuelo {
    private String idVuelo;
    private String origenVuelo;
    private String destinoVuelo;
    private LocalDateTime horaLlegada;
    private LocalDateTime horaSalida;

    public Vuelo(String idVuelo, String origenVuelo, String destinoVuelo, LocalDateTime horaLlegada,
            LocalDateTime horaSalida) {
        this.idVuelo = idVuelo;
        this.origenVuelo = origenVuelo;
        this.destinoVuelo = destinoVuelo;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Código del vuelo: " + idVuelo + "Origen del vuelo: " + origenVuelo + "Destino del vuelo: "
                + destinoVuelo + "Hora de llegada: " + horaLlegada + "Hora de salida: " + horaSalida;
    }
}