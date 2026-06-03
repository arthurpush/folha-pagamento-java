public class Funcionario {

    public static final int PADRAO = 1;
    public static final int COMISSIONADO = 2;
    public static final int PRODUCAO = 3;

    public static final double SALARIO_BASE = 2000.00;

    private final int matricula;
    private final String nome;
    private final int tipo;

    private double vendas;
    private double percentualComissao;

    private int quantidadeProduzida;
    private double valorPeca;

    public Funcionario(
            int matricula,
            String nome,
            int tipo) {

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Funcionario(
            int matricula,
            String nome,
            int tipo,
            double vendas,
            double percentualComissao) {

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public Funcionario(
            int matricula,
            String nome,
            int tipo,
            int quantidadeProduzida,
            double valorPeca) {

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPeca = valorPeca;
    }

    public double calcularExtra() {

        switch (tipo) {

            case COMISSIONADO:
                return vendas * percentualComissao / 100;

            case PRODUCAO:
                return quantidadeProduzida * valorPeca;

            default:
                return 0;
        }
    }

    public double calcularSalarioFinal() {

        return SALARIO_BASE + calcularExtra();
    }

    public String getTipoDescricao() {

        switch (tipo) {

            case PADRAO:
                return "Padrão";

            case COMISSIONADO:
                return "Comissionado";

            case PRODUCAO:
                return "Produção";

            default:
                return "Desconhecido";
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}