package src.espm.poo.ex2;

import java.util.List;
import java.util.ArrayList;

public class Banco {
    
    private String nome;

    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco (String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void add(Cliente c) {
        this.clientes.add(c);
        this.contas.add(c.getConta());
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
    return clientes;

    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
