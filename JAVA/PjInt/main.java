public class Main {
    public static void main(String[] args) {
        // Criando uma instância de ContaCorrente
        ContaCorrente conta = new ContaCorrente(12345, "João da Silva");
        String token = conta.gerarToken();
        System.out.println("Valor do token para as proximas ações: " +token);

        // Imprimindo os atributos da conta
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Titular da conta: " + conta.getTitular());

        // Pedindo ao usuário para fornecer o novo número da conta e o novo nome do titular
        Scanner scanner = new Scanner(System.in);
        System.out.print("Novo número da conta: ");
        int novoNumero = scanner.nextInt();
        System.out.print("Novo nome do titular: ");
        scanner.nextLine(); // consumindo a quebra de linha após o nextInt()
        String novoTitular = scanner.nextLine();

        // Pedindo ao usuário para fornecer o token para autenticação
        System.out.print("Digite o token para autenticação: ");
        token = scanner.nextLine();

        // Atualizando a conta com o novo número e titular, usando o token para autenticação
        conta.atualizarConta(novoNumero, novoTitular, token);

        // Imprimindo os atributos atualizados da conta
        System.out.println("Número da conta atualizado: " + conta.getNumero());
        System.out.println("Titular da conta atualizado: " + conta.getTitular());
    }
}
