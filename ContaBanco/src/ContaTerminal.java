import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        // Criando o objeto Scanner para receber os dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados numero da conta
        System.out.println("Por favor, digite o número da Conta (exemplo: 0000):");
        int numero = scanner.nextInt();

        // Consumindo a linha pendente deixada pelo nextInt
        scanner.nextLine();

        // Solicitando os dados da agencia da conta
        System.out.println("Por favor, digite o número da Agência (exemplo: 000-0):");
        String agencia = scanner.nextLine();
       
        // Solicitando o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando o saldo
        System.out.println("Por favor, digite o saldo (exemplo: 100,00):");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final de conta criada utilizando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}
