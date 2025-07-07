public class Mensalista extends Funcionario {

    int salariofixo;



    public Mensalista(String cNome, String cCpf, int cSalarioafixo) {
        super(cNome,cCpf);
        salariofixo = cSalarioafixo;
    }

    public  void calcularPagamento(){
      System.out.println("O salario de "+ nome + " e "+salariofixo);

    }

}
