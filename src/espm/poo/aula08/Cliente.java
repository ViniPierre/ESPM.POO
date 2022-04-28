package src.espm.poo.aula08;

public class Cliente implements Usuario {

    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String getUsername() {
        return "cli." + nome.toLowerCase();
    }

    @Override
    public boolean autenticar(String senha) {
        return ( "" + nome.charAt(0) + nome.charAt(nome.length() - 1)).equals(senha);
    }
}