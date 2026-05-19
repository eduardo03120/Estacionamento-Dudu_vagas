package org.example.classes.org.example;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Estacionamento {

    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;

    public Estacionamento(Tarifario tarifario) {
        this.vagas = new ArrayList<>();
        this.ticketsAbertos = new ArrayList<>();
        this.tarifario = tarifario;
    }

    public void adicionarVaga(Vaga vaga) {
        vagas.add(vaga);
    }

    public void registrarEntrada(Veiculo carro) {

        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {

                vaga.ocupar(carro);

                Ticket ticket =
                        new Ticket(carro, LocalDateTime.now());

                ticketsAbertos.add(ticket);

                System.out.println("Entrada registrada!");
                System.out.println("Vaga: " + vaga.getNumero());
                return;
            }
        }

        System.out.println("Não há vagas disponíveis.");
    }

    public void registrarSaida(String placa) {

        Ticket ticketEncontrado = null;
        Vaga vagaEncontrada = null;

        for (Ticket ticket : ticketsAbertos) {

            if (ticket.getCarro().getPlaca()
                    .equalsIgnoreCase(placa)) {

                ticketEncontrado = ticket;

                for (Vaga vaga : vagas) {

                    if (vaga.isOcupada()
                            && vaga.getCarro().getPlaca()
                            .equalsIgnoreCase(placa)) {

                        vagaEncontrada = vaga;
                        break;
                    }
                }

                break;
            }
        }

        if (ticketEncontrado == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        ticketEncontrado.registrarSaida();

        int horas =
                ticketEncontrado.calcularTempoEmHoras();

        double valor =
                tarifario.calcularValor(horas);

        if (vagaEncontrada != null) {
            vagaEncontrada.liberar();
        }

        ticketsAbertos.remove(ticketEncontrado);

        System.out.println("Saída registrada!");
        System.out.println("Tempo: "
                + horas + " hora(s)");
        System.out.println("Valor: R$ "
                + valor);
    }

    public void exibirVagasLivres() {

        System.out.println("Vagas livres:");

        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {
                System.out.println(
                        "Vaga " + vaga.getNumero());
            }
        }
    }
}