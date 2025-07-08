//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Transporte transporte1 = new Carro(3, 80);
        Transporte transporte2 = new Onibus(25, "20");
        Transporte transporte3 = new Bicicleta(1, "4");

        transporte1.mostrarDetalhes();
        transporte2.mostrarDetalhes();
        transporte3.mostrarDetalhes();
    }
}