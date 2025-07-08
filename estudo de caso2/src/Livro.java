public class Livro extends ItemBiblioteca{
        String autor;
        int numeroPaginas;

        public Livro(int cCodigo,String cTitulo,String cAutor, int cNumeroPaginas) {
            super(cTitulo,cCodigo);
            autor = cAutor;
            numeroPaginas = cNumeroPaginas;
        }

        @Override
    public void exibirInformacao(){
            System.out.println("\nAutor: "+autor+"\nTitulo do livro: "+titulo+ "\nNumero de Paginas: "+numeroPaginas+"\nCodigo do livro: "+codigo);

    }

}
