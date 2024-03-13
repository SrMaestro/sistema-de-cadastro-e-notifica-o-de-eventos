import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Evento> listaEventos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o que deseja fazer:");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Adicionar evento");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha) {
                case 1:
                    // Adicionar um novo usuário
                    Usuario novoUsuario = Usuario.lerDados();
                    listaUsuarios.add(novoUsuario);
                    break;
                case 2:
                    // Adicionar um novo evento
                    Evento novoEvento = Evento.cadastrarEvento();
                    listaEventos.add(novoEvento);
                    break;
                case 3:
                    // Encerrar o programa
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            //Estrutura para encerrar a interação com o usuário
            System.out.println("Deseja realizar outra operação? (S/N)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        // Imprimir os usuários cadastrados
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : listaUsuarios) {
            usuario.imprimirDados();
            System.out.println();
        }

        // Imprimir os eventos cadastrados
        System.out.println("Eventos cadastrados:");
        for (Evento evento : listaEventos) {
            evento.imprimirDados();
            System.out.println();
        }
    }
    }
