package src.espm.poo.ex2;

import java.util.Scanner;

public class Main {
    
    private static Banco banco = null;

    public static void main(String[] args) {
        
        banco = new Banco("ESPM Bank");

        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {

        System.out.print("ESPM> ");
        String input = scan.nextLine().trim().toLowerCase();

            if ("".equals(input)){ 
            } else if ("exit".equals(input)) {
                exit = true;
            } else if ("help".equals(input)) {
                help();
            } else if ("list".equals(input)) {
                list(banco);
            } else if ("add".equals(input)) {
                add(banco);
            } else if ("find".equals(input)) {
                throw new UnsupportedOperationException();
            } else {
                System.err.println("Comando invalido!");
            }
        
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }   
    }
        System.out.println("Bye bye!");
        scan.close();
    }
    
private static void help() {
    System.out.println("ESPM Sistema de Clientes");
    System.out.println("------------------------");
    System.out.println("add -> Cadastrar cliente");
    System.out.println("list -> Listar clientes");
    System.out.println("del -> Apaga cliente");
    System.out.println("find -> Localiza cliente");
    System.out.println();
    System.out.println("exit -> Encerra terminal");
}

private static void list(Banco banco) {
    banco.getClientes().forEach(c -> System.out.println(c.toString()));
    }

private static void add(Banco banco) {
    Cliente c = new Cliente();

    Scanner scan = new Scanner(System.in);
    System.out.print("Nome: ");
    String nome = scan.nextLine();
    System.out.print("CPF: ");
    String cpf = scan.nextLine();
    

    c.setNome(nome);
    //To do: quebrou o codigo

    banco.add(c);


    }

}

