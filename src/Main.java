
/*
 * Projeto: Sistema de Folha de Pagamento
 * Disciplina: ALGORITMOS E PROGRAMAÇÃO
 * Autor: Arthur Araujo Soares
 * Data: 01/06/2026
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
        System.out.println("4 - Gerar Folha");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static String lerNome() {

        System.out.print("Nome: ");
        return sc.nextLine();
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

        System.out.println("Funcionário cadastrado.");
    }

    private static void cadastrarComissionado() {

        String nome = lerNome();
        int matricula = lerMatricula();

        System.out.print("Valor das vendas: ");
        double vendas = sc.nextDouble();

        System.out.print("Percentual da comissão: ");
        double percentual = sc.nextDouble();

        funcionarios.add(
                new Funcionario(
                        matricula,
                        nome,
                        Funcionario.COMISSIONADO,
                        vendas,
                        percentual));

        System.out.println("Funcionário cadastrado.");
    }

    private static void cadastrarProducao() {

        String nome = lerNome();
        int matricula = lerMatricula();

        System.out.print("Quantidade de peças: ");
        int quantidade = sc.nextInt();

        System.out.print("Valor por peça: ");
        double valorPeca = sc.nextDouble();

        funcionarios.add(
                new Funcionario(
                        matricula,
                        nome,
                        Funcionario.PRODUCAO,
                        quantidade,
                        valorPeca));

        System.out.println("Funcionário cadastrado.");
    }

    private static void gerarFolha() {

        System.out.println("\n===== FOLHA DE PAGAMENTO =====");

        for (Funcionario funcionario : funcionarios) {

            System.out.println("\n----------------------------");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Matrícula: " + funcionario.getMatricula());
            System.out.println("Tipo: " + funcionario.getTipoDescricao());

            System.out.printf(
                    "Salário Fixo: R$ %.2f%n",
                    Funcionario.SALARIO_FIXO);

            System.out.printf(
                    "Extras: R$ %.2f%n",
                    funcionario.calcularExtra());

            System.out.printf(
                    "Salário Final: R$ %.2f%n",
                    funcionario.calcularSalarioFinal());
        }
    }
}