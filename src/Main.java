import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== FOLHA DE PAGAMENTO =====");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nomePadrao = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matriculaPadrao = sc.nextInt();

                    funcionarios.add(
                            new Funcionario(
                                    matriculaPadrao,
                                    nomePadrao,
                                    1));

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 2:

                    System.out.print("Nome: ");
                    String nomeComissao = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matriculaComissao = sc.nextInt();

                    double vendas;

                    do {
                        System.out.print("Valor das vendas: ");
                        vendas = sc.nextDouble();
                    } while (vendas < 0);

                    double percentual;

                    do {
                        System.out.print("Percentual de comissão: ");
                        percentual = sc.nextDouble();
                    } while (percentual < 0);

                    funcionarios.add(
                            new Funcionario(
                                    matriculaComissao,
                                    nomeComissao,
                                    2,
                                    vendas,
                                    percentual));

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 3:

                    System.out.print("Nome: ");
                    String nomeProducao = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matriculaProducao = sc.nextInt();

                    int quantidade;

                    do {
                        System.out.print("Quantidade de peças: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0);

                    double valorPeca;

                    do {
                        System.out.print("Valor da peça: ");
                        valorPeca = sc.nextDouble();
                    } while (valorPeca < 0);

                    funcionarios.add(
                            new Funcionario(
                                    matriculaProducao,
                                    nomeProducao,
                                    3,
                                    quantidade,
                                    valorPeca));

                    System.out.println("Funcionário cadastrado!");
                    break;

                case 4:

                    System.out.println("\n===== FOLHA DE PAGAMENTO =====");

                    System.out.println(
                            "Total de pessoas cadastradas: "
                                    + funcionarios.size());

                    for (Funcionario f : funcionarios) {

                        System.out.println("\n--------------------");

                        System.out.println("Nome: " + f.getNome());
                        System.out.println("Matrícula: " + f.getMatricula());

                        System.out.println(
                                "Salário Fixo: R$ "
                                        + Funcionario.SALARIO_FIXO);

                        if (f.getTipo() == 1) {

                            System.out.println("Extras: R$ 0.0");

                        } else if (f.getTipo() == 2) {

                            System.out.println(
                                    "Comissão: R$ "
                                            + f.calcularExtra());

                        } else {

                            System.out.println(
                                    "Produtividade: R$ "
                                            + f.calcularExtra());
                        }

                        System.out.println(
                                "Salário Final: R$ "
                                        + f.calcularSalarioFinal());
                    }

                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}