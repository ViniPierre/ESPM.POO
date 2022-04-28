package src.espm.poo.aula08;

public class PagamentoDolar extends Pagamento{

    private final double cambio;
    private final double taxa;

    public PagamentoDolar(double valor, double cambio, double taxa) {
        super(valor);
        this.taxa = taxa;
        this.cambio = cambio;
    }

    @Override
    protected double calcularTotal() {
        return super.getValor() * cambio + taxa;
    }
    
}
