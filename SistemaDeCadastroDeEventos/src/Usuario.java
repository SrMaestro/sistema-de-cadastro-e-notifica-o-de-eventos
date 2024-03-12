import java.util.Scanner;

public class Usuario {
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

    // Construtor privado para impedir a criação de objetos sem chamar o método lerDados()
    //private Usuario() {}


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

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo para ler os dados do usuario e preencher os atributos
    public static Usuario lerDados() {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite seu nome:");
        usuario.nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        usuario.sobrenome = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        usuario.tel = scanner.nextLine();

        System.out.println("Digite seu email:");
        usuario.email = scanner.nextLine();

        return usuario;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + tel);
        System.out.println("Email: " + email);
    }




}
