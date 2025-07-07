public class Horista extends Funcionario {
    int horasTra, valorHora,sal;

    public Horista(String cNome, String cCpf, int cHorasTra, int cValorHora) {
        super(cNome,cCpf);
        horasTra = cHorasTra;
        valorHora = cValorHora;
    }

    public  void calcularPagamento(){
        sal = horasTra * valorHora;

         System.out.println("O salario de "+ nome + " e "+ sal);
    }

}
