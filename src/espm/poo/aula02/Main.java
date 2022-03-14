package src.espm.poo.aula02;

public class Main {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Humberto";
        p1.idade = 15;
        p1.salario = 800.12;

        Pessoa p2 = new Pessoa();
        p2.nome = "Sandra";
        p2.idade = 22;
        p2.salario = 45000;

        Pessoa p3 = p1;
        
        System.out.println(p3.nome);
        p3.nome = "Selmini";
        System.out.println(p1.nome);

        System.out.println();

        p1.imprimir();
        System.out.println();
        p3.imprimir();

        String nome = "Humberto";
        if (nome.equals("Humberto")) {
            System.out.println("C1: igual");
        }

        String n2 = "Doisberto"
    }
}
