public class Onibus extends Transporte{
    String linha;

    public Onibus(int cCapacidade,String cLinha) {
        super(cCapacidade);
        linha = cLinha;
    }

    public void mostrarDetalhes(){
        System.out.println("O onibus esta na "+ linha + "ª linha ");
    }
}
