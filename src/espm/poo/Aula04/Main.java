package src.espm.poo.Aula04;

public class Main {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(10, "Seumini");
        System.out.println(a1);
        Aluno a2 = new Aluno(11, "Ceúmini");
        System.out.println(a2);

        if (a1.equals(a2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
        System.out.println("Vini vai toma no cu!");
        
    }
}
