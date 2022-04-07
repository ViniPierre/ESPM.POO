package src.espm.poo.ex2;

public class Ex1 {
    
    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();
        
        Cliente pj2 = new PessoaJuridica();

        Banco maryBank = new Banco("Mary Bank");
        maryBank.addCliente(pj1);
        maryBank.addCliente(pj2);

    }
}
