package src.espm.poo.aula08;

public abstract class Pagamento {
    
    private final double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double efetivar() {
        double valorTotal = this.calcularTotal();
        return valorTotal;
    }

    protected abstract double calcularTotal();

    public double getValor() {
        return valor;
    }
     
}
