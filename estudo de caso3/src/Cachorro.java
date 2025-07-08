public class Cachorro  extends Animal {
    String raca;

    public Cachorro(String cNome, double cIdade, String cRaca) {
        super(cNome, cIdade);
        raca = cRaca;
    }

    public void fazerSom(){
        System.out.println("Som do cachorro");
    }

}
