package src.espm.poo.aula9;

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

        System.out.print("operações [+ - / * ^ !]: ");
        teclado.nextLine();
        String op = teclado.nextLine();
        
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
                System.out.println("Erro na operação:" + e.getMessage());
            }
        }
    
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
