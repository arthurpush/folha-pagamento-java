public class Funcionario {

    public static final double SALARIO_FIXO = 1500.0;

    private int matricula;
    private String nome;
    private int tipo;

    private double vendas;
    private double percentualComissao;

    private int quantidadePecas;
    private double valorPeca;

    public Funcionario(int matricula, String nome, int tipo) {
        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Funcionario(int matricula, String nome, int tipo,
            double vendas, double percentualComissao) {

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public Funcionario(int matricula, String nome, int tipo,
            int quantidadePecas, double valorPeca) {

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadePecas = quantidadePecas;
        this.valorPeca = valorPeca;
    }

    public double calcularExtra() {

        switch (tipo) {

            case 2:
                return vendas * percentualComissao / 100;

            case 3:
                return quantidadePecas * valorPeca;

            default:
                return 0;
        }
    }

    public double calcularSalarioFinal() {
        return SALARIO_FIXO + calcularExtra();
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}