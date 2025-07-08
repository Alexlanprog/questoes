public class Aluno extends Pessoa {

    String matricula;

    public Aluno(String cNome,String cCpf,String cMatricula) {
        super(cNome,cCpf);
        matricula=cMatricula;

    }

    public void exibirDados(){
        System.out.println("O Aluno "+ nome + " possui a seguinte matricula: "+matricula);
    }
}
