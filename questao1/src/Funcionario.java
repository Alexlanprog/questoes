public  abstract class Funcionario {
    String nome,cpf;

    public Funcionario(String cNome, String cCpf) {
            nome = cNome;
            cpf = cCpf;
    }

    public abstract void calcularPagamento();

}
