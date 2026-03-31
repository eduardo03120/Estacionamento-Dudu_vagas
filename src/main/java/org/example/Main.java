package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n-----  DUDU VAGAS -----");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saida");
            System.out.println("3 - Exibir vagas livres");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Usuario digitou: "+ opcao);
        }while(opcao != 4);
        System.out.println("O usuario saiu do sistema");
    }
}
