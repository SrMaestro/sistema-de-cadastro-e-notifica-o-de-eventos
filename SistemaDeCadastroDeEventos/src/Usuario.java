import java.util.Scanner;

public class Usuario {

    private static int proximoId = 1; // contador para atribuir IDs únicos
    private int id;
    private String nome;
    private String sobrenome;
    private String tel;
    private String email;

    // Construtor privado para impedir a criação de objetos sem chamar o método lerDados()




    public Usuario() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tel = tel;
        this.email = email;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Usuario.proximoId = proximoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo para ler os dados do usuario e preencher os atributos
    public static Usuario lerDados() {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        // Atribuir ID único ao usuário
        usuario.setId(proximoId++);

        System.out.println("Digite seu nome:");
        usuario.setNome(scanner.nextLine());

        System.out.println("Digite seu sobrenome:");
        usuario.setSobrenome(scanner.nextLine());

        System.out.println("Digite seu telefone:");
        usuario.setTel(scanner.nextLine());

        System.out.println("Digite seu email:");
        usuario.setEmail(scanner.nextLine());

        return usuario;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + tel);
        System.out.println("Email: " + email);
    }




}
