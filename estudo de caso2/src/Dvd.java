public class Dvd extends ItemBiblioteca {
    int duracao;

    public Dvd(int cCodigo,String cTitulo, int cDuracao) {
        super(cTitulo,cCodigo);
        duracao=cDuracao;
    }

    @Override
    public void exibirInformacao(){
        System.out.println("\nTitulo do dvd: "+titulo+ "\nDuracao do dvd: "+duracao+"horas\nCodigo do dvd: "+codigo);

    }

}
