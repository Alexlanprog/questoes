//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ItemBiblioteca item1= new Dvd(212,"O grande pavao",140);
        ItemBiblioteca item2= new Revista(90,"O grande Hercules","Edicao de Colecionador");
        ItemBiblioteca item3= new Livro(142,"O Amor","Seu jorge",235);
        ItemBiblioteca item4= new Revista(223,"Uncharted","Edicao Padrao");
        ItemBiblioteca item5= new Livro(40,"guerra dos tronos","Mike",370);
        ItemBiblioteca item6= new Dvd(190,"O escalador",100);

        item1.exibirInformacao();
        item2.exibirInformacao();
        item3.exibirInformacao();
        item4.exibirInformacao();
        item5.exibirInformacao();
        item6.exibirInformacao();


    }
}