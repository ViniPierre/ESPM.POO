package src.espm.poo.aula08;

import java.util.ArrayList;
import java.util.List;

public class MainAuth {

    public static void main(String[] args) {
        
        Cliente vini = new Cliente("Vini");
        Funcionario func1 = new Diretor(10);
        Diretor dir = new Diretor(20);
        Usuario usu1 = new Cliente("Rodrigo");

        List<Usuario> lista = new ArrayList<>();
        lista.add(vini);
        lista.add(dir);
        lista.add((Usuario) func1);
        lista.add(usu1);

        for (Usuario u: lista) {
            System.out.println(u.getUsername());
        }
    }
    
}
