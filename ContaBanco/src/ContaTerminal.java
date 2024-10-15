import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber os dados via terminal
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        // Solicitação do número da conta (com tratamento de exceção)
        boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o número da Conta (exemplo: 0000):");
                numero = scanner.nextInt();
                inputValido = true;
                scanner.nextLine(); // Consumir o newline deixado pelo nextInt
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido para a conta.");
                scanner.nextLine(); // Limpar o buffer e tentar novamente
            }
        }

        // Solicitação do número da agência (com validação de formato)
        inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o número da Agência (exemplo: 000-0):");
                agencia = scanner.nextLine();

                // Validar o formato da agência: três dígitos, um hífen e um dígito (000-0)
                if (agencia.matches("\\d{3}-\\d{1}")) {
                    inputValido = true;
                } else {
                    System.out.println("Erro: O número da agência deve estar no formato 000-0. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida para a agência. Tente novamente.");
            }
        }

        // Solicitação do nome do cliente
        inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o nome do Cliente:");
                nomeCliente = scanner.nextLine();
                inputValido = true;
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida para o nome do cliente. Tente novamente.");
            }
        }

        // Solicitação do saldo (com tratamento de exceção)
        inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o saldo (exemplo: 100,00):");
                saldo = scanner.nextDouble();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Formato inválido para o saldo. Digite um número decimal.");
                scanner.nextLine(); // Limpar o buffer e tentar novamente
            }
        }

        // Exibindo a mensagem final de conta criada com sucesso utilizando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}
