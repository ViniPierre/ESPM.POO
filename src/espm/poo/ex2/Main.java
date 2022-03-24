package src.espm.poo.ex2;

import java.util.Scanner;

public class Main {
    
    private static Banco banco = null;

    public static void main(String[] args) {
        
        banco = new Banco();

        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        System.out.print("ESPM> ");
        String input = scan.nextLine().trim().toLowerCase();
        System.out.println(input);

            if ("".equals(input)){ 
            } else if ("exit".equals(input)) {
                exit = true;
            } else if ("help".equals(input)) {
                help();
            } else if ("list".equals(input)) {
                list(banco);
            } else {
                System.err.println("Comando invalido!");
            }
        }
        System.out.println("Bye bye!");
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
    banco.getClientes();
    for (Cliente c : banco.getClientes()) {
        System.out.println(c);
    }



    }
}

