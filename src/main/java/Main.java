import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Cria um utilizador e adciona duas contas a esse mesmo utilizador
        Utilizador utilizador1 = new Utilizador("Diogo Gaspar", "diogo@example.com", "diogo123");
        utilizador1.adicionarConta("Conta Poupança", 1000.0f);
        utilizador1.adicionarConta("Conta Corrente", 0.0f);

        // Cria um segundo utilizador e adciona três contas a esse mesmo utilizador
        Utilizador utilizador2 = new Utilizador("João Costa", "joao@example.com", "joao123");
        utilizador2.adicionarConta("Conta Salário", 2000.0f);
        utilizador2.adicionarConta("Conta Investimento", 0.0f);
        utilizador2.adicionarConta("Conta Poupança", 1500.0f);

        // Obtem uma conta especifica com base no nome
        Conta contaCorrente = utilizador1.getContaPorNome("Conta Corrente");
        if (contaCorrente != null) {
            // Se essa conta existir, adiciona uma transação a essa conta
            contaCorrente.adicionarTransacao(0.0f, "Lazer", new Date(), TipoTransacao.DESPESA);
        }

        // Mostra alguns dados sobre os utilizadores e as suas contas
        for (Utilizador utilizador : new Utilizador[]{utilizador1, utilizador2}) {
            System.out.println("\n");
            System.out.println("Utilizador: " + utilizador.getNome());
            System.out.println("Email: " + utilizador.getEmail());
            System.out.println("Contas:");
            for (Conta conta : utilizador.getContas()) {
                System.out.println(" - " + conta.getNome() + " (ID: " + conta.getId() + ", Saldo: " + conta.getSaldo() + ")");
            }
        }
    }
}
