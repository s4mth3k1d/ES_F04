import java.util.LinkedList;
import java.util.UUID;

public class Utilizador {
    private String id;
    private String nome;
    private String email;
    private String senha;
    private LinkedList<Conta> contas;

    public Utilizador(String nome, String email, String senha) {
        this.id = IdGenerator.generateId();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.contas = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LinkedList<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(String nome, float saldo) {
        String randomId = IdGenerator.generateId();
        Conta novaConta = new Conta(randomId, nome, saldo, this.id);
        contas.add(novaConta);
    }
}
