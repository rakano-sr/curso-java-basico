import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declarando as variáveis
        String conta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        // Estanciando o objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicitando os dados do usuário
        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        conta = entrada.nextLine();
        entrada.nextLine();  // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = entrada.nextDouble();
        System.out.println();

        // Exibindo os dados da conta
        String saudacao = "Olá ".concat(nomeCliente);
        String agenciaString = saudacao.concat(", obrigado por criar uma conta em nosso banco. Sua agência é ").concat(agencia);
        String contaString = agenciaString.concat(", conta ").concat(String.format(conta));
        String saldoString = contaString.concat(" e seu saldo ").concat(String.format("%.2f", saldo));
        String mensagemFinal = saldoString.concat(" já está disponível para saque.");

        // Exibindo a mensagem final
        System.out.println(mensagemFinal);

        // Fechando o scanner
        entrada.close();
    }
}
