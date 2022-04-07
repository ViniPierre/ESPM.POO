package src.espm.poo.Quiz;

public class Y {
    int id;
    String descricao;

    public Y(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    //método main codificado dentro da própria classe! Totalmente possível
   public static void main(String[] args) {
        Y y = new Y();
        y.id = 1;
        y.descricao = "espm";
        System.out.println(y.descricao);
   }
}