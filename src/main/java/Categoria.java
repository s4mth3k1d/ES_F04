public class Categoria {
    private String id;
    private String nome;
    private TipoTransacao tipo;
    private String descricao;

    public Categoria(String id, String nome, TipoTransacao tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // Obtem o id da categoria
    public String getId() {
        return id;
    }

    // Obtem o nome da categoria
    public String getNome() {
        return nome;
    }

    // Obtem o tipo de transacao da categoria
    public TipoTransacao getTipo() {
        return tipo;
    }

    // Obtem a descricao da categoria
    public String getDescricao() {
        return descricao;
    }

    // Obtem categoria com base no id
    public Categoria getCategoriaPorId(String id) {
        if (this.id.equals(id)) {
            return this;
        }
        return null;
    }
}
