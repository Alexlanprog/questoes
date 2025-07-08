public class Professor extends Pessoa {

    String disciplina;

    public Professor(String cNome,String cCpf,String cDisciplina) {
        super(cNome,cCpf);
        disciplina=cDisciplina;

    }

    public void exibirDados(){
        System.out.println("O professor "+ nome + " da aula de Disciplina: "+ disciplina);
    }
}
