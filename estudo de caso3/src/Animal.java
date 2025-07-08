public abstract class  Animal {
    String nome;
    double idade;

    public Animal(String cNome, double cIdade) {
        nome = cNome;
        idade= cIdade;
    }

    public abstract void fazerSom();
}
