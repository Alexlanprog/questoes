public class Bicicleta extends Transporte{

    String temMarcha;

    public Bicicleta(int cCapacidade,String cTemMarcha) {
        super(cCapacidade);
        temMarcha = cTemMarcha;
    }

    public void mostrarDetalhes(){
        System.out.println("A bicicleta possui "+ temMarcha + "marchas");
    }
}
