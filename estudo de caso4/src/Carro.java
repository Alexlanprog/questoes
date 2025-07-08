public class Carro extends Transporte {

    float combustivel;

    public Carro(int cCapacidade,float cCombustivel) {
        super(cCapacidade);
        combustivel = cCombustivel;
    }

    public void mostrarDetalhes(){
        System.out.println("O carro possui "+ combustivel + "litros de gasolina");
    }
}
