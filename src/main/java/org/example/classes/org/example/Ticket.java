package org.example.classes.org.example;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private Veiculo carro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public Ticket(Veiculo carro, LocalDateTime horaEntrada) {
        this.carro = carro;
        this.horaEntrada = horaEntrada;
    }

    public void registrarSaida() {
        this.horaSaida = LocalDateTime.now();
    }

    public int calcularTempoEmHoras() {


        if (horaSaida == null) {
            return 0;
        }

        Duration duracao = Duration.between(horaEntrada, horaSaida);

        // Arredonda para cima caso tenha minutos extras
        long horas = duracao.toHours();

        if (duracao.toMinutes() % 60 != 0) {
            horas++;
        }

        return (int) horas;
    }


    public Veiculo getCarro() {
        return carro;
    }

    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
