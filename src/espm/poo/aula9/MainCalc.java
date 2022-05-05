package src.espm.poo.aula9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalc {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
while (true) {
    try {
        System.out.print("Número 1: ");
        double a = teclado.nextDouble();

        System.out.print("Número 2: ");
        double b = teclado.nextDouble();

        String op = null;
        while (op == null) {
            try {
                op = input("operações [+ - / * ^ !]: ", "-","+","/","!","*","^");
            } catch (ESPMException e) {
                System.err.println("Entrada inválida " + e.getMessage());
                throw new RuntimeException(e.getMessage(), e);
            }
        }

        if (op.equals("!")) {
            break;
        }
        double x = op.equals("-") ? sub(a, b) :
                op.equals("+") ? add(a, b) :
                op.equals("*") ? mult(a, b) :
                op.equals("/") ? div ((int) a, (int) b) :
                op.equals("^") ? exp(a, b) :
                0;

                System.out.println(a + op + b + " = " + x);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.err.println("Erro na operação: " + e.getMessage());
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.err.println("Erro na operação: " + e.getMessage());
                teclado.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Operação ok ou exceção tratada!");
            }
        }
    }
    
    private static String input(String msg, String... possibles) throws ESPMException {
        final Scanner teclado = new Scanner(System.in);
        System.out.print(msg);
        String line = teclado.nextLine().trim();
        for (String item : Arrays.asList(possibles)) {
            if (item.equals(line)) {
                return item;
            }
        }
        throw new ESPMException(line);
    }

    private static double exp(double a, double b) {
        return Math.pow(a, b);
    }

    private static double div(double a, double b) {
        return a / b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    
}
