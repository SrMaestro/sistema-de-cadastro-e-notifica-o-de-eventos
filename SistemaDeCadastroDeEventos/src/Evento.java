import java.time.LocalTime;
import java.util.Scanner;

public class Evento {

    // nome, endereço, categoria, horário e descrição
    private String nome;
    private String endereco;
    private String categoria;
    private LocalTime horario;
    private String descricao;


    public Evento(String nome, String endereco, String categoria, LocalTime horario, String descricap) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getDescricap() {
        return descricao;
    }

    public void setDescricap(String descricap) {
        this.descricao = descricap;
    }

    // Método para cadastrar um evento
    public static Evento cadastrarEvento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do evento:");
        String nome = scanner.nextLine();

        System.out.println("Endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Escolha uma categoria:");
        System.out.println("1. Festa");
        System.out.println("2. Esporte");
        System.out.println("3. Show");
        System.out.print("Opção: ");
        int categoriaOpcao = scanner.nextInt();
        scanner.nextLine();

        String categoria;

        //festas, eventos esportivos, shows
        switch (categoriaOpcao) {
            case 1:
                categoria = "Festa";
                break;
            case 2:
                categoria = " Esporte";
                break;
            case 3:
                categoria = "Show";
                break;
            default:
                categoria = "Categoria Desconhecida";
                System.out.println("Opção inválida! Categoria definida como 'Categoria Desconhecida'.");
        }

        System.out.println("Horário (formato HH:MM):");
        String horarioStr = scanner.nextLine();
        LocalTime horario = LocalTime.parse(horarioStr);

        System.out.println("Descrição:");
        String descricao = scanner.nextLine();



        return new Evento(nome, endereco, categoria, horario, descricao);
    }

    // Método para imprimir os dados do evento
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Horário: " + horario);
        System.out.println("Descrição: " + descricao);
    }

}
