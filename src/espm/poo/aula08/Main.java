package src.espm.poo.aula08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Pagamento> pagamentos = new ArrayList<>();

        Pagamento pg1 = new PagamentoCartao(400, 20);
        Pagamento pg2 =  new PagamentoDolar(400 ,5.2, 10);

        pagamentos.add(pg1);
        pagamentos.add(pg2);

        pagamentos.forEach(p -> {
            System.out.println(p.efetivar());
        });
    }
}
