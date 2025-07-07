public class Revista extends ItemBiblioteca{
    String edicao;

    public Revista(int cCodigo,String cTitulo,String cEdicao) {
        super(cTitulo,cCodigo);
        edicao=cEdicao;
    }

    public void exibirInformacao(){
        System.out.println("\nTitulo da revista: "+titulo+ "\n Edicao: "+edicao+"\nCodigo da revista: "+codigo);

    }

}
