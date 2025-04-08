public class Main {
    public static void main(String[] args) {
        Utilizador utilizador1 = new Utilizador("Diogo Gaspar", "diogo@example.com", "diogo123");
        utilizador1.adicionarConta("Conta Poupança", 1000.0f);
        utilizador1.adicionarConta("Conta Corrente", 0.0f);

        Utilizador utilizador2 = new Utilizador("João Costa", "joao@example.com", "joao123");
        utilizador2.adicionarConta("Conta Salário", 2000.0f);
        utilizador2.adicionarConta("Conta Investimento", 0.0f);
        utilizador2.adicionarConta("Conta Poupança", 1500.0f);

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
