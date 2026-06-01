public class Funcionario {

    public static final int PADRAO = 1;
    public static final int COMISSIONADO = 2;
    public static final int PRODUCAO = 3;

    public static final double SALARIO_FIXO = 1500.00;

    private final int matricula;
    private final String nome;
    private final int tipo;

    private double vendas;
    private double percentualComissao;

    private int quantidadePecas;
    private double valorPeca;

    public Funcionario(int matricula, String nome, int tipo) {
        validarDados(matricula, nome);

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

        validarDados(matricula, nome);

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
            int quantidadePecas,
            double valorPeca) {

        validarDados(matricula, nome);

        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadePecas = quantidadePecas;
        this.valorPeca = valorPeca;
    }

    private void validarDados(int matricula, String nome) {

        if (matricula <= 0) {
            throw new IllegalArgumentException("Matrícula inválida.");
        }

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    public double calcularExtra() {

        return switch (tipo) {

            case COMISSIONADO ->
                vendas * percentualComissao / 100;

            case PRODUCAO ->
                quantidadePecas * valorPeca;

            default -> 0;
        };
    }

    public double calcularSalarioFinal() {
        return SALARIO_FIXO + calcularExtra();
    }

    public String getTipoDescricao() {

        return switch (tipo) {

            case PADRAO -> "Padrão";
            case COMISSIONADO -> "Comissionado";
            case PRODUCAO -> "Produção";
            default -> "Desconhecido";
        };
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}