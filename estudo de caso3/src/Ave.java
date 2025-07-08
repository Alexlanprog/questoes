public class Ave  extends Animal {

    String tipo;

    public Ave(String cNome, double cIdade, String cTipo) {
        super(cNome, cIdade);
        tipo = cTipo;
    }

    public void fazerSom(){
        System.out.println("Som da ave");
    }

}
