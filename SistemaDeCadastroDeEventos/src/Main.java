import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Cria uma lista para armazenar usuarios

        List<Usuario> listaPessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Loop para adicionar pessoas a lista

        while (true){
            Usuario usuario = new Usuario();
            usuario.lerDados(); // Le os dados do usuario e preenche o objeto

            listaPessoas.add(usuario); // Adicionando o objeto Pessoa a lista
            break;

        }

        //imprima os dados de todas a pessoas da lista
        for (Usuario usuario : listaPessoas) {
            usuario.imprimirDados(); // Imprime os dados da pessoa
            System.out.println(); // Adiciona uma linha em branco entre cada pessoa
        }

        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.println("ID: " + i);
            listaPessoas.get(i).imprimirDados(); // Imprime os dados do usuário
            System.out.println(); // Adiciona uma linha em branco entre cada usuário
        }


    }
}
