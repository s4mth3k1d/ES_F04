public class Conta {
    private String id;
    private String nome;
    private float saldo;
    private String idUtilizador;


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

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getIdUtilizador() {
        return idUtilizador;
    }

    public void adicionarMeta() {
        // Lógica para adicionar a conta
    }

    public void adicionarTransacao() {
        // Lógica para adicionar a transação
    }

    public void gerarRelatorio() {
        // Lógica para gerar o relatório
    }
}
