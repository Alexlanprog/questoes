//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Pessoa pessoa1= new Professor("haniel","10231563844","Matematica");
            Pessoa pessoa2= new Aluno("Gabriel", "2932003853","20129");

            pessoa1.exibirDados();;
            pessoa2.exibirDados();
    }
}