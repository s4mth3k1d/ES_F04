import java.util.Date;

public class Transacao {
    private String id;
    private float valor;
    private Date data;
    // Uma única transação só pode ser possuída por uma conta
    private String contaId;
    private String categoriaId;
    // Uma transação deve ter de um tipo específico (despesa, receita)
    private TipoTransacao tipoTransacao;

    public Transacao(String id, float valor, Date data, String contaId, String categoriaId, TipoTransacao tipoTransacao) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.contaId = contaId;
        this.categoriaId = categoriaId;
        this.tipoTransacao = tipoTransacao;
    }

    // Obtem o id da transação
    public String getId() {
        return id;
    }

    // Obtem o valor da transação
    public float getValor() {
        return valor;
    }

    // Obtem a data da transação
    public Date getData() {
        return data;
    }

    // Obtem o id da conta que detem a transação
    public String getContaId() {
        return contaId;
    }

    // Obtem a categoria da transação
    public String getCategoriaId() {
        return categoriaId;
    }

    // Obtem o tipo de transação
    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }
}
