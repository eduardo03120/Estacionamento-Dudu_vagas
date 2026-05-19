import org.example.classes.org.example.Estacionamento;
import org.example.classes.org.example.Tarifario;
import org.example.classes.org.example.Vaga;
import org.example.classes.org.example.Veiculo;
import java.util.Scanner;

public class Dudu_vagas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando tarifário
        Tarifario tarifario =
                new Tarifario(5, 50, 300, 1000);

        // Criando estacionamento
        Estacionamento estacionamento =
                new Estacionamento(tarifario);

        // Criando vagas
        estacionamento.adicionarVaga(new Vaga(1));
        estacionamento.adicionarVaga(new Vaga(2));
        estacionamento.adicionarVaga(new Vaga(3));

        int opcao;

        do {

            System.out.println("\n----- DUDU VAGAS -----");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saída");
            System.out.println("3 - Exibir vagas livres");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    Veiculo carro =
                            new Veiculo(placa, modelo);

                    estacionamento.registrarEntrada(carro);
                    break;

                case 2:

                    System.out.print("Digite a placa do carro: ");
                    String placaSaida =
                            scanner.nextLine();

                    estacionamento.registrarSaida(placaSaida);
                    break;

                case 3:

                    estacionamento.exibirVagasLivres();
                    break;

                case 4:

                    System.out.println("Saindo do sistema...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}