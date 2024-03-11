import java.util.Scanner;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String tel;
    private String email;


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

    public void setEmail(String email) {
        this.email = email;
    }

    public String lerNome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome :");
         this.nome = scanner.nextLine();

        System.out.println(nome);

        return nome;
    }
}
