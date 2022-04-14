package src.espm.poo.ex2;

public class Ex1 {
    
    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Rodrigo ME");
        pj1.setCnpj("123.213.231/0001-21");

        Cliente pj2 = new PessoaJuridica();

        Banco maryBank = new Banco("mary Bank");
        maryBank.addCliente(pj1);
        maryBank.addCliente(pj2);

        Cliente rodrigo = pj1;
        Cliente leon = new PessoaFisica();

    }
}
