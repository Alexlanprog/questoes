public abstract class Pessoa {
    String nome,cpf;

    public Pessoa(String cNome, String cCpf) {
        nome = cNome;
        cpf = cCpf;
    }

    public abstract void exibirDados();
}
