//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Funcionario funcionario1 = new Horista("Nicolas","10120288830",30,20);
            Funcionario funcionario2= new Mensalista("Lucas","12212100129",2100);
            Funcionario funcionario3 = new Horista("Nick","112310041412",30,25);
            Funcionario funcionario4= new Mensalista("Alex","88502340089",2100);


            funcionario1.calcularPagamento();
            funcionario2.calcularPagamento();
            funcionario3.calcularPagamento();
            funcionario4.calcularPagamento();
    }
}