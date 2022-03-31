package src.espm.poo.ex2;

public class Conta {
    
    private int id;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
    if (this.saldo >= valor) {
        this.saldo = this.saldo - valor;
        }
    }
    public void depositar(double valor) {
    if (valor > 0) {
        this.saldo = this.saldo + valor;
        }
    }
}
