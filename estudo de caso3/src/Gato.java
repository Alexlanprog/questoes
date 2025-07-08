public class Gato extends Animal {

    String pelagem;

    public Gato(String cNome, double cIdade, String cPelagem) {
        super(cNome,cIdade);
        pelagem = cPelagem;
    }

    public void fazerSom(){
        System.out.println("Som do gato");
    }

}
