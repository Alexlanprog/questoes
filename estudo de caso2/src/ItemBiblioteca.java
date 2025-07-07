public abstract class ItemBiblioteca {

    String titulo;
    int codigo;

    public ItemBiblioteca(String cTituo, int cCodigo) {
        titulo = cTituo;
        codigo= cCodigo;

    }

    public abstract void exibirInformacao();

}
