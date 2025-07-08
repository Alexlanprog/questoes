//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal1= new Gato("Jonas",0.7,"Lisa");
        Animal animal2= new Cachorro("marcia",0.2,"pincher");
        Animal animal3= new Gato("pit",2,"Lisa");
        Animal animal4= new Ave("Jorge",1,"Passeriformes");
        Animal animal5= new Ave("maria",3,"Ratitas");
        Animal animal6= new Cachorro("patrick",1,"bulldog");

        animal1.fazerSom();
        animal2.fazerSom();
        animal3.fazerSom();
        animal4.fazerSom();
        animal5.fazerSom();
        animal6.fazerSom();



    }
}