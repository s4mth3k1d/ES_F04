import java.util.LinkedList;
import java.util.UUID;

public class Utilizador {
    private String id;
    private String nome;
    private String email;
    private String senha;
    // Um utilizador pode ter várias contas
    private LinkedList<Conta> contas;

    public Utilizador(String nome, String email, String senha) {
        this.id = IdGenerator.generateId();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.contas = new LinkedList<>();
    }

    // Obtem o id do utilizador
    public String getId() {
        return id;
    }

    // Obtem o nome do utilizador
    public String getNome() {
        return nome;
    }

    // Obtem o email do utilizador
    public String getEmail() {
        return email;
    }

    // Obtem a senha do utilizador
    public String getSenha() {
        return senha;
    }

    // Obtem contas que o utilizador possui
    public LinkedList<Conta> getContas() {
        return contas;
    }

    // Adiciona uma nova conta ao utilizador
    public void adicionarConta(String nome, float saldo) {
        String randomId = IdGenerator.generateId();
        Conta novaConta = new Conta(randomId, nome, saldo, this.id);
        contas.add(novaConta);
    }

    // Obtem uma conta pelo seu nome
    public Conta getContaPorNome(String nomeConta) {
        for (Conta conta : contas) {
            if (conta.getNome().equalsIgnoreCase(nomeConta)) {
                return conta;
            }
        }
        return null;
    }
}
