import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber os dados via terminal
        Scanner scanner = new Scanner(System.in);
        // Permite definir um bloco de código para ser testado quanto a erros enquanto está sendo executado
        try {
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

            // Bloco de código que captura as exceções que podem acontecer
        } catch (InputMismatchException e) {
            System.out.println("Erro: Tipo de dado inválido inserido. Certifique-se de digitar um número onde for solicitado.");
            scanner.nextLine(); // Limpar o buffer após erro de entrada
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato de número inválido. Por favor, insira um número válido.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } 
            // Fechando o Scanner
            scanner.close();
            }
}

