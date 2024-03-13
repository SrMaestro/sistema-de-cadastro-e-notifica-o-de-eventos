import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Chama o método lerDados() que retorna um objeto Usuario preenchido
            Usuario novoUsuario = Usuario.lerDados();

            // Adiciona o novo usuário à lista
            listaUsuarios.add(novoUsuario);

            //Estrutura para encerrar o interação com o usuario
            System.out.println("Deseja adicionar outro usuário? (S/N)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        for (Usuario usuario : listaUsuarios) {
            usuario.imprimirDados();
            System.out.println();
        }

        System.out.println(listaUsuarios);
    }
}
