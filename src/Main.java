/*
 * Projeto: Sistema de Folha de Pagamento
 * Disciplina: Algoritmos e Programação
 * Autor: Arthur Araujo Soares
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {

            exibirMenu();

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> cadastrarPadrao();

                case 2 -> cadastrarComissionado();

                case 3 -> cadastrarProducao();

                case 4 -> gerarFolha();

                case 0 -> System.out.println("Programa encerrado.");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {

        System.out.println("\n===== FOLHA DE PAGAMENTO =====");
        System.out.println("1 - Funcionário Padrão");
        System.out.println("2 - Funcionário Comissionado");
        System.out.println("3 - Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static String lerNome() {

        String nome;

        do {
            System.out.print("Nome completo: ");
            nome = sc.nextLine();

            if (nome.isBlank()) {
                System.out.println("Nome inválido.");
            }

        } while (nome.isBlank());

        return nome;
    }

    private static int lerMatricula() {

        int matricula;

        do {

            System.out.print("Matrícula: ");
            matricula = sc.nextInt();

            if (matricula <= 0) {
                System.out.println("Matrícula inválida.");
            }

        } while (matricula <= 0);

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getMatricula() == matricula) {
                System.out.println("Matrícula já cadastrada.");
                return lerMatricula();
            }
        }

        return matricula;
    }

    private static void cadastrarPadrao() {

        String nome = lerNome();
        int matricula = lerMatricula();

        funcionarios.add(
                new Funcionario(
                        matricula,
                        nome,
                        Funcionario.PADRAO));

        System.out.println("Funcionário padrão cadastrado.");
    }

    private static void cadastrarComissionado() {

        String nome = lerNome();
        int matricula = lerMatricula();

        double vendas;

        do {
            System.out.print("Valor das vendas: ");
            vendas = sc.nextDouble();

            if (vendas < 0) {
                System.out.println("Valor inválido.");
            }

        } while (vendas < 0);

        double percentual;

        do {
            System.out.print("Percentual de comissão: ");
            percentual = sc.nextDouble();

            if (percentual < 0) {
                System.out.println("Percentual inválido.");
            }

        } while (percentual < 0);

        funcionarios.add(
                new Funcionario(
                        matricula,
                        nome,
                        Funcionario.COMISSIONADO,
                        vendas,
                        percentual));

        System.out.println("Funcionário comissionado cadastrado.");
    }

    private static void cadastrarProducao() {

        String nome = lerNome();
        int matricula = lerMatricula();

        int quantidade;

        do {
            System.out.print("Quantidade produzida: ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Quantidade inválida.");
            }

        } while (quantidade < 0);

        double valorPeca;

        do {
            System.out.print("Valor por peça: ");
            valorPeca = sc.nextDouble();

            if (valorPeca < 0) {
                System.out.println("Valor inválido.");
            }

        } while (valorPeca < 0);

        funcionarios.add(
                new Funcionario(
                        matricula,
                        nome,
                        Funcionario.PRODUCAO,
                        quantidade,
                        valorPeca));

        System.out.println("Funcionário de produção cadastrado.");
    }

    private static void gerarFolha() {

        System.out.println("\n===== FOLHA DE PAGAMENTO =====");

        if (funcionarios.isEmpty()) {

            System.out.println("Nenhum funcionário cadastrado.");
            return;

        } else if (funcionarios.size() == 1) {

            System.out.println("Total de funcionários: 1");

        } else {

            System.out.println(
                    "Total de funcionários: "
                            + funcionarios.size());
        }

        for (Funcionario funcionario : funcionarios) {

            System.out.println("\n----------------------------");

            System.out.println(
                    "Nome: "
                            + funcionario.getNome());

            System.out.println(
                    "Matrícula: "
                            + funcionario.getMatricula());

            System.out.println(
                    "Tipo: "
                            + funcionario.getTipoDescricao());

            System.out.printf(
                    "Salário Base: R$ %.2f%n",
                    Funcionario.SALARIO_BASE);

            System.out.printf(
                    "Extras: R$ %.2f%n",
                    funcionario.calcularExtra());

            System.out.printf(
                    "Salário Final: R$ %.2f%n",
                    funcionario.calcularSalarioFinal());
        }
    }
}