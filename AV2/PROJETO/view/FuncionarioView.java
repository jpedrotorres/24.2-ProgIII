package view;

import controller.FuncionarioController;
import model.*;

import java.util.Scanner;

public class FuncionarioView {
    private FuncionarioController controller;
    private Scanner scanner;

    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Alterar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");

            System.out.print("Escolha a opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> listarFuncionarios();
                case 3 -> alterarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void adicionarProduto() {
        Funcionario funcionario = null;

        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();
        System.out.print("Digite o nome: ");
        scanner.nextLine();  // Limpa o buffer
        String nome = scanner.nextLine();
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Escolha o tipo: 1-Desenvolvedor, 2-Gerente, 3-Treinador, 4-Gerente Desenvolvedor -> ");
        int tipo = scanner.nextInt();

        switch (tipo) {
            case 1 -> funcionario = new Desenvolvedor(id, nome, salario);
            case 2 -> funcionario = new Gerente(id, nome, salario);
            case 3 -> funcionario = new Treinador(id, nome, salario);
            case 4 -> funcionario = new GerenteDesenvolvedor(id, nome, salario);
            default -> System.out.println("Tipo inválido! Funcionário não adicionado.");
        }

        if (funcionario != null) {
            controller.adicionarFuncionario(funcionario);
        }
    }

    private void listarFuncionarios() {
        controller.listarFuncionarios();
    }

    private void alterarFuncionario() {
        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();
        System.out.print("Digite o aumento salarial: ");
        double aumento = scanner.nextDouble();

        controller.atualizarSalario(id, aumento);
    }

    private void excluirFuncionario() {
        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();

        controller.excluirFuncionario(id);
    }
}
