import java.util.Date;
import java.util.LinkedList;

public class Conta {
    private String id;
    private String nome;
    private float saldo;
    // Uma conta só pode ser possuia por um utilizador
    private String idUtilizador;
    // Uma conta pode ter várias transações
    private LinkedList<Transacao> transacoes = new LinkedList<>();


    public Conta(String id, String nome, String idUtilizador) {
        this.id = id;
        this.nome = nome;
        this.saldo = 0.0f;
        this.idUtilizador = idUtilizador;
    }

    public Conta(String id, String nome, float saldo, String idUtilizador) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.idUtilizador = idUtilizador;
    }

    // Obtem o id da conta
    public String getId() {
        return id;
    }

    // Obtem o nome da conta
    public String getNome() {
        return nome;
    }

    // Obtem o saldo da conta
    public float getSaldo() {
        return saldo;
    }

    // Obtem o id do utilizador que possui a conta
    public String getIdUtilizador() {
        return idUtilizador;
    }

    // Adiciona uma meta à conta
    public void adicionarMeta() {
        // Lógica para adicionar a conta
    }

    // Adiciona uma transação à conta
    public void adicionarTransacao(float valor, String categoriaId, Date data, TipoTransacao tipo) {
        String randomId = IdGenerator.generateId();
        Transacao novaTransacao = new Transacao(randomId, valor, data, this.id, categoriaId, tipo);
        transacoes.add(novaTransacao);
        this.saldo += valor; // Atualiza o saldo da conta
    }

    // Gera um relatório com as transações da conta
    public void gerarRelatorio() {
        // Lógica para gerar o relatório
    }
}
